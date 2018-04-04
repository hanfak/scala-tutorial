package com.hanfak.ninetynineproblems.ex01

class Ex04 {
//  def length(aList: List[Int]) = {
//    aList.size
//  }

  def length(aList: List[Int]) : Int = aList match {
    case Nil => 0
    case head :: tail => 1 + length(tail)
  }

//  def length(aList: List[Int]) : Int = {
//    aList.foldLeft(0) {
//      (total, _) => total + 1
//    }
//  }

//    def length[A](aList: List[A]) : Int = {
//      def lengthRecursive(result: Int, currentList: List[A]): Int = currentList match {
//        case Nil       => result
//        case _ :: tail => lengthRecursive(result + 1, tail)
//      }
//      lengthRecursive(0, aList)
//    }
}
