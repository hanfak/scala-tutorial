package com.hanfak.chap02.tut06

object ForLoop extends App {

  //Looping over range
  // Inclusive range
  println("Listing numbers inclusive range")
  for (someNumber <- 1 to 5) { // 1 to 5 is a generator
    print(s"The number is = $someNumber, ")
  }

  println("\nEquivalent to ")
  //List.range is exclusive
  List.range(1, 6).foreach(someNumber => print(s"The number is = $someNumber, "))

  println("\n\nListing numbers exclusive range")

  for (someNumber <- 1 until 5) {
    print(s"The number is = $someNumber, ")
  }
  println("\nEquivalent to ")
  //List.range is exclusive
  List.range(1, 5).foreach(someNumber => print(s"The number is = $someNumber, "))

  println("\n\nListing numbers exclusive range stepping through range by some number ")

  // Odd numbers
  for (someNumber <- 1 until 20 by 2) {
    print(s"The number is = $someNumber, ")
  }

  println("\nEquivalent to ")
  //List.range is exclusive
  List.range(1, 20, 2).foreach(someNumber => print(s"The number is = $someNumber, "))

  println("\n\nLooping over list which is filtered within range")
  val someList = List("flour", "sugar", "egg yolks", "syrup", "flavouring")

  // TODO extract predicate or loop
  // If loop is called a guard
  for (element <- someList if element.startsWith("s")) { // Use curly brackets for several statements
    print(s"The element is = $element, ")
  }

  println("\n\nSeveral guards")
  for {
    i <- 1 to 10
    if i > 3
    if i < 6
    if i % 2 == 0
  } println(i)

  println("\n\nUsing chained functions")
  private val predicate: List[String] = someList.filter(element => !element.startsWith("s"))
  predicate.foreach(x => print(s"Filtered out list ${x}, "))

  someList.filter(element => element.endsWith("r")).foreach(x => print("Filtered out list " + x + ", "))

  println("\n\nusing underscore")
  someList.filter(_.endsWith("r"))
    .map(_.concat(", "))
    .foreach(print(_))


  println("\n\nLooping over two dimensional arrays")
  val twoDimensionalArray = Array.ofDim[String](2, 2)
  twoDimensionalArray(0)(0) = "flour"
  twoDimensionalArray(0)(1) = "sugar"
  twoDimensionalArray(1)(0) = "egg"
  twoDimensionalArray(1)(1) = "syrup"

  for {x <- 0 until 2
       y <- 0 until 2
  } {
    println(s"element at ${(x, y)} is ${twoDimensionalArray(x)(y)}")
  }

  println("\nusing normal brackets in for loop, with multiple statements")
  for (x <- 0 until 2; y <- 0 until 2) println(s"element at ${(x, y)} is ${twoDimensionalArray(x)(y)}")


  val nums = Seq(1, 2, 3)
  val letters = Seq('a', 'b', 'c')

  println("List(")
  for {
    n <- nums
    c <- letters
  } {
    print(s"pair (${n},${c}), ")
  }
  println(")")

  val res = for {
    n <- nums
    c <- letters
  } yield (n, c) //does flat map
  println(s"${res}")

}
