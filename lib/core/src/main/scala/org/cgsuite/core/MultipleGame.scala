package org.cgsuite.core

import org.cgsuite.dsl._

case class MultipleGame(n: Integer, g: Game) extends Game {

  assert(n > zero)

  override def unary_- = MultipleGame(n, -g)
  def options(player: Player) = {
    g.options(player) map { go => (n - one) * g + go }
  }

}
