package com.hanfak.chap03.tut08

object PolymorphicTypedFunction extends  App {
  def applyDiscountWithReturnType[T](discount: T): Seq[T] = {
    discount match {
      case d: String =>
        println(s"Lookup percentage discount in database for $d")
        Seq[T](discount)

      case d: Double =>
        println(s"$d discount will be applied")
        Seq[T](discount)

      case d @ _ =>
        println("Unsupported discount type")
        Seq[T](discount)
    }
  }
  println(s"Result of applyDiscountWithReturnType with String parameter = ${applyDiscountWithReturnType[String]("COUPON_123")}")

  println(s"\nResult of applyDiscountWithReturnType with Double parameter = ${applyDiscountWithReturnType[Double](10.5)}")

  println(s"\nResult of applyDiscountWithReturnType with Char parameter = ${applyDiscountWithReturnType[Char]('U')}")


}
