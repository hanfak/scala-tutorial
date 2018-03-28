package com.hanfak.ninetynineproblems.ex01

import org.scalatest.FunSuite

class Ex01Test extends FunSuite {
  test("list size greater than one") {
    assert(Ex01.last(List(1, 1, 2, 3, 5, 8)) === 8)
  }

  test("list size of one") {
    assert(Ex01.last(List(1)) === 1)
  }

}
