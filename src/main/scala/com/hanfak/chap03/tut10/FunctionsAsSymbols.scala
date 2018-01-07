package com.hanfak.chap03.tut10

object FunctionsAsSymbols extends App {
  //building block when you have to create Domain Specific Language syntax.
  //Creating object with beh and properties

  class ItemCostCalculator {

    // We are hard-coding the totalCost value for simplicity.
    val totalCost = 100

    def minusDiscount(discount: Double): Double = {
      totalCost - discount
    }

    def -(discount: Double): Double = { //function name is a symbol
      totalCost - discount
    }

    // Should use symbols which is specific to the domain
    def +++(taxAmount: Double): Double = {
      totalCost + taxAmount
    }
  }

  val itemCostCalculator = new ItemCostCalculator()

  println(s"Calling minusDiscount() function = ${itemCostCalculator.minusDiscount(10.5)}")
  println(s"Calling function - = ${itemCostCalculator.-(10.5)}")
  // no need to use the .
  println(s"Calling function - with operator style notation = ${itemCostCalculator - 10.5}")



}
