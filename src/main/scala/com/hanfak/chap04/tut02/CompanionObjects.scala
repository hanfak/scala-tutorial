package com.hanfak.chap04.tut02

object CompanionObjects extends App {
  // Avoids creating objects wiht new

  class Item(var name: String, val productCode: Long) {
    def print(): Unit = println(s"Item name = $name, productCode = $productCode")
  }

  object Item {
    // Must always have a apply method
    // Used as a factory
    def apply(name: String, productCode: Long): Item = {
      new Item(name, productCode)
    }
  }

  val book: Item = Item("Book", 111)
  val ball: Item = Item("Ball", 222)

  book.print()
  ball.print()
}
