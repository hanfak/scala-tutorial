package com.hanfak.chap03.tut16

object FunctionComposition extends App {
  // Val functions inherit the andThen function and we will show how to use the andThen function to compose two functions together.
  //Mathematically speaking, f(x) andThen g(x) = g(f(x)).
  // The results of the first function f(x) is ran first and will be passed as input to the second function g(x).



//  f(x) andThen g(x) = g(f(x)).
  val totalCost: Double = 10

  val applyDiscountValFunction = (amount: Double) => {
    println("Apply discount function")
    val discount = 2 // fetch discount from database
    amount - discount
  }

  println(s"Total cost of 5 items with discount = ${applyDiscountValFunction(totalCost)}")

 println("\nApply composition")
  val applyTaxValFunction = (amount: Double) => {
    println("Apply tax function")
    val tax = 1 // fetch tax from database
    amount + tax
  }

  // andThen: f(x) andThen g(x) = g(f(x))
  // andThen semantics to apply discount andThen apply tax to the totalCost
  println(s"Total cost of 5 books = ${(applyDiscountValFunction andThen applyTaxValFunction) (totalCost)}")

}
