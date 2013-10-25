package org.cccs.sudoku

/**
 * User: boycook
 * Date: 22/10/2013
 * Time: 16:37
 */
class Solver(puzzle: Puzzle) {

  def solve = {
    def loop(x: Int, y: Int, cnt: Int): Boolean = {
      solveSquare(x, y)
      if (x == 8 && y == 8 && cnt == 10) true
      else if (x == 8 && y == 8 && cnt < 10) {
        loop(0, 0, cnt + 1)
      }
      else if (x == 8) loop(0, y + 1, cnt)
      else loop(x + 1, y, cnt)
    }
    loop(0, 0, 0)
  }

  private def solveSquare(x: Int, y: Int): Boolean = {
    /**
     * Check the column, row and box that the square sits in
     * @param i counter
     * @param n value to check
     * @return
     */
    def isNotFree(i: Int, n: Int): Boolean = {
      i < 9 && (puzzle.get(x, i) == n ||
                puzzle.get(i, y) == n ||
                puzzle.get(x/3*3 + i/3, y/3*3 + i%3) == n ||
                isNotFree(i + 1, n))
    }

    /**
     * Check numbers 1-9 to see if they can be used
     * @param n value to check
     * @param acc list of free values to use
     * @return
     */
    def check(n: Int, acc: List[Int]): Boolean = {
      if (n == 10 && acc.length == 1) {
        puzzle.set(x, y, acc(0))
        true
      }
      else if (n == 10) false
      else if (!isNotFree(0, n)) check(n + 1, acc ++ List(n))
      else check(n + 1, acc)
    }

    if (puzzle.get(x, y) == 0) check(1, List()) else true
  }
}


