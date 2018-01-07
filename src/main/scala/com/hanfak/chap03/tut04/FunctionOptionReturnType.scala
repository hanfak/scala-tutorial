package com.hanfak.chap03.tut04

object FunctionOptionReturnType extends App {
  def dailyCouponCode(couponFromDb: String): Option[String] = {
    Option(couponFromDb).filter(_.nonEmpty)//remove any empty strings
  }

  println("Using getOrElse")
  val todayCoupon: Option[String] = dailyCouponCode("XXXT")
  println(s"Today's coupon code = ${todayCoupon.getOrElse("No Coupon's Today")}")


  println("\nUsing pattern matching")
  dailyCouponCode("XXXT") match {
    case Some(couponCode) => println(s"Today's coupon code = $couponCode")
    case None => println(s"Sorry there is no coupon code today!")
  }

  println("\nUsing map")
  dailyCouponCode("XXXT").map(couponCode => println(s"Today's coupon code = $couponCode"))

  println("\nReturning none")

  def dailyCouponCode1(couponFromDb: Option[String]): Option[String] = {
    val value = couponFromDb.getOrElse("Never match")
    if ("XXXT".equals(value) | "YYYT".equals(value))
      Option(value).filter(_.nonEmpty)//remove any empty strings
    else
      None
  }

  dailyCouponCode1(None) match {
    case Some(couponCode) => println(s"Today's coupon code = $couponCode")
    case None => println(s"Sorry there is no coupon code today!")
  }

  println(s"Today's coupon code = ${dailyCouponCode1(None).getOrElse("No Coupon's Today")}")
  println(s"Today's coupon code = ${dailyCouponCode1(Some("YYYT")).getOrElse("No Coupon's Today")}")


  println("\nUsing Fold")

  val todayCouponUsingFold: String = dailyCouponCode("XXXT")
    .fold("No Coupon Available")(couponCode => couponCode)
  println(s"Today's coupon code = $todayCouponUsingFold")

  val todayCouponUsingFold1: String = dailyCouponCode1(None)
    .fold("No Coupon Available")(couponCode => couponCode)
  println(s"Today's coupon code = $todayCouponUsingFold1")


}
