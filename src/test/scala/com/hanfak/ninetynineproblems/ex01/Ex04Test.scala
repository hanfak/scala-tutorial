package com.hanfak.ninetynineproblems.ex01

import org.scalatest.FunSuite

class Ex04Test extends FunSuite {
  test("list size greater than one") {
    val ex0 = new Ex04
    assert(ex0.length(List(1, 1, 2, 3, 5, 8)) === 6)
  }

  test("list size is one") {
    val ex0 = new Ex04
    assert(ex0.length(List(8)) === 1)
  }

  test("list size is zero") {
    val ex0 = new Ex04
    assert(ex0.length(List.empty) === 0)
  }
}
