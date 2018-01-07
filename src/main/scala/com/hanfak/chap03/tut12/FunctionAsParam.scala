package com.hanfak.chap03.tut12

object FunctionAsParam extends App {
  // The discount parameter which could be a potential candidate to pass-through a function to apply the discount logic.
  def totalCost(itemType: String)(quantity: Int)(discount: Double): Double = {
    println(s"Calculating total cost for $quantity $itemType with ${discount * 100}% discount")
    val totalCost = 2.50 * quantity
    totalCost - totalCost * discount
  }


  def totalCostWithFunction(itemType: String)(quantity: Int)(f: Double => Double): Double = {
    println(s"Calculating total cost for $quantity $itemType")
    val totalCost = 2.50 * quantity
    f(totalCost)
  }


  val totalCostOf5Items = totalCostWithFunction("Glazed Donut")(5){total =>
    val discount = 2 // assume you fetch discount from database
    total - discount
  }

  println(s"Total cost of 5 Glazed Items with anonymous discount function = $totalCostOf5Items")


  println("\nMultiple params in annoymous function")
  def totalCostWithFunctionTwoParams(itemType: String)(quantity: Int)(f: (Double, String) => Double): Double = {
    println(s"Calculating total cost for $quantity $itemType")
    val totalCost = 2.50 * quantity
    f(totalCost, "ShopA")
  }

  val totalCostOf5Items2 = totalCostWithFunctionTwoParams("Glazed Donut")(5){(total, shop) =>
    val discount = 2 // assume you fetch discount from database
    println(s"Shop being used is: $shop")
    total - discount
  }

  println(s"Total cost of 5 Glazed Items with anonymous discount function with two params = $totalCostOf5Items2")

  println("\nMultiple params in annoymous function")
  def totalCostWithFunctionZeroParams(itemType: String)(quantity: Int)(f: () => Unit): Double = {
    println(s"Calculating total cost for $quantity $itemType")
    f()
    2.50 * quantity
  }

  val totalCostOf5Items3 = totalCostWithFunctionZeroParams("Glazed Donut")(5){() =>
    println("Zero params passed")
  }

  println(s"Total cost of 5 Glazed Items with anonymous discount function with zero params = $totalCostOf5Items3")

  // TODO Tut08 pattern matching example



}
