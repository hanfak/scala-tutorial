package com.hanfak.chap02.tut04

object TypeInference extends App {
  val numberOfDonuts: Short = 1
  val someDecimal= 1.60

  val minimumDonutsToSell: String = numberOfDonuts.toString()

  println(s"$minimumDonutsToSell")
  println(s"${someDecimal.toString()}")
}


