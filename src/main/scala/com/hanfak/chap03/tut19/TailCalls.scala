package com.hanfak.chap03.tut19

import scala.util.control.TailCalls.{TailRec, _}

object TailCalls extends App {

  val arrayItems: Array[String] = Array("Book", "Hat", "Ball", "Cup")

  def tailSearch(itemName: String, items: Array[String], index: Int): TailRec[Option[Boolean]] = {
    if(items.length == index) {
      done(None)
    } else if(items(index) == itemName) {
      done(Some(true))
    } else {
      val nextIndex = index + 1
      tailcall(tailSearch(itemName, items, nextIndex))
    }
  }


  val found = tailcall(tailSearch("Ball", arrayItems, 0))
  println(s"Find Ball = ${found.result}")

  val notFound = tailcall(tailSearch("Chocolate Donut", arrayItems, 0))
  println(s"Find Chocolate Donut = ${notFound.result}")
}
