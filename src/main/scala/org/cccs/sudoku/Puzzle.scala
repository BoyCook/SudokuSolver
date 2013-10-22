package org.cccs.sudoku

/**
 * User: boycook
 * Date: 22/10/2013
 * Time: 18:33
 */
class Puzzle {
  /*
      9 * 9 grid made up of
      3 * 3 grid * 3 * 3
   */
  val data = Array.ofDim[Int](9, 9)

  def set(x: Int, y: Int, v: Array[Int]) = {
    val x1 = x * 3
    val y1 = y * 3
    data(x1)(y1) = v(0)
    data(x1 + 1)(y1) = v(1)
    data(x1 + 2)(y1) = v(2)
    data(x1)(y1 + 1) = v(3)
    data(x1 + 1)(y1 + 1) = v(4)
    data(x1 + 2)(y1 + 1) = v(5)
    data(x1)(y1 + 2) = v(6)
    data(x1 + 1)(y1 + 2) = v(7)
    data(x1 + 2)(y1 + 2) = v(8)
    data
  }

  def set(x: Int, y: Int, v: Int) = data(x)(y) = v

  val template = "%s %s %s \n" +
                 "%s %s %s \n" +
                 "%s %s %s \n"

  private def boxToString(x: Int, y: Int) = {
    val x1 = x * 3
    val y1 = y * 3
    format(template,
      data(x1 + 2)(y1), data(x1 + 2)(y1 + 1), data(x1 + 2)(y1 + 2),
      data(x1 + 1)(y1), data(x1 + 1)(y1 + 1), data(x1 + 1)(y1 + 2),
      data(x1)(y1), data(x1)(y1 + 1), data(x1)(y1 + 2))
  }

  override def toString = {
    boxToString(0, 0)
  }
}
