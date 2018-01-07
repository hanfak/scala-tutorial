package com.hanfak.chap03.tut11

object FunctionCurryingWithParamGroup extends App {
  // Functions defined with parameter groups are also commonly referred to as curried functions.
  def totalCost(itemType: String)(quantity: Int)(discount: Double): Double = {
    println(s"Calculating total cost for $quantity $itemType with ${discount * 100}% discount")
    val totalCost = 2.50 * quantity
    totalCost - totalCost * discount
  }

  println(s"Total cost = ${totalCost("Book")(10)(0.1)}")

  //application of curried function is to be a building block where you can reuse functions by creating partial functions.
  val totalCostForBooks = totalCost("Book") _ // wildcard stands for other args
  val totalCostForCakes = totalCost("Cake")(5) _

  // Can pass other args to variable
  println(s"\nTotal cost for Books ${totalCostForBooks(10)(0.1)}")
  println(s"\nTotal cost for 5 cakes ${totalCostForCakes(0.1)}")

}
