package com.hanfak.chap04.tut12

object CaseClassInheritance extends App {

  abstract class Donut(name: String) {

    def printName: Unit

  }

  //Avoid having a case class extend other case classes
  case class VanillaDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }

  case class GlazedDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name + " YESS!!!")

  }

  val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")
  vanillaDonut.printName

  val glazedDonut: Donut = GlazedDonut("Glazed Donut")
  glazedDonut.printName
}
