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

  //TODO: use recursive function to do this
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

//    def loop(xc: Int, yc: Int, n: Int): Array[Int] = {
//      data(x + xc)(y + yc) = v(n)
//      if (n == 8) v
//      else if (xc == 2) loop(0, yc + 1, n + 1)
//      else loop(xc + 1, yc, n + 1)
//    }
//    loop(0, 0, 0)
  }

  def get(x: Int, y: Int): Int = data(x)(y)

  private def boxToString() = {
    def loop(x: Int, y: Int, txt: String): String = {
      if (x == 8 && y == 8) txt + " " + data(x)(y)
      else if (x == 8) loop(0, y + 1, txt + " " + data(x)(y) + "\n")
      else loop(x + 1, y, txt + " " + data(x)(y))
    }
    loop(0, 0, "")
  }

  override def toString = {
    boxToString
  }
}
