package com.hanfak.ninetynineproblems.ex03

class Ex03 {
//  def nth(i: Int, ints: List[Int]): Int = {
//    ints(i)
//  }


  def nth(i: Int, ints: List[Int]): Int = (i, ints) match {
    case (0, h :: _   ) => h
    case (i, _ :: tail) => nth(i - 1, tail)
    case (_, Nil      ) => throw new NoSuchElementException
  }
}
