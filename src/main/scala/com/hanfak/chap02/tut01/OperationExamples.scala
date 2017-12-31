package com.hanfak.chap02.tut01

object OperationExamples extends App {
  var number = 1 // Avoid using var
  val immutableNumber: Int = 2
  lazy val donutService = "initialize some donut service" //Type inference
  lazy val numberTwo: Int = 3 + 2

  println("mutable number " + number)
  number = number + 1
  println("Change mutable number " + number)
  println("Change mutable number, inlining var becomes string " + number + 1)
  println("immutable number " +immutableNumber)
//  immutableNumber = immutableNumber + 1  // compile error
  println("Lazy initialization " + numberTwo + 3)

  //Types

  val donutsBought: Int = 5
  val bigNumberOfDonuts: Long = 100000000L
  val smallNumberOfDonuts: Short = 1
  val priceOfDonut: Double = 2.50
  val donutPrice: Float = 2.50f
  val donutStoreName: String = "allaboutscala Donut Store"
  val donutByte: Byte = 0xa
  val donutFirstLetter: Char = 'D'
  val nothing: Unit = () // Similar to void

}
