package com.hanfak.chap04.tut01

object ClassesObjects extends App {
  class Item(var name: String, val productCode: Long) {
    val blah: Int = {
      println("created once on init")
      9
    }
    def print(): Unit = println(s"Item name = $name, productCode = $productCode")
  }

  val book: Item = new Item("Book", 111)
  val ball: Item = new Item("Ball", 222)

  println(s"Can print var ${book.name}")
  book.name = "Hat"
  println(s"Can change var ${book.name}")

  // val cannot be change or accessed

  book.print()
  println(book.blah)
  ball.print()

}
