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
      if (x == 8 && y == 8 && cnt == 5) true
      else if (x == 8 && y == 8 && cnt < 5) {
        println("-----------------------------------------------------")
        loop(0, 0, cnt + 1)
      }
      else if (x == 8) loop(0, y + 1, cnt)
      else loop(x + 1, y, cnt)
    }
    loop(0, 0, 0)
  }

  private def solveSquare(x: Int, y: Int): Boolean = {
    def isFree(i: Int, n: Int): Boolean = {
      i < 9 && (puzzle.get(x, i) == n ||
                puzzle.get(i, y) == n ||
                puzzle.get(x/3*3 + i/3, y/3*3 + i%3) == n ||
                isFree(i + 1, n))
    }

    val s = puzzle.get(x, y)
    if (s == 0) {
      def loop(n: Int, acc: List[Int]): List[Int] = {
        if (n == 10) acc
        else if (!isFree(0, n)) loop(n + 1, acc ++ List(n))
        else loop(n + 1, acc)
      }
      val free = loop(1, List())

      println(format("Free for (%d)(%d) - [%s]", x, y, free))

      if (free.length == 1) puzzle.set(x, y, free(0))

      free.length > 0
    } else true
  }
}


