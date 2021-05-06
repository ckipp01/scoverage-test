package mypackage

import munit.FunSuite

class MainTest extends FunSuite {
  test("CubeCalculator.cube") {
    assert(Main.doThing(true) == 1)
  }
}
