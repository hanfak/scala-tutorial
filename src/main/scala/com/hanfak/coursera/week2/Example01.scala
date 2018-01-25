package com.hanfak.coursera.week2

object Example01 extends App {

  def sum(f: Int => Int, a: Int, b: Int): Int = {
    def applyFunctionToEachElementInInterval(a: Int, accumlator: Int): Int = {
      if (a > b) accumlator
      else applyFunctionToEachElementInInterval(a + 1, f(a) + accumlator)
    }
    applyFunctionToEachElementInInterval(a, 0)
  }


  def product(f: Int => Int, a: Int, b: Int): BigInt = {
    def applyFunctionToEachElementInInterval(a: Int, accumlator: BigInt): BigInt = {
      if (a > b) accumlator
      else applyFunctionToEachElementInInterval(a + 1, f(a) * accumlator)
    }
    applyFunctionToEachElementInInterval(a, 1)
  }

  def factorial(n: Int): Int = n match {
    case 0 => 1
    case x => x * factorial(x - 1)
  }


  println(sum(x => x, 1, 100))
  println(sum(x => x * x, 1, 100))
  println(sum(x => factorial(x), 1, 12))
  println(sum(x => x * x * x, 1, 100))

  // product

  println
  println(product(x => x, 1, 10))
  println(product(x => x * x, 1, 10))

  // Factorial in terms of product

  def factorial2(n: Int): BigInt = {
    product(x => x, 1, n)
  }

  println
  println(factorial2(4))


  def product1(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 1
    else f(a) * product1(f)(a + 1, b)

  println(product1(x => x * x)(3, 4))



  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, identity: Int)(a: Int, b:Int): Int =
    if (a > b) identity
    else combine(f(a), mapReduce(f, combine, identity)(a + 1, b))

  def product2(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x * y, 1)(a, b)
  // combine(3, mapReduce(f, c)(4,4)
  // combine(3, combine(4, mapReduce(f, c)(5,4))
  // combine(3, combine(4, 0))
  // combine(3, 4)
  // 7
  //
  def sum2(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x + y, 0)(a, b)

  println
  println(product2(x => x )(3, 4))
  println(sum2(x => x )(3, 4))

}
