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
    assert(1 === 1)
  }

  test("setup data") {
    val solver = new Solver
    val data = solver.set(0, 0, Array(1, 2, 3, 4, 5, 6, 7, 8, 9))
    println(data)
  }
}
