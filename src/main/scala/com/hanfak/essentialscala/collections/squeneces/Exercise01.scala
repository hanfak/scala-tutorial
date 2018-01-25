package com.hanfak.essentialscala.collections.squeneces

object Exercise01 extends App {

  private val animals = Seq("cat", "dog", "penguin")

  println(s"$animals")

  animals.foreach(animal => println(s"$animal"))

  private val moreAnimals = "mouse" :+ animals :+ "tyrannosaurus"

  println(s"$moreAnimals")

  private val moreAnimals2 = "mouse" +: animals :+ "tyrannosaurus"

  println(s"$moreAnimals2")

  private val moreAnimals3 = 2 +: animals :+ "tyrannosaurus"

  println(s"${moreAnimals3.tail.head.getClass}")
  println(s"$moreAnimals3")


}
