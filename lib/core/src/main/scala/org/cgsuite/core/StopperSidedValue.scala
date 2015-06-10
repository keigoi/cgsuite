package org.cgsuite.core

import org.cgsuite.exception.InputException


object StopperSidedValue {

  def apply(onside: CanonicalStopper, offside: CanonicalStopper): StopperSidedValue = {
    if (onside == offside) {
      onside
    } else if (offside <= onside) {
      StopperSidedValueImpl(onside, offside)
    } else {
      throw InputException("offside is not <= onside.")
    }
  }

}

trait StopperSidedValue extends SidedValue {

  def unary_+ : StopperSidedValue = this

  def unary_- : StopperSidedValue = StopperSidedValue(-offside, -onside)

  def +(that: StopperSidedValue) = StopperSidedValue(onside upsum that.onside, offside downsum that.offside)

  def -(that: StopperSidedValue) = this + (-that)

  def <=(that: StopperSidedValue): Boolean = onside <= that.onside && offside <= that.offside

  override def isStopper = onside == offside

  override def isStopperSided = true

  def offside: CanonicalStopper

  def onside: CanonicalStopper

}

case class StopperSidedValueImpl(onside: CanonicalStopper, offside: CanonicalStopper) extends StopperSidedValue {

  assert(!isStopper)

}
