package com.hanfak.chap04.tut07

object Aliases extends App {

  //  Type aliasing can be useful to help you provide more meaningful names which
  //  represent your business or domain objects without having to create unnecessary types.

  case class Item(name: String, price: Double, productCode: Option[Long] = None)

  val book: Item = Item("Book", 111, Some(111))
  val ball: Item = Item("Ball", 222)

  println(s"Book = $book")
  println(s"Balls = $ball")

  //use type alias to name a Tuple2 pair into a domain type called CartItem

  type CartItem[Item, Int] = Tuple2[Item, Int]

  val cartItem = new CartItem(book, 4)
  // cartItem is still treated as a tuple
  println(s"cartItem = $cartItem")
  println(s"cartItem first value = ${cartItem._1}")
  println(s"cartItem second value = ${cartItem._2}")

  println("\nUsing type in fuctino param")

  def calculateTotal(shoppingCartItems: Seq[CartItem[Item, Int]]): Double = {
    // calculate the total cost
    shoppingCartItems.foreach { cartItem =>
      println(s"CartItem item = ${cartItem._1}, quantity = ${cartItem._2}")
    }
    shoppingCartItems.map(cartItem => cartItem._1.price).sum
  }

  val cartItem2 = new CartItem(ball, 2)

  println(f"get total: £${calculateTotal(Seq(cartItem,cartItem2))}%.2f")

  println("\nUsing a case class for more precision instead of aliased Type")


  case class ShoppingCartItem(item: Item, quantity: Int)
  val shoppingItem: ShoppingCartItem = ShoppingCartItem(book, 10)
  println(s"shoppingItem item = ${shoppingItem.item}")
  println(s"shoppingItem quantity = ${shoppingItem.quantity}")


  println("\nUsing case class in function param")

  def calculateTotal2(shoppingCartItems: Seq[ShoppingCartItem]): Double = {
    // calculate the total cost
    shoppingCartItems.foreach { cartItem =>
      println(s"CartItem item = ${cartItem.item}, quantity = ${cartItem.quantity}")
    }
    shoppingCartItems.map(cartItem => cartItem.item.price).sum
  }

  println(f"get total: £${calculateTotal(Seq(cartItem,cartItem2))}%.2f")

}
