package com.hanfak.chap03.tut06

object ImplicitFunction extends App {

  // Extend a class

  class ItemString(s: String) { // Wrapper class to extend STring
    def isFavoriteItem: Boolean = s == "Harry Potter" // No need to use equals to compare strings
  }

//It is a good practice to encapsulate your implicit functions and values into an Object or a Package Object.
  object ItemConverstions {
    implicit def stringToItemString(s: String): ItemString = new ItemString(s)
  }

  // wildcard  will import any values or implicit functions.
  import ItemConverstions._ // To use it

  val aBook = "Catch-22"
  val harry = "Harry Potter"

  println(s"Is Catch-22 my favorite book  = ${aBook.isFavoriteItem}")
  println(s"Is Harry Potter my favorite book  = ${harry.isFavoriteItem}")

}
