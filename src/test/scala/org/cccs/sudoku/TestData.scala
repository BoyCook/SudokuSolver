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

  val puzzle2 = new Puzzle
  puzzle2.set(8, Array(0, 0, 3, 0, 2, 0, 6, 0, 0))
  puzzle2.set(7, Array(9, 0, 0, 3, 0, 5, 0, 0, 1))
  puzzle2.set(6, Array(0, 0, 1, 8, 0, 6, 4, 0, 0))
  puzzle2.set(5, Array(0, 0, 8, 1, 0, 2, 9, 0, 0))
  puzzle2.set(4, Array(7, 0, 0, 0, 0, 0, 0, 0, 8))
  puzzle2.set(3, Array(0, 0, 6, 7, 0, 8, 2, 0, 0))
  puzzle2.set(2, Array(0, 0, 2, 6, 0, 9, 5, 0, 0))
  puzzle2.set(1, Array(8, 0, 0, 2, 0, 3, 0, 0, 9))
  puzzle2.set(0, Array(0, 0, 5, 0, 1, 0, 3, 0, 0))

  val puzzle3 = new Puzzle
  puzzle3.set(8, Array(2, 0, 0, 0, 8, 0, 3, 0, 0))
  puzzle3.set(7, Array(0, 6, 0, 0, 7, 0, 0, 8, 4))
  puzzle3.set(6, Array(0, 3, 0, 5, 0, 0, 2, 0, 9))
  puzzle3.set(5, Array(0, 0, 0, 1, 0, 5, 4, 0, 8))
  puzzle3.set(4, Array(0, 0, 0, 0, 0, 0, 0, 0, 0))
  puzzle3.set(3, Array(4, 0, 2, 7, 0, 6, 0, 0, 0))
  puzzle3.set(2, Array(3, 0, 1, 0, 0, 7, 0, 4, 0))
  puzzle3.set(1, Array(7, 2, 0, 0, 4, 0, 0, 6, 0))
  puzzle3.set(0, Array(0, 0, 4, 0, 1, 0, 0, 0, 3))

  val puzzle4 = new Puzzle
  puzzle4.set(8, Array(0, 0, 0, 0, 0, 0, 9, 0, 7))
  puzzle4.set(8, Array(0, 0, 0, 4, 2, 0, 1, 8, 0))
  puzzle4.set(8, Array(0, 0, 0, 7, 0, 5, 0, 2, 6))
  puzzle4.set(8, Array(1, 0, 0, 9, 0, 4, 0, 0, 0))
  puzzle4.set(8, Array(0, 5, 0, 0, 0, 0, 0, 4, 0))
  puzzle4.set(8, Array(0, 0, 0, 5, 0, 7, 0, 0, 9))
  puzzle4.set(8, Array(9, 2, 0, 1, 0, 8, 0, 0, 0))
  puzzle4.set(8, Array(0, 3, 4, 0, 5, 9, 0, 0, 0))
  puzzle4.set(8, Array(5, 0, 7, 0, 0, 0, 0, 0, 0))

//  030050040
//  008010500
//  460000012
//  070502080
//  000603000
//  040109030
//  250000098
//  001020600
//  080060020
//
//  020810740
//  700003100
//  090002805
//  009040087
//  400208003
//  160030200
//  302700060
//  005600008
//  076051090

}
