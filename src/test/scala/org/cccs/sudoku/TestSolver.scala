package org.cccs.sudoku

/**
 * User: boycook
 * Date: 22/10/2013
 * Time: 16:48
 */

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TestSolver extends FunSuite {

  test("should work for puzzle 2") {
    new TestData {
      val solver = new Solver(puzzle2)
      solver.solve
      println(puzzle2)
    }
  }

  test("should work for puzzle 3") {
    new TestData {
      val solver = new Solver(puzzle3)
      solver.solve
      println(puzzle3)
    }
  }

  test("should work for puzzle 4") {
    new TestData {
      val solver = new Solver(puzzle4)
      solver.solve
      println(puzzle4)
    }
  }
}
