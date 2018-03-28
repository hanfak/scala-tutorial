package com.hanfak.chap04.tut13

object TypedClasses extends App {

  abstract class Donut(name: String) {

    def printName: Unit

  }

  case class VanillaDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }
  case class GlazedDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name + " Yesss!!!")

  }

  val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")
  vanillaDonut.printName

  val glazedDonut: Donut = GlazedDonut("Glazed Donut")
  glazedDonut.printName

  //With the notation [D <: Donut], we are restricting only Donut types to be passed-through to the ShoppingCart class.
  class ShoppingCart[D <: Donut](donuts: Seq[D]) {

    def printCartItems: Unit = donuts.foreach(_.printName)

  }
// strategy pattern/ polymorphism
  val shoppingCart: ShoppingCart[Donut] = new ShoppingCart(Seq[Donut](vanillaDonut, glazedDonut))
  shoppingCart.printCartItems

//  val shoppingCart2: ShoppingCart[Donut] = new ShoppingCart[String](Seq("Vanilla Donut"))


}
