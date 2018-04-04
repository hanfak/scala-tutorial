package com.hanfak.ninetynineproblems.ex01

import org.scalatest.FunSuite

class Ex05Test extends FunSuite {
  test("list size greater than one") {
    val ex0 = new Ex05
    assert(ex0.reverse(List(1, 1, 2, 3, 5, 8)) === List(8,5,3,2,1,1))
  }

  test("list size is one") {
    val ex0 = new Ex05
    assert(ex0.reverse(List(8)) === List(8))
  }

  test("list size is empty") {
    val ex0 = new Ex05
    assert(ex0.reverse(List.empty) === List.empty)
  }
}
