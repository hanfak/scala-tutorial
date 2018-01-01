package com.hanfak.chap02.tut11

object OptionsAndNull2 extends App {
  def toInt(in: String): Option[Int] = {
    try {
      Some(Integer.parseInt(in.trim))
    } catch {
      case e: NumberFormatException => None
    }
  }

  toInt("23") match {
    case Some(i) => println(i)
    case None => println("That didn't work.")
  }


  println("list of inputs into pattern matching")
  val listOfInputs = List("12", "asfas")
  listOfInputs.foreach { input =>
    toInt(input) match {
      case Some(i) => println(i)
      case None => println("That didn't work.")
    }
  }


  val bag = List("1", "2", "foo", "3", "bar")
  val sum = bag.flatMap(toInt).sum // Ignored any element in list that couldnt be converted and thus return exception
  println(sum)
}
