package org.cgsuite.lang

import org.cgsuite.lang

object CollectionTestCase {

  val instances = Seq(

    CollectionTestCase(
      "[]", "[]",
      exists = "false",
      forall = "true",
      head = "!!That `Collection` is empty.",
      isEmpty = "true",
      max = "!!That `Collection` is empty.",
      mex = "0",
      min = "!!That `Collection` is empty.",
      size = "0",
      sum = "!!That `Collection` is empty.",
      tail = "!!That `Collection` is empty.",
      toList = "[]",
      toSet = "{}"
    ),

    CollectionTestCase(
      "[0,1,3,9,7,5]", "[0,1,3,9,7,5]",
      exists = "true",
      forall = "false",
      head = "0",
      isEmpty = "false",
      max = "9",
      mex = "2",
      min = "0",
      size = "6",
      sum = "25",
      tail = "[1,3,9,7,5]",
      toList = "[0,1,3,9,7,5]",
      toSet = "{0,1,3,5,7,9}"
    ),

    CollectionTestCase(
      """["Winning", "Ways", "Mathematical", "Plays"]""", """["Winning","Ways","Mathematical","Plays"]""",
      exists = "false",
      forall = "false",
      head = "\"Winning\"",
      isEmpty = "false",
      max = "\"Winning\"",
      mex = "0",
      min = "\"Mathematical\"",
      size = "4",
      sum = "\"WinningWaysMathematicalPlays\"",
      tail = """["Ways","Mathematical","Plays"]""",
      toList = """["Winning","Ways","Mathematical","Plays"]""",
      toSet = """{"Mathematical","Plays","Ways","Winning"}"""
    )

  )

}

case class CollectionTestCase(
  x: String,
  xOut: String,
  exists: String,
  forall: String,
  head: String,
  isEmpty: String,
  max: String,
  mex: String,
  min: String,
  size: String,
  sum: String,
  tail: String,
  toList: String,
  toSet: String
  ) {

  def toTests = Seq(
    (x, xOut),
    (s"($x).Exists(x -> x == 7)", exists),
    (s"($x).ForAll(x -> x == 7)", forall),
    (s"($x).Head", head),
    (s"($x).IsEmpty", isEmpty),
    (s"($x).Max", max),
    (s"Max($x)", max),
    (s"($x).Mex", mex),
    (s"Mex($x)", mex),
    (s"($x).Min", min),
    (s"Min($x)", min),
    (s"($x).Size", size),
    (s"($x).Sum", sum),
    (s"Sum($x)", sum),
    (s"($x).Tail", tail),
    (s"($x).ToList", toList),
    (s"($x).ToSet", toSet)
  ) map { case (expr, result) => (expr, expr, result) }

}
