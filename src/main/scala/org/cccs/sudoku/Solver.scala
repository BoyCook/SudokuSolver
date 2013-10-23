package org.cccs.sudoku

/**
 * User: boycook
 * Date: 22/10/2013
 * Time: 16:37
 */
class Solver(puzzle: Puzzle) {

  def solve = {
    def loop(x: Int, y: Int): Boolean = {
      solveSquare(x, y)
      if (x == 8 && y == 8) false
      else if (x == 8) loop(0, y + 1)
      else loop(x + 1, y)
    }
    loop(0, 0)
  }

  private def solveSquare(x: Int, y: Int): Boolean = {
    def isInBox(n: Int) = {
      val xs = x * 3
      val ys = y * 3
      def loop(xc: Int, yc: Int, found: Boolean): Boolean = {
        val s = puzzle.get(xs + xc, ys + yc)
        if (xc == 2 && yc == 2) found
        else if (xc == 2) loop(0, yc + 1, s == n)
        else loop(xc + 1, yc, s == n)
      }
      loop(0, 0, false)
    }

    def isInRow(n: Int): Boolean = {
      def loop(x: Int, found: Boolean): Boolean = {
        if (found || x == 8) found
        else if (x < 8) loop(x + 1, puzzle.get(x, y) == n)
        else false
      }
      loop(0, found = false)
    }

    def isInColumn(n: Int): Boolean = {
      def loop(y: Int, found: Boolean): Boolean = {
        if (found || y == 8) found
        else if (y < 8) loop(y + 1, puzzle.get(x, y) == n)
        else false
      }
      loop(0, found = false)
    }

    def estimate(n: Int, free: Array[Int]): Boolean = {
      println(format("Estimating for [%d] [%s] [%s] [%s]", n, isInRow(n), isInColumn(n), isInBox(n)))
      false
    }

    val s = puzzle.get(x, y)
    if (s == 0) estimate(1, Array()) else true
  }
}


