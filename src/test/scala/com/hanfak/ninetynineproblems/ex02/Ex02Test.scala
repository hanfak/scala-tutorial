package com.hanfak.ninetynineproblems.ex02

import org.scalatest.FunSuite

class Ex02Test extends FunSuite {
  test("list size greater than one") {
    val ex0 = new Ex02
    assert(ex0.penultimate(List(1, 1, 2, 3, 5, 8)) === 5)
  }

  test("list size two") {
    val ex0 = new Ex02
    assert(ex0.penultimate(List(5, 8)) === 5)
  }

  test("list size three") {
    val ex0 = new Ex02
    assert(ex0.penultimate(List(6, 5, 8)) === 5)
  }

}
