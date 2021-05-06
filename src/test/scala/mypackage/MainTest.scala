package mypackage

import munit.FunSuite

class MainTest extends FunSuite {
  test("CubeCalculator.cube") {
    assert(Main.doThing(true) == 1)
    assert(Main.lessThanTen(2) == true)
  }
}
