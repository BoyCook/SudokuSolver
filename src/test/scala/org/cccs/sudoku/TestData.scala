package org.cccs.sudoku

/**
 * User: boycook
 * Date: 23/10/2013
 * Time: 16:09
 */
trait TestData {
  val puzzle1 = new Puzzle
  puzzle1.set(0, 0, Array(1, 2, 3, 4, 1, 6, 7, 8, 9))
  puzzle1.set(1, 0, Array(1, 2, 3, 4, 2, 6, 7, 8, 9))
  puzzle1.set(2, 0, Array(1, 2, 3, 4, 3, 6, 7, 8, 9))
  puzzle1.set(0, 1, Array(1, 2, 3, 4, 4, 6, 7, 8, 9))
  puzzle1.set(1, 1, Array(1, 2, 3, 4, 5, 6, 7, 8, 9))
  puzzle1.set(2, 1, Array(1, 2, 3, 4, 6, 6, 7, 8, 9))
  puzzle1.set(0, 2, Array(1, 2, 3, 4, 7, 6, 7, 8, 9))
  puzzle1.set(1, 2, Array(1, 2, 3, 4, 8, 6, 7, 8, 9))
  puzzle1.set(2, 2, Array(1, 2, 3, 4, 9, 6, 7, 8, 9))
  
  
}
