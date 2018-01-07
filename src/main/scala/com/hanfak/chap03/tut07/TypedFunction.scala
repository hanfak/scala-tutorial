package com.hanfak.chap03.tut07

object TypedFunction extends App {

  def applyDiscount1(couponCode: String) {
    println(s"Lookup percentage discount in database for $couponCode")
  }

  def applyDiscount1(percentageDiscount: Double) {
    println(s"$percentageDiscount discount will be applied")
  }

  applyDiscount1("COUPON_1234")
  applyDiscount1(10)

  println("Generic typed function")
  // No need to overload methods

  def applyDiscount[T](discount: T) {
    discount match {
      case d: String =>
        println(s"Lookup percentage discount in database for $d")

      case d: Double =>
        println(s"$d discount will be applied")

      case _ =>
        println("Unsupported discount type")
    }
  }

  println("Calling typed function")
  applyDiscount[String]("COUPON_123")
  applyDiscount[Double](10)
  applyDiscount(5)

}
