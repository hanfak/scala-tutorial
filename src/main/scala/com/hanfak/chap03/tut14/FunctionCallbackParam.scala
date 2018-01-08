package com.hanfak.chap03.tut14

object FunctionCallbackParam extends App {
  //create Higher Order Function which is a function that takes another function as its parameter.

  def printReport(sendEmailCallback: () => Unit) {
    println("Printing report ... started")
    // look up some data in database and create a report
    println("Printing report ... finished")
    sendEmailCallback()
  }

  printReport(() =>
    println("Sending email ... finished")
  )

  println("\nall a function without providing its callback parameter")

  // Dont want to send email, but print report
  // printReport() // You get compile time error

  printReport(() => {}) // Not that elegant.

  println("\nUse option callback")

  def printReportWithOptionCallback(sendEmailCallback: Option[() => Unit] = None) {
    println("Printing report ... started")
    // look up some data in database and create a report
    println("Printing report ... finished")
    sendEmailCallback.map(callback => callback()) //map() function to filter out any None callback function.
  }

  // Call without sending email
  printReportWithOptionCallback()

  println()
  // Sending email
  printReportWithOptionCallback(Some(() =>
    println("Sending email wrapped in Some() ... finished")
  ))
}
