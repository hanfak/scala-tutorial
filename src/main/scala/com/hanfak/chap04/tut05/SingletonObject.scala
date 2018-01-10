package com.hanfak.chap04.tut05

import com.hanfak.chap04.tut05.ItemShoppingCartCalculator1.calculateTotalCost

object SingletonObject extends App {

  // Singleton object
  object ItemShoppingCartCalculator {
    // Does not need static keyword
    val discount: Double = 0.01 // define global field


    // can encapsulate functions and methods inside a Singleton Object if you would like to expose some globally accessible utility function or method.

    def calculateTotalCost(items: Map[String, Int]): Double = {
      // calculate the cost of items
      items.values.sum * (1 - 0.01)
    }
  }

  val items: Map[String, Int] = Map(("PD",1),("SD",2),("CD",3))

  println(f"Total cost of items ${items.keys.mkString(", ")} is #${ItemShoppingCartCalculator.calculateTotalCost(items)}%.2f")
  println(s"Calling global field: ${ItemShoppingCartCalculator.discount}")


  // Can place object outside
  println(f"Total cost of items ${items.keys.mkString(", ")} is #${calculateTotalCost(items)}%.2f") //Can import
  println(s"Calling global field: ${ItemShoppingCartCalculator1.discount}")
}

object ItemShoppingCartCalculator1 {
  val discount: Double = 0.01 // define global field

  def calculateTotalCost(items: Map[String, Int]): Double = {
    // calculate the cost of items
    items.values.sum * (1 - 0.01)
  }
}