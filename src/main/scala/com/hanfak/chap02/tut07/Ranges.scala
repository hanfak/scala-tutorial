package com.hanfak.chap02.tut07

import scala.util.Random

object Ranges extends App {
  val from1To5 = 1 to 5
  println(s"Range from 1 to 5 inclusive = $from1To5")

  val from1To9 = List.range(1,10)
  println(s"List from 1 to 9 exclusive = $from1To9")

  val range = Range(1, 20)
  println(s"Range from 1 to 20 exclusive = $range")

  val from0To10By2 = 0 to 10 by 2
  println(s"Range from 0 to 10 with multiples of 2 = $from0To10By2")

  println("\n\nAlphabet range")
  val alphabetRangeFromAToZ = 'a' to 'z'
  println(s"Range of alphabets from a to z = $alphabetRangeFromAToZ")
  for(x <- alphabetRangeFromAToZ) print(s"${x}, ")

  val alphabetRangeFromAToZCaps = 'A' to 'Z'
  println(s"\nRange of alphabets from a to z = $alphabetRangeFromAToZCaps")
  for(x <- alphabetRangeFromAToZCaps) print(s"${x}, ")


  println("\n\nConverting scala ranges to collections")
  //The general practice is to skip the () if the function has no side effects.
  val listFrom1To5 = (1 to 5).toList.reverse
  println(s"Range to list, reversed = ${listFrom1To5.mkString(" ")}")
  println(s"Range to list = ${listFrom1To5}")
  println(s"Range to list, randomised = ${Random.shuffle(listFrom1To5)}")

  //We are also calling the .mkString() function to create a string representation of each collection type.
  // The .mkString() function takes in a delimiter which in our case is just an empty space.
  // Like a join

  val setFrom1To5 = (1 to 5).toSet //Sets are unordered
  println(s"Range to set = ${setFrom1To5.mkString(", ")}")
  println(s"Range to set = ${setFrom1To5}")

  val sequenceFrom1To5 = (1 to 5).toSeq // cannot be shuffled
  println(s"Range to sequence = ${sequenceFrom1To5.mkString(" | ")}")

  val arrayFrom1To5 = (1 to 5).toArray
  println(s"Range to array = ${arrayFrom1To5.mkString(" ")}")
  println(s"Range to array = ${arrayFrom1To5}")

  arrayFrom1To5.foreach(print(_))
}
