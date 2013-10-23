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
class TestPuzzle extends FunSuite {

  test("construct puzzle via boxes") {
    new TestData {
      println(puzzle1)
      println("---------------------")
      assert(puzzle1.get(0,0) === 1)
      assert(puzzle1.get(1,1) === 1)
      assert(puzzle1.get(4,1) === 2)
      assert(puzzle1.get(7,1) === 3)
      assert(puzzle1.get(1,4) === 4)
      assert(puzzle1.get(4,4) === 5)
      assert(puzzle1.get(7,4) === 6)
      assert(puzzle1.get(1,7) === 7)
      assert(puzzle1.get(4,7) === 8)
      assert(puzzle1.get(7,7) === 9)
      assert(puzzle1.get(8,8) === 9)
    }
  }

  test("construct puzzle via rows") {
    new TestData {
      println(puzzle2)
      assert(puzzle2.get(0,0) === 0)
      assert(puzzle2.get(1,1) === 0)
      assert(puzzle2.get(4,1) === 0)
      assert(puzzle2.get(7,1) === 0)
      assert(puzzle2.get(1,4) === 0)
      assert(puzzle2.get(4,4) === 0)
      assert(puzzle2.get(7,4) === 0)
      assert(puzzle2.get(1,7) === 0)
      assert(puzzle2.get(4,7) === 0)
      assert(puzzle2.get(7,7) === 0)
      assert(puzzle2.get(8,8) === 0)
    }
  }  
}
