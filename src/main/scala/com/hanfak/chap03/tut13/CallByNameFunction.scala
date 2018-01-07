package com.hanfak.chap03.tut13

import java.util.Random

object CallByNameFunction extends App {

  // List of tuples
  val listOrders = List(("Glazed Donut", 5, 2.50), ("Vanilla Donut", 10, 3.50))

  def placeOrderMutable(orders: List[(String, Int, Double)])(exchangeRate: Double): Double = {
        var totalCost: Double = 0.0
        orders.foreach {order =>
          val costOfItem = order._2 * order._3 * exchangeRate
          println(s"Cost of ${order._2} ${order._1} = £$costOfItem")
          totalCost += costOfItem
        }
        totalCost
  }

  println(s"Total cost of order = £${placeOrderMutable(listOrders)(0.5)}")

  println("\nImmutable code")

  // not pure functional due to var and mutating totalCost
  def placeOrder(orders: List[(String, Int, Double)])(exchangeRate: Double): Double = {
    orders.map(order => orderForExchangeRateCalculator(exchangeRate, order)).sum
  }

  private def orderForExchangeRateCalculator(exchangeRate: Double, order: (String, Int, Double)): Double = {
    val costOfItem = order._2 * order._3 * exchangeRate
    println(s"Cost of ${order._2} ${order._1} = £$costOfItem")
    costOfItem
  }

  println(s"Total cost of order = £${placeOrder(listOrders)(0.5)}")


  println("\nReplacing exchange rate with function")

//The call-by-name function parameter exchangeRate: => Double will evaluate any exchangeRate function each time it is called.
  def placeOrderWithByNameParameter(orders: List[(String, Int, Double)])(exchangeRatefunction: => Double): Double = {
    orders.map(order => orderForExchangeRateCalculator(exchangeRatefunction, order)).sum
  }


// In first function above which had a call-by-value function parameter for exchange rate.
// This meant that any exchange rate passed through would be evaluated only once.
  private def exchangeRatefunction(exchangeRate: => Double, order: (String, Int, Double)): Double = {
    val costOfItem = order._2 * order._3 * exchangeRate
    println(f"Cost of ${order._2} ${order._1} = £$costOfItem%.2f") //TODO why not working???
    costOfItem
  }

  val randomExchangeRate = new Random(10)
  def usdToGbp: Double = {
    val rate = randomExchangeRate.nextDouble()
    println(f"Fetching USD to GBP exchange rate = $rate%.5f")
    rate
  }

  println("Should have different prices")
  private val d = placeOrderWithByNameParameter(listOrders)(usdToGbp)
  println(f"Total cost of order = £$d%.2f")

}
