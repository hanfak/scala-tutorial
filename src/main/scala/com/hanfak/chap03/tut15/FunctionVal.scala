package com.hanfak.chap03.tut15

object FunctionVal extends App {
  // create value functions which are defined using the val keyword as opposed to using the def keyword.
  def totalCostWithDiscountFunctionParameter(itemType: String)(quantity: Int)(applyDiscount: Double => Double): Double = {
    println(s"Calculating total cost for $quantity $itemType")
    val totalCost = 2.50 * quantity
    applyDiscount(totalCost)
  }

  def applyDiscount(totalCost: Double): Double = {
    val discount = 2 // assume you fetch discount from database
    totalCost - discount
  }

  println(s"Total cost of 5 Books with discount def function = ${totalCostWithDiscountFunctionParameter("Book")(5)(applyDiscount(_))}") // Old way
  println(s"Total cost of 5 Books with discount def function = ${totalCostWithDiscountFunctionParameter("Book")(5)(applyDiscount)}")


// No return type specified, done via type inference
  val applyDiscountValueFunction = (totalCost: Double) => {
    val discount = 1.5 // assume you fetch discount from database
    totalCost - discount
  }
  println(s"Total cost of 5 Books with discount val function = ${totalCostWithDiscountFunctionParameter("Book")(5)(applyDiscountValueFunction)}")

  val applyDiscountValueFunctionWithReturnType: Double => Double = totalCost => {
    val discount = 1.5 // assume you fetch discount from database
    totalCost - discount
  }
  println(s"Total cost of 5 Books with discount val function = ${totalCostWithDiscountFunctionParameter("Book")(5)(applyDiscountValueFunctionWithReturnType)}")
}
