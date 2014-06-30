package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
    if (c == 0 || c == r) 1
    else pascal(c, r - 1) + pascal(c - 1, r - 1)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean =
    {
      def loop(chars: List[Char], parenthesis: Int): Boolean =
        if (chars.isEmpty) parenthesis == 0
        else if (chars.head == ')' && parenthesis <= 0) false
        else if (chars.head == ')') loop(chars.tail, parenthesis - 1)
        else if (chars.head == '(') loop(chars.tail, parenthesis + 1)
        else loop(chars.tail, parenthesis)
      loop(chars, 0)
    }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int =
    {
      def loop(moneyLeft: Int, values: List[Int]): Int =
        if (moneyLeft == 0) 1
        else if (moneyLeft < 0) 0
        else if (values.isEmpty && moneyLeft > 0) 0
        else loop(moneyLeft, values.tail) + loop(moneyLeft - values.head, values)
      loop(money, coins)
    }
}
