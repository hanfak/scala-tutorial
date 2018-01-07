package com.hanfak.chap03.tut05

object FunctionImplicitParams extends App {
//the totalCost() function will require an implicit value of type Double to be in scope
  def totalCost(itemType: String, quantity: Int)(implicit discount: Double): Double = {
    println(s"Calculating the price for $quantity $itemType")
    2.50 * quantity * (1 - discount)
  }

  //If there are no implicit values in scope, you will get a compiler error.
  //Similar to fields in java
  implicit val discount: Double = 0.1 // will accessed by totalCost()

  //You did not have to manually pass-through the discount value when calling the totalCost() function.
  println(s"""Total cost with discount of 5 books = ${totalCost("Books", 5)}""")
  println("\nManaually passing through implicit")
  println(s"""Total cost with discount of 5 books = ${totalCost("Books", 5)(0.2)}""")


}
