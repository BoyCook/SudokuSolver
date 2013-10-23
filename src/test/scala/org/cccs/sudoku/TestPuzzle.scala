package org.cccs.sudoku

/**
 * User: boycook
 * Date: 22/10/2013
 * Time: 16:48
 */

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.cccs.sudoku.Puzzle

@RunWith(classOf[JUnitRunner])
class TestPuzzle extends FunSuite {

  test("construct puzzle") {
    val puzzle = new Puzzle
    puzzle.set(0, 0, Array(1, 2, 3, 4, 1, 6, 7, 8, 9))
    puzzle.set(0, 1, Array(1, 2, 3, 4, 2, 6, 7, 8, 9))
    puzzle.set(0, 2, Array(1, 2, 3, 4, 3, 6, 7, 8, 9))
    puzzle.set(1, 0, Array(1, 2, 3, 4, 4, 6, 7, 8, 9))
    puzzle.set(1, 1, Array(1, 2, 3, 4, 5, 6, 7, 8, 9))
    puzzle.set(1, 2, Array(1, 2, 3, 4, 6, 6, 7, 8, 9))
    puzzle.set(2, 0, Array(1, 2, 3, 4, 7, 6, 7, 8, 9))
    puzzle.set(2, 1, Array(1, 2, 3, 4, 8, 6, 7, 8, 9))
    puzzle.set(2, 2, Array(1, 2, 3, 4, 9, 6, 7, 8, 9))
    println(puzzle)
  } 
}
