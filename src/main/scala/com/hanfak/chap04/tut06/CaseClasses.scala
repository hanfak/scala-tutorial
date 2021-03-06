package com.hanfak.chap04.tut06


object CaseClasses extends App {

  // Case class creaete companion class as well
  // and will automatically create the apply(),  toString(), hashCode and equals() methods for you.

  case class Item(name: String, price: Double, productCode: Option[Long] = None) {
    def blah() = println("some instance method " + name)
  }

  object Item {
    def blahter() = println("some static method")
  }

  Item.blahter()


  val book: Item = Item("Book", 111, Some(111))
  val ball: Item = Item("Ball", 222)

  book.blah()
  ball.blah()

  println(s"Book Item name field = ${book.name}")
  println(s"Ball Item price field = ${ball.price}")
  println(s"Book Item productCode field = ${book.productCode.get}")
  println(s"Ball Item productCode field = ${ball.productCode}")

  //fields defined on case class are immutable by default

  val shoppingCart: Map[Item, Int] = Map(book -> 4, ball -> 3)

  println(s"All items in shopping cart = ${shoppingCart}")
  println(s"Quantity of books in shopping cart = ${shoppingCart(book)}")
  println(s"Quantity of balls in shopping cart = ${shoppingCart(ball)}")

  println(s"Hash code automatically given with case class ${book.hashCode()}")

  println("\nCopy method also created")
  val anotherBook: Item = book.copy(name = "another book", price = 5.0)
  println(s"another book item, with same product code as book = $anotherBook")

  println("\nPattern matching")

  def inspect(item: Item): String =
    item match {
      case Item("Book", 111, Some(111)) | Item("cake", 222, Some(222)) => "Key items!"
      case Item(name, _, _) => s"Move along, $name"
    }

  println(s"${inspect(book)}")
  println(s"${inspect(ball)}")
  println(s"${inspect(Item("cake", 222, Some(222)))}")

}
