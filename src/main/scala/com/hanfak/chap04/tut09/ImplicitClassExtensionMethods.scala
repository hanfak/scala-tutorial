package com.hanfak.chap04.tut09

object ImplicitClassExtensionMethods extends App {

  //Use Implicit Class to add methods to an object without modifying the source code of the object - also commonly known as extension methods.

  case class Item(name: String, price: Double, productCode: Option[Long] = None)

  val book: Item = Item("book", 1.50)

  //good practice to encapsulate Implicit Classes into an object which can later be injected or referenced.
  object ItemImplicits {
    implicit class AugmentedDonut(item: Item) {
      def uuid: String = s"${item.name} - ${item.productCode.getOrElse(12345)}"
    }
  }


//  it is also common to encapsulate Implicit Classes inside Package Object.

  import ItemImplicits._

  println(s"Vanilla donut uuid = ${book.uuid}")


}
