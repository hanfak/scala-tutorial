package com.hanfak.chap02.tut10

object Tuples extends App {

  //  you can think of tuples in terms of providing easy semantics for grouping your data points.

  val positionIn2D = Tuple2(1, 3)
  println(s"2D coordinate/ position vector with 2 data points = $positionIn2D")

  val positionIn4D = Tuple4(1, 3, 6, 2)
  println(s"4D coordinate/ position vector with 2 data points = $positionIn4D")

  val mixedTupleContents = Tuple3(1, 3.4, "Hello")
  println(s"Mixed contents in tuple = $mixedTupleContents")

  println(s"Accessing third value in tuple: ${positionIn4D._3}")

  val tupleList = List(positionIn2D, Tuple2(3, 5), Tuple2(9, 6))
  println(s"\n\nlast element of list ${tupleList.last}, first element of list: ${tupleList.head}, tail list: ${tupleList.tail} \n\n")
  tupleList.foreach { tuple => {
    tuple match {
      case (1, secondValue) => println(s"second value is $secondValue") // secondValue stores the value from tuple if it matches with 1
      case d if d._2 % 2 == 0 => println(s"$d has second value is even: value is d._2")
      case _ => None
    }
  }
  }

  println("\n\nmore elegent way")

  tupleList.foreach {
      case (1, secondValue) => println(s"second value is $secondValue") // secondValue stores the value from tuple if it matches with 1
      case d if d._2 % 2 == 0 => println(s"$d has second value is even: value is d._2")
      case _ => None
    }


  println("\n\nshortcut for creating tuples")
  val shortcutTuple = (1,2,3,4,6)
  println(s"some values from shortcut defined tuple ${shortcutTuple._3}, ${shortcutTuple._5}")

}
