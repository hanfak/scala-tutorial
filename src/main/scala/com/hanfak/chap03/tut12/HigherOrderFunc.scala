package com.hanfak.chap03.tut12

object HigherOrderFunc extends App {

  def totalCostWithFunction(itemType: String)(quantity: Int)(f: Double => Double): Double = {
    println(s"Calculating total cost for $quantity $itemType")
    val totalCost = 2.50 * quantity
    f(totalCost)
  }

  def applyDiscount(totalCost: Double): Double = {
    val discount = 2 // assume you fetch discount from database
    totalCost - discount
  }

  val totalCostOf5Items = totalCostWithFunction("books")(5)(applyDiscount(_)) //Old notation
  val totalCostOf5Items1 = totalCostWithFunction("books")(5)(applyDiscount)

  println(s"Total cost of 5 books with anonymous discount function = $totalCostOf5Items")
  println(s"Total cost of 5 books with anonymous discount function = $totalCostOf5Items1")

}
