package com.hanfak.chap04.tut04

object ValuesFieldsCompanionObject extends App {

  class Item(var name: String, val productCode: Option[Long] = None) {
    def print(): Unit = println(s"Item name = $name, productCode = ${productCode.getOrElse(0)}, uuid = ${Item.uuid}")
  }

  object Item {
    private val uuid = 1

    def apply(name: String, productCode: Option[Long]): Item = {
      new Item(name, productCode)
    }

    def apply(name: String): Item = {
      new Item(name)
    }
  }

  val book: Item = Item("Book", Some(111))
  val ball: Item = Item("Ball")

  book.print()
  ball.print()

}
