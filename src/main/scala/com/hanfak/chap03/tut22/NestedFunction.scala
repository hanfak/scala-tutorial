package com.hanfak.chap03.tut22

object NestedFunction extends App {

  def checkItemAvailability(itemName: String): Boolean = {
    val listItemsFromStock = List[String]("Book", "Hat", "Ball", "Cup")

    (itemName.nonEmpty && itemName.length > 0) && (listItemsFromStock contains itemName)
  }

  println(s"Calling checkItemAvailability with Hat = ${checkItemAvailability("Hat")}")
  println(s"Calling checkItemAvailability with blah = ${checkItemAvailability("blah")}")

  println("\nnested function")
  def checkItemAvailability1(itemName: String): Boolean = {
    val listItemsFromStock = List[String]("Book", "Hat", "Ball", "Cup")

    // Nested function
    // Not great for unit testing ie dependency is hard coded, should be passed in as function
    val validate = (name: String) => {
      name.nonEmpty && name.length > 0
    }

    validate(itemName) && (listItemsFromStock contains itemName)
  }

  // Has global scope within object, but can be overwritten with nested function
//  val validate = (name: String) => {
//    name.nonEmpty && name.length > 0
//  }

  println(s"Calling checkItemAvailability with Hat = ${checkItemAvailability1("Hat")}")
  println(s"Calling checkItemAvailability with blah = ${checkItemAvailability1("blah")}")


  println("\nInjecting function")
  def checkItemAvailability2(itemName: String, validate: String => Boolean): Boolean = {
    val listItemsFromStock = List[String]("Book", "Hat", "Ball", "Cup")

    validate(itemName) && (listItemsFromStock contains itemName)
  }

  val validate1 = (name: String) => {
    name.nonEmpty && name.length > 0
  }

  println(s"Calling checkItemAvailability with Hat = ${checkItemAvailability2("Hat", validate1)}")
  println(s"Calling checkItemAvailability with blah = ${checkItemAvailability2("blah", validate1)}")
}
