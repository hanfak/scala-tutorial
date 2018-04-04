package com.hanfak.ninetynineproblems.ex01

class Ex05 {
  def reverse(aList: List[Int]) = {
    aList.reverse
  }


//  def reverse(aList: List[Int]): List[Int] = aList match {
//    case Nil  => Nil
//    case head :: tail => reverse(tail) ::: List(head)
//  }

//  def reverse[A](aList: List[A]): List[A] =
//    aList.foldLeft(List[A]()) { (r, h) => h :: r }
}
