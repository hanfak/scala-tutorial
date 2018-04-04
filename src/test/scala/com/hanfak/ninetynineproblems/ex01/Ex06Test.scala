package com.hanfak.ninetynineproblems.ex01

import org.scalatest.FunSuite

class Ex06Test extends FunSuite {
  test("list size greater than one") {
    val ex0 = new Ex06
    val result = ex0.isPalinedrome(List(1, 2, 3, 2, 1))
    assert(result===true)
  }

  test("Not a palindrome") {
    val ex0 = new Ex06
    val result = ex0.isPalinedrome(List(1, 2, 3, 2, 3))
    assert(result===false)
  }
}
