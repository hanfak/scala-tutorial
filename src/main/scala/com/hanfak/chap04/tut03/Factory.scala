package com.hanfak.chap04.tut03

object Factory extends App {

  class Item(var name: String, val productCode: Option[Long] = None) {
    val print: Unit = println(s"Item name = $name, productCode = ${productCode.getOrElse(0)}")
  }
  // Using inheritance
  class RoundItem(name: String) extends Item(name)

  class RectangleItem(name: String) extends Item(name)

  object Item {

    def apply(name: String): Item = {
      name match {
        case "Ball | Clock" => new RoundItem(name)
        case "Book | laptop" => new RectangleItem(name)
        case _ => new Item(name)
      }
    }

  }

  val book: Item = Item("Book")
  println(s"The class type of book = ${book.getClass}")
  book.print

  val laptop = Item("laptop")
  println(s"The class type of laptop = ${laptop.getClass}")
  laptop.print
}
