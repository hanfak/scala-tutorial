package com.hanfak.chap03.tut01

object Function extends App {
  println("function with no params")
  def favoriteString(): String = {
    "Han"
  }

  val str = favoriteString()

  println(s"My favourite string is ${str}")

  println("\n\nfunction with no normal parenthesis")
  // If function has no side effects, then define like below
  def leastFavoriteString = "Taxes"
  println(s"My least favorite string is $leastFavoriteString")

  println("\n\nfunction with no return type")
  def printSalesReport(): Unit = { // unit is similar to void
    // lookup sales data in database and create some report
    println("Printing sales report... done!")
  }
  printSalesReport()



}
