package org.cgsuite.core

import org.cgsuite.core.misere.{MisereCanonicalGame, MisereValues}
import org.cgsuite.exception.NotShortGameException
import org.cgsuite.util.TranspositionTable

import scala.collection.mutable

private[core] trait LoopfreeReducer[G <: Game, O, T] {

  private val visitorCache = mutable.Set[Game]()

  def zero: T

  def plus(a: T, b: T): T

  def construct(opts: O): T

  def loopyExceptionMsg: String

  def makeOptions(g: G, tt: TranspositionTable[T], visited: mutable.Set[Game]): O

  def reduce(g: G, tt: TranspositionTable[T]): T = {
    visitorCache.clear()
    reduce(g, tt, visitorCache)
  }

  def reduce(g: G, tt: TranspositionTable[T], visited: mutable.Set[Game]): T = {

    val decomp = g.decomposition
    if (decomp.size == 1 && decomp.head == this) {
      reduce2(g, tt, visited)
    } else {
      var result: T = zero
      val it = decomp.iterator
      while (it.hasNext) {
        val component = it.next() match {
          // TODO Is this unchecked match really the right thing to do?
          case g: G @unchecked => reduce2(g, tt, visited)
        }
        result = plus(result, component)
      }
      result
    }

  }

  private def reduce2(g: G, tt: TranspositionTable[T], visited: mutable.Set[Game]): T = {

    tt.get(g) match {
      case Some(x) => x
      case None if !visited.contains(g) =>
        visited += g
        try {
          val opts = makeOptions(g, tt, visited)
          val result = construct(opts)
          tt.put(g, result)
          result
        } finally {
          visited -= g
        }
      case _ =>
        throw NotShortGameException(loopyExceptionMsg)
    }

  }

}

private[core] trait PartizanLoopfreeReducer[T] extends LoopfreeReducer[Game, (Iterable[T], Iterable[T]), T] {

  override def makeOptions(g: Game, tt: TranspositionTable[T], visited: mutable.Set[Game]): (Iterable[T], Iterable[T]) = {

    val lo = g options Left map { reduce(_, tt, visited) }
    val ro = g options Right map { reduce(_, tt, visited) }
    (lo, ro)

  }

}

private[core] trait ImpartialLoopfreeReducer[T] extends LoopfreeReducer[ImpartialGame, Iterable[T], T] {

  override def makeOptions(g: ImpartialGame, tt: TranspositionTable[T], visited: mutable.Set[Game]): Iterable[T] = {

    g.options map { reduce(_, tt, visited) }

  }

}

private[core] case object CanonicalShortGameReducer extends PartizanLoopfreeReducer[CanonicalShortGame] {

  override def zero = Values.zero

  override def plus(a: CanonicalShortGame, b: CanonicalShortGame) = a + b

  override def construct(opts: (Iterable[CanonicalShortGame], Iterable[CanonicalShortGame])): CanonicalShortGame = {
    val (lo, ro) = opts
    CanonicalShortGame(lo, ro)
  }

  override def loopyExceptionMsg = s"That is not a short game. If that is intentional, try `GameValue` in place of `CanonicalForm`."

}

private[core] case object NimValueReducer extends ImpartialLoopfreeReducer[Int] {

  override def zero = 0

  override def plus(a: Int, b: Int) = a ^ b

  override def construct(opts: Iterable[Int]): Int = ImpartialGame.mex(opts)

  override def loopyExceptionMsg = s"That is not a short game. If that is intentional, try `GameValue` in place of `NimValue`."

}

private[core] case object MisereCanonicalGameReducer extends ImpartialLoopfreeReducer[MisereCanonicalGame] {

  override def zero = MisereValues.zero

  override def plus(a: MisereCanonicalGame, b: MisereCanonicalGame) = a + b

  override def construct(opts: Iterable[MisereCanonicalGame]) = MisereCanonicalGame(opts.toSeq : _*)

  override def loopyExceptionMsg = s"That is not a short game."

}
