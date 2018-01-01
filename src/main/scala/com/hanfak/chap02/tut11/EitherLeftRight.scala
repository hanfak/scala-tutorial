package com.hanfak.chap02.tut11

object EitherLeftRight extends App {
//  se of Either is as an alternative to Option for dealing with possible missing values. In this usage, scala.
// None is replaced with a Left which can contain useful information.
// Right takes the place of Some.
// Convention dictates that Left is used for failure and Right is used for success.
  def divideXByY(x: Int, y: Int): Either[String, Int] = {
    if (y == 0) Left("Dude, can't divide by 0")
    else Right(x / y)
  }

  println(divideXByY(1, 0))
  println(divideXByY(1, 1))
  divideXByY(1, 0) match {
    case Left(s) => println("Answer: " + s)
    case Right(i) => println("Answer: " + i)
  }

  divideXByY(8, 2) match {
    case Left(s) => println("Answer: " + s)
    case Right(i) => println("Answer: " + i)
  }
}
