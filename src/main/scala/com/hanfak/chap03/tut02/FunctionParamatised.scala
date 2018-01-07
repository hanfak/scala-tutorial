package com.hanfak.chap03.tut02

object FunctionParamatised extends App {

  def calculateTotalIncludingTax(preTaxAmount: Int): Double = {
    preTaxAmount * 1.175
  }

  println(calculateTotalIncludingTax(100))

  println("Overiding a method with different parameter type")

  def calculateTotalIncludingTax(preTaxAmount: Double): Double = {
    preTaxAmount * 1.175
  }

  val example = calculateTotalIncludingTax(9.99) // Should define type of val
  println(f"Using double in argument: $example%.2f")
  println(f"Using double in argument, no rounding: $example")

  println("\nDefaulting params")

  //Limit your use of defaulting parameters for simple cases only.
  def calculateTotalIncludingTax2(preTaxAmount: Double, taxCode: String = "XXXXT"): Double = {
    println(s"The tax code used is '$taxCode'")
    preTaxAmount * 1.175
  }

  println(f"Using default in argument: ${calculateTotalIncludingTax2(5.86)}%.2f")
  println(f"Not using default in argument: ${calculateTotalIncludingTax2(5.86, "YYYYT")}%.2f")



}
