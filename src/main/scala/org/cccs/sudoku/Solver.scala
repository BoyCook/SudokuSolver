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
      def getBox(v: Int) = (v + 1) / 3 + {
        if (v % 3 > 0) 1 else 0
      }
      val xs = getBox(x)
      val ys = getBox(y)
//      println(format("x = '%d' y = '%d' | xs = '%d' ys = '%d'", x, y, xs, ys))
      def loop(xc: Int, yc: Int, found: Boolean): Boolean = {
        val s = puzzle.get(xs + xc, ys + yc)
        if (xc == 2 && yc == 2) found
        else if (xc == 2) loop(0, yc + 1, s == n)
        else loop(xc + 1, yc, s == n)
      }
      loop(0, 0, found = false)
    }

    def isInRow(n: Int): Boolean = {
      def loop(x: Int, found: Boolean): Boolean = {
        if (found || x == 9) found
        else if (x < 8) loop(x + 1, puzzle.get(x, y) == n)
        else false
      }
      loop(0, found = false)
    }

    def isInColumn(n: Int): Boolean = {
      def loop(y: Int, found: Boolean): Boolean = {
        if (found || y == 9) found
        else if (y < 8) loop(y + 1, puzzle.get(x, y) == n)
        else false
      }
      loop(0, found = false)
    }

    def isFree(n: Int): Boolean = {
      !isInRow(n) && !isInColumn(n) && !isInBox(n)
    }

    val s = puzzle.get(x, y)
    if (s == 0) {
      def loop(n: Int, acc: List[Int]): List[Int] = {
        if (n == 10) acc
        else if (isFree(n)) loop(n + 1, acc ++ List(n))
        else loop(n + 1, acc)
      }
      val free = loop(1, List())

      println(format("Free for (%d)(%d) - [%s]", x, y, free))

      if (free.length == 1) puzzle.set(x, y, free(0))

      free.length > 0
    } else true
  }
}


