package com.hanfak.chap03.tut03

object FunctionOptionParams extends App {

  def calculateItemCost(item: String, quantity: Int, couponCode: Option[String]): Double = {
    println(s"Calculating cost for $item, quantity = $quantity")

    couponCode match {
      case Some(coupon) =>
        if (Some(coupon).get.equals("XXXT"))
          calculateTotal(quantity, discount = 0.1)
        else
          calculateTotal(quantity, discount = 0.2)


      case None => calculateTotal(quantity, 0)
    }
  }

  private def calculateTotal(quantity: Int, discount: Double) = {
    2.50 * quantity * (1 - discount)
  }

  println(s"""Total cost No discount (default) = ${calculateItemCost("Book", 5, None)}""") // Default value used
  println(s"""Total cost With discount = ${calculateItemCost("Book", 5, Some("XXXT"))}""")
  println(s"""Total cost With discount = ${calculateItemCost("Book", 5, Some("bbbb"))}""")


  println("\nNot using None")

  def calculateItemCost1(item: String, quantity: Int, couponCode: Option[String] = None): Double = {
    println(s"Calculating cost for $item, quantity = $quantity")

    couponCode match {
      case Some(coupon) => discountDecider(quantity, coupon)
        if (Some(coupon).get.equals("XXXT"))
          calculateTotal(quantity, discount = 0.1)
        else
          calculateTotal(quantity, discount = 0.2)


      case _ => calculateTotal(quantity, 0)
    }
  }

  println(s"""Total cost No discount (default) = ${calculateItemCost1("Book", 5)}""")
  println(s"""Total cost With discount = ${calculateItemCost1("Book", 5, Some("XXXT"))}""")
  println(s"""Total cost With discount = ${calculateItemCost1("Book", 5, Some("bbbb"))}""")

  println("\nusing Map")


  def calculateItemCost2(item: String, quantity: Int, couponCode: Option[String] = None): Double = {
    println(s"Calculating cost for $item, quantity = $quantity")

    couponCode.map(coupon => discountDecider(quantity, coupon))
      .getOrElse(calculateTotal(quantity, discount = 0))
  }

  private def discountDecider(quantity: Int, coupon: String) = {
    if (coupon.equals("XXXT"))
      calculateTotal(quantity, discount = 0.1)
    else
      calculateTotal(quantity, discount = 0.2)
  }

  println(s"""Total cost No discount (default) = ${calculateItemCost2("Book", 5)}""")
  println(s"""Total cost With discount = ${calculateItemCost2("Book", 5, Some("XXXT"))}""")
  println(s"""Total cost With discount = ${calculateItemCost2("Book", 5, Some("bbbb"))}""")

}
