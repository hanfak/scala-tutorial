package com.hanfak.chap04.tut14

object CovarianceTypeClass extends App {

  /// enforcing type hierarchies through the use of variance - in particular covariance

  abstract class Donut(name: String) {

    def printName: Unit

  }

  case class VanillaDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }

  case class GlazedDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }

  val vanillaDonut: VanillaDonut = VanillaDonut("Vanilla Donut")
  vanillaDonut.printName

  val glazedDonut: Donut = GlazedDonut("Glazed Donut")
  glazedDonut.printName

  val glazedDonut1: GlazedDonut = GlazedDonut("Glazed Donut")
  glazedDonut1.printName

  class ShoppingCart[D <: Donut](donuts: Seq[D]) {

    def printCartItems: Unit = donuts.foreach(_.printName)

  }

  val shoppingCart: ShoppingCart[Donut] = new ShoppingCart(Seq[Donut](vanillaDonut, glazedDonut))
  shoppingCart.printCartItems

  // Will not compile
  //  val shoppingCart: ShoppingCart[Donut] = new ShoppingCart[VanillaDonut](Seq(vanillaDonut))

  // covariance enabled by +D <: Donut
  // can use Donut or it's subclasses
  class ShoppingCart2[+D <: Donut](donuts: Seq[D]) {

    def printCartItems: Unit = donuts.foreach(_.printName)

  }

  val shoppingCart2: ShoppingCart2[Donut] = new ShoppingCart2[VanillaDonut](Seq(vanillaDonut))
  shoppingCart2.printCartItems

//    val shoppingCart3: ShoppingCart2[Donut] = new ShoppingCart2[GlazedDonut](Seq(glazedDonut))
//    shoppingCart3.printCartItems

  val shoppingCart3: ShoppingCart2[Donut] = new ShoppingCart2[GlazedDonut](Seq(glazedDonut1))
      shoppingCart3.printCartItems

}
