package org.cccs.sudoku

/**
 * User: boycook
 * Date: 22/10/2013
 * Time: 16:37
 */
class Solver(puzzle: Puzzle) {
  /**
   * Check each square in the 9*9 grid
   * @return
   */
  def solve = {
    def loop(x: Int, y: Int, solved: Boolean): Boolean = {
      if (x == 8 && y == 8 && solved) true
      else if (x == 8 && y == 8 && !solved) loop(0, 0, true)
      else if (x == 8) loop(0, y + 1, if (!solveSquare(x, y)) false else solved)
      else loop(x + 1, y, if (!solveSquare(x, y)) false else solved)
    }
    loop(0, 0, true)
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
