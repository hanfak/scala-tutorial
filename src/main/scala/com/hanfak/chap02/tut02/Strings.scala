package com.hanfak.chap02.tut02

object Strings  extends App {
  val name: String = "Han"
  println(s"Hello $name")

//  case class as a means for creating domain
//  objects where the Scala compiler does the hardwork of adding your getters and setters!
//  Like a POJO

  case class Person(name: String, age: Int, male: Boolean)

  val han: Person = Person(name = "Han", age = 23, male = true)
  val bobo = Person("Bobo", 43, false)

  println(s"Print out object $han")
  println(s"Print out name of object ${han.name}") // Need curly braces to run method
  println(s"Print out age of object ${bobo.age}")
  println(s"Print out is male of object ${bobo.male}")
  val someNumber: Double = 1.4
  println(s"Sum maths ${(someNumber + 2.8).round}")

  val pi = scala.math.Pi
  println(f"Rounding to 5 decimal places $pi%1.5f")
  println(f"Rounding to 2 decimal places $pi%1.2f")
  println(f"Rounding to 2 decimal places ${23.345}%.2f") //Rounds it
  println(raw"Favorite donut\t$pi") // Print out escape character


  val palindrome = "Dot saw I was Tod"
  val len = palindrome.length
  print(s"length of string $len")
}