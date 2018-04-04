package com.hanfak.ninetynineproblems.ex01

import org.scalatest.FunSuite

class Ex03Test extends FunSuite {
  test("list size greater than one") {
    val ex0 = new Ex03
    assert(ex0.nth(4, List(1, 1, 2, 3, 5, 8)) === 5)
  }
}
