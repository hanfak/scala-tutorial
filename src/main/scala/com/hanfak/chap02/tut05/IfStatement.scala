package com.hanfak.chap02.tut05

object IfStatement extends App {
  val someBoolean = true

  if (someBoolean)
    println("path is followed")

  val someOtherBoolean = false

  if (someBoolean)
    println("path is not followed")
  else
    println("else path is followed")

  // If-else as expression, similar to ternary operater

  val someNumber = 12

  val ifStatementStoredInVal = if (someNumber > 10) (someNumber % 2) else someNumber
  println(s"Evaluated if statement ${ifStatementStoredInVal}")

}
