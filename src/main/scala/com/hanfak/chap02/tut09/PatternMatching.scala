package com.hanfak.chap02.tut09

object PatternMatching extends App {
  // Similar to switch statements

  val someNumber = 3
  someNumber match {
    case 1 => println(s"Your number is $someNumber does not match")
    case 2 => println(s"Your number is $someNumber does not match")
    case 3 => println(s"Your number is $someNumber matches")
    case 4 => println(s"Your number is $someNumber does not match")
  }

  //the last expression will be the one returned back to the calle
  val result = someNumber match {
    case 1 => s"Your number is $someNumber does not match"
    case 2 => s"Your number is $someNumber does not match"
    case 3 => s"Your number is $someNumber matches"
    case 4 => s"Your number is $someNumber does not match"
  }

  println(s"\n\nCan return the result: $result")

  val someNumber1 = 4
  val result1 = someNumber1 match {
    case 3 => s"Your number is $someNumber1 matches"
    case _ => s"Some other number"
  }

  println(s"\n\nCan return the result using wildcard: $result1")

  val someNumber2 = 4
  val result2 = someNumber2 match {
    case 3 | 4 => s"Your number is $someNumber2 matches" // 3 or 4 matches
    case _ => s"Some other number"
  }

  println(s"\n\nCan return the result using pipe: $result2")


  println("\n\nPattern matching and using if expressions in the case clause")
  val donutType = "Glazed Donut"

  val tasteLevel4 = donutType match {
    case donut if donut.contains("Glazed") || donut.contains("Strawberry") => "Very tasty"
    case "Plain Donut"  => "Tasty"
    case _  => "Tasty"
  }
  println(s"Taste level of $donutType = $tasteLevel4")

  val someNumber3 = 93
  val result3 = someNumber3 match {
    // any number in range 1 to 9 matches
    case number if Range(1,10).contains(number) => s"Your number is between 1 and 9, $someNumber3 matches"
    case _ => s"Some other number"
  }

  println(s"\n\nCan return the result using range: $result3")

  val priceOfDonut: Any = 2f
  val priceType = priceOfDonut match {
    case price: Int => "Int"
    case price: Double => "Double"
    case price: Float => "Float"
    case price: String => "String"
    case price: Boolean => "Boolean"
    case price: Char => "Char"
    case price: Long => "Long"
  }
  println(s"\n\npattern matching on  type = $priceType")

}
