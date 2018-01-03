package com.hanfak.chap02.tut12

object TypeHierarchy extends App {

  val someString: Any = "Some String"
  println(s"Some string of type Any = $someString")
  println(someString.getClass)
  println(someString.getClass.getSuperclass)

  val someInt: Any = 123123
  println(s"Some integer of type Any = $someInt")
  println(someInt.getClass)
  println(someInt.getClass.getSuperclass)
  println(someInt.getClass.getSuperclass.getSuperclass)

  println(s"Class of Int is ${Int.getClass}")
  println(s"Super class of Int is ${Int.getClass.getSuperclass}")

}
