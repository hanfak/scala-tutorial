package testingexamples

import com.hanfak.testingexamples.CubeCalculator
import org.scalatest.FunSuite

class CubeCalculatorTest extends FunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)
  }

  test("for minus number") {
    assert(CubeCalculator.cube(-3) === -27)
  }
}