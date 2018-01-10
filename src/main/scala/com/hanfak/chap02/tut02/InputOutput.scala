package com.hanfak.chap02.tut02

import scala.io._

object InputOutput extends App {
  val name = StdIn.readLine("Your name\n")
  println(s"your name is $name")

  val number = StdIn.readInt()
  println(s"\nYour number is $number")
}
