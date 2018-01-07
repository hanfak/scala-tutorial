package com.hanfak.chap03.tut09

object VariableArgFunction extends App {
  def printReport(names: String*) {
    println(s"""Some Report = ${names.mkString(", ")}""")
  }

  printReport("Book 1", "Book 2", "Book3")
  printReport("The Book")
  printReport()

  val bookList: List[String] = List("Book 1", "Book 2", "Book3")
  printReport(bookList: _*) //use type ascription, use for list/seq/array etc

}
