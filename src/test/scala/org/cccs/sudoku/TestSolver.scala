package org.cccs.sudoku

/**
 * User: boycook
 * Date: 22/10/2013
 * Time: 16:48
 */

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.cccs.sudoku.Solver

@RunWith(classOf[JUnitRunner])
class TestSolver extends FunSuite {

  test("should work") {
    new TestData {
      val solver = new Solver(puzzle1)
      assert(1 === 1)
    }
  }
}
