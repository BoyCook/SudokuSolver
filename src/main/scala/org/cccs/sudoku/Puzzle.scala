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

  /**
   * Set the 9 squares for a small box
   * @param xb position of box
   * @param yb position of box
   * @param v data set built
   * @return
   */
  def set(xb: Int, yb: Int, v: Array[Int]) = {
    val x = xb * 3
    val y = yb * 3
    def loop(xc: Int, yc: Int, n: Int): Array[Int] = {
      data(x + xc)(y + yc) = v(n)
      if (n == 8) v
      else if (xc == 2) loop(0, yc + 1, n + 1)
      else loop(xc + 1, yc, n + 1)
    }
    loop(0, 0, 0)
  }

  /**
   * Set the 9 squares for a row
   * @param y row number
   * @param v data built
   * @return
   */
  def set(y: Int, v: Array[Int]) = {
    def loop(x: Int): Array[Int] = {
      data(x)(y) = v(x)
      if (x == 8) v
      else loop(x+1)
    }
    loop(0)
  }

  def set(x: Int, y: Int, v: Int) = data(x)(y) = v

  def get(x: Int, y: Int): Int = data(x)(y)

  private def boxToString() = {
    def loop(x: Int, y: Int, txt: String): String = {
//      if (x != 0 && x!= 8 && x % 3 == 0) "------------------"
//      if (y != 0 && y!= 8 && y % 3 == 0) " | "

      if (x == 8 && y == 0) txt + " " + data(x)(y)
      else if (x == 8) loop(0, y - 1, txt + " " + data(x)(y) + "\n")
      else loop(x + 1, y, txt + " " + data(x)(y))
    }
    loop(0, 8, "")
  }

  override def toString = {
    boxToString
  }
}
