/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cgsuite.core

object RationalNumber {
  
  def apply(numerator: Integer, denominator: Integer): RationalNumber = {

    (numerator, denominator) match {
      case (_, ZeroImpl) => RationalNumberImpl(numerator.sign, denominator)
      case (ZeroImpl, _) => ZeroImpl
      case _ =>
        val gcd = numerator gcd denominator
        val newNumerator = (numerator div gcd) * denominator.sign
        val newDenominator = (denominator div gcd) * denominator.sign
        if (newDenominator == Values.one) {
          newNumerator
        } else if (newDenominator.isTwoPower) {
          DyadicRationalNumberImpl(newNumerator, newDenominator)
        } else {
          RationalNumberImpl(newNumerator, newDenominator)
        }
    }
    
  }
  
  def apply(numerator: Int, denominator: Int): RationalNumber = {
    apply(SmallInteger(numerator), SmallInteger(denominator))
  }
  
}

trait RationalNumber extends Game with Ordered[RationalNumber] {
  
  def numerator: Integer
  def denominator: Integer
  
  override def options(player: Player): Iterable[Game] = sys.error("cannot get options for non-dyadic rational")

  def compare(other: RationalNumber): Int = (numerator * other.denominator).compare(denominator * other.numerator)
  
  override def unary_- : RationalNumber = RationalNumber(numerator, -denominator)

  def +(other: RationalNumber): RationalNumber = RationalNumber(
    numerator * other.denominator + denominator * other.numerator,
    denominator * other.denominator
    )
    
  def -(other: RationalNumber): RationalNumber = RationalNumber(
    numerator * other.denominator - denominator * other.numerator,
    denominator * other.denominator
  )
  
  def *(other: RationalNumber): RationalNumber = RationalNumber(
    numerator * other.numerator,
    denominator * other.denominator
  )
  
  def /(other: RationalNumber): RationalNumber = RationalNumber(
    numerator * other.denominator,
    denominator * other.numerator
  )

  def %(other: RationalNumber): RationalNumber = RationalNumber(
    (numerator * other.denominator) % (denominator * other.numerator),
    denominator * other.denominator
  )

  def min(other: RationalNumber) = if (this < other) this else other
  def max(other: RationalNumber) = if (this > other) this else other
  def mean(other: RationalNumber) = (this + other) / Values.two

  def pow(other: Integer): RationalNumber = {
    if (other >= Values.zero) {
      RationalNumber(numerator.pow(other), denominator.pow(other))
    } else {
      RationalNumber(denominator.pow(-other), numerator.pow(-other))
    }
  }

  def isDyadic = denominator.isTwoPower
  def isInteger = (denominator == Values.one)
  def isInfinite = (denominator == Values.zero)

  def abs: RationalNumber = RationalNumber(numerator.abs, denominator)
  def floor: Integer = {
    if (numerator >= Values.zero)
      numerator div denominator
    else
      ceiling - Values.one
  }
  def ceiling: Integer = {
    if (numerator <= Values.zero)
      numerator div denominator
    else
      floor + Values.one
  }
  
  def step(n: Int): RationalNumber = step(SmallInteger(n))
  def step(n: Integer): RationalNumber = RationalNumber(numerator + n, denominator)

  override def toString: String = numerator.toString + "/" + denominator.toString
  
}

case class RationalNumberImpl(numerator: Integer, denominator: Integer) extends RationalNumber {

  assert(!isDyadic)
  
}
