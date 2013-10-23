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

  val template = "%s %s %s \n" +
                 "%s %s %s \n" +
                 "%s %s %s \n"

  //TODO: use recursive function to do this
  def set(x: Int, y: Int, v: Array[Int]) = {
    // val x1 = x * 3
    // val y1 = y * 3
    // // data(x1)(y1) = v(0)
    // // data(x1 + 1)(y1) = v(1)
    // // data(x1 + 2)(y1) = v(2)
    // // data(x1)(y1 + 1) = v(3)
    // // data(x1 + 1)(y1 + 1) = v(4)
    // // data(x1 + 2)(y1 + 1) = v(5)
    // // data(x1)(y1 + 2) = v(6)
    // // data(x1 + 1)(y1 + 2) = v(7)
    // // data(x1 + 2)(y1 + 2) = v(8)

    def loop(xc: Int, yc: Int, n: Int): Array[Int] = {
      data(x + xc)(y + yc) = v(n)
      if (n == 8) v
      else if (xc == 2) loop(0, yc + 1, n + 1)
      else loop(xc + 1, yc, n + 1)
    }
    loop(0, 0, 0)
  }

  def get(x: Int, y: Int): Int = data(x)(y)

  private def boxToString(x: Int, y: Int) = {
    val x1 = x * 3
    val y1 = y * 3
    format(template,
      data(x1)(y1 + 2), data(x1 + 2)(y1 + 2), data(x1 + 2)(y1 + 2),
      data(x1)(y1 + 1), data(x1 + 1)(y1 + 1), data(x1 + 2)(y1 + 1),
      data(x1)(y1),     data(x1 + 1)(y1),     data(x1 + 2)(y1))
  }

  override def toString = {
    format(template,
        boxToString(0, 0), boxToString(0, 1), boxToString(0, 2),
        boxToString(1, 0), boxToString(1, 1), boxToString(1, 2),
        boxToString(2, 0), boxToString(2, 1), boxToString(2, 2))
  }
}
