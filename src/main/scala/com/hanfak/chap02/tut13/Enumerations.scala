package com.hanfak.chap02.tut13

object Enumerations  extends  App {

  object Position extends Enumeration {
    type Position = Value

    val Defender      = Value("Defender")
    val Midfielder  = Value("Midfielder")
    val Forward       = Value("Forward")
    val Goalkeeper     = Value("Goalkeeper")
  }

  println(s"Forward string value = ${Position.Forward}")
  println(s"Forward id = ${Position.Forward.id}")
  println(s"All values of position = ${Position.values}")

  Position.values.foreach {
    case d if d == Position.Forward || d == Position.Defender => println(s"Found favourite Position = $d")
    case _ => None
  }


  object Taste extends Enumeration {
    type Taste = Value

    val Tasty       = Value(0, "Tasty")
    val VeryTasty   = Value(1, "Very Tasty")
    val Ok          = Value(-1, "Ok")
  }

  println(s"Taste values = ${Taste.values}")
  println(s"Taste of OK id = ${Taste.Ok.id}")
}
