package com.hanfak.ninetynineproblems.ex01

object Ex01 extends App {
  def last(ints: List[Int]): Int = {
    ints.reverse.head
  }

//  def last(ints: List[Int]): Int = {
//    ints.last
//  }

//    def last(ints: List[Int]): Int = ints match {
//      case h :: Nil => h
//      case _ :: tail => last(tail)
//      case _ => throw new NoSuchElementException
//    }
}
