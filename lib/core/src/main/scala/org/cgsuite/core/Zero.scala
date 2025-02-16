/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cgsuite.core

object Zero {
  
  def apply(): Zero = ZeroImpl
  
}

trait Zero extends SmallInteger with Nimber {
  
  override val intValue = 0
  override val nimValue = this
  override val intNimValue = 0

  override def isZero = true

  override lazy val gameId = CanonicalShortGameOps.ZERO_ID
  override def numberPart = Values.zero
  override def nimberPart = 0
  override def uptimalLength = 0
  override def uptimalCoefficient(n: Int) = 0

  override def unary_+ = this
  override def unary_- = this

  override def options(player: Player): Iterable[Nothing] = Set.empty
  override def options: Iterable[Nothing] = Set.empty

  override def toString = "0"

}

case object ZeroImpl extends Zero
