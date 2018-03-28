package com.hanfak.ninetynineproblems.ex02

class Ex02 {
  def penultimate(ints: List[Int]): Int = {
    ints.reverse(1);
  }

//  def penultimate(ints: List[Int]): Int = ints match {
//    case head :: _ ::  Nil => head
//    case _ :: tail => penultimate(tail)
//    case _ => throw new NoSuchElementException
//  }
}
