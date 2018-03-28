package com.hanfak.chap04.tut11

object Inheritance extends App {
  abstract class Donut(name: String) {

    def printName: Unit

  }
// Subclass of Donut
  class VanillaDonut(name: String) extends Donut(name) {
    // must implement printName
    override def printName: Unit = println(name)
}

  // Companion object
  object VanillaDonut {

    def apply(name: String): Donut = {
      new VanillaDonut(name)
    }

  }

  class GlazedDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name + " nooooo")

  }

  object GlazedDonut {

    def apply(name: String): Donut = {
      new GlazedDonut(name)
    }

  }

  val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")
  vanillaDonut.printName
  val glazedDonut: Donut = GlazedDonut("Glazed Donut")
  glazedDonut.printName

}
