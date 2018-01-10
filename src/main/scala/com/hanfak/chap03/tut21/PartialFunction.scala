package com.hanfak.chap03.tut21

object PartialFunction extends App {
  //a Partial Function provides some but not all the possible case blocks.

  val startsWithB: PartialFunction[String, String] = {
    // Case is a variable
    case item@("Book" | "Ball") => s"$item begins with B"
  }

  val isUseful: PartialFunction[String, String] = {
    case "Knife" => "useful"
  }

  val unknown: PartialFunction[String, String] = {
    case item@_ => s"Unknown item = $item"
  }
  //  println(s"Calling partial function isVeryTasty = ${startsWithB("Glazed Donut")}") //exception scala.MatchError if the partial function does not have a case
  println(s"Calling partial function startWiht = ${startsWithB("Book")}")
  println(s"Calling partial function useful = ${isUseful("Knife")}")
  println(s"Calling partial function unknown = ${unknown("blah")}")

  println("\nCombing the partial functions")
  val combinedChecks = startsWithB orElse isUseful orElse unknown
  println(combinedChecks("Book"))
  println(combinedChecks("Knife"))
  println(combinedChecks("Chocolate Donut"))

}
