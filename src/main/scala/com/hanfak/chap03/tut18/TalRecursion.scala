package com.hanfak.chap03.tut18

object TalRecursion extends  App {
  //Tail recursive function will help prevent overflow in
  // your call stack because the evaluation of your looping construct happens at each step.


  val arrayItems: Array[String] = Array("Book", "Hat", "Ball", "Cup")

  //The @annotation.tailrec instructs the compiler to add any optimisations with regards to stack frame management as this function is recursive.
  @annotation.tailrec
  def search(item: String, items: Array[String], index: Int): Option[Boolean] = {
    if(items.length == index) {
      None
    } else if(items(index) == item) {
      Some(true)
    } else {
      val nextIndex = index + 1
      search(item, items, nextIndex)
    }
  }


  val found = search("Ball", arrayItems, 0)
  println(s"Find Ball = $found")

  val notFound = search("Chocolate Donut", arrayItems, 0)
  println(s"Find Chocolate Donut = $notFound")

}
