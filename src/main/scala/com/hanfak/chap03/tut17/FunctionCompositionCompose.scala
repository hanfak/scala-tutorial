package com.hanfak.chap03.tut17

object FunctionCompositionCompose extends App {

  val totalCost: Double = 10

  val applyDiscountValFunction = (amount: Double) => {
    println("Apply discount function")
    val discount = 2 // fetch discount from database
    amount - discount
  }

  val applyTaxValFunction = (amount: Double) => {
    println("Apply tax function")
    val tax = 1 // fetch tax from database
    amount + tax
  }

  //alling compose will take the result from the second function and pass it as input parameter to the first function.
  // the compose semantics to apply tax first and afterwards apply discount to the totalCost

  // compose: f(x) compose g(x) = f(g(x))
  //The apply tax function was called first following which the apply discount function was called.
  println(s"Total cost of 5 items = ${(applyDiscountValFunction compose applyTaxValFunction) (totalCost)}")


}
