package com.hanfak.chap04.tut10

object PackageObject extends App {

  //Objects and Implicit conversions declared inside Package Objects, as the name implies, will be accessible to any classes or traits in the given package. In addition, Package Objects make it easy to inject these Objects and Implicit conversions into other scopes within your application.

  object PackageObject_Tutorial extends App {

//    println("\nStep 1: How to add JodaTime dependency in build.sbt")
//    //  libraryDependencies ++= Seq(
//    //    "joda-time"     % "joda-time"     % "2.9.3",
//    //    "org.joda"      % "joda-convert"  % "1.8"
//    //  )
//
//
//
//    println("\nStep 5: How to create instances or objects for the Donut case class from package object")
//    val vanillaDonut: Donut = Donut("Vanilla", 1.50)
//    println(s"Vanilla donut name = ${vanillaDonut.name}")
//    println(s"Vanilla donut price = ${vanillaDonut.price}")
//    println(s"Vanilla donut produceCode = ${vanillaDonut.productCode}")
//    println(s"Vanilla donut uuid = ${vanillaDonut.uuid}")
//
//
//
//    println("\nStep 6: How to create new JodaTime instance using DateTime alias from package object")
//    val today = new DateTime()
//    println(s"today = $today, datetime class = ${today.getClass}")
  }

}
