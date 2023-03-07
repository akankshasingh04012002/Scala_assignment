object CountDivisor {
  def countDivisibleNumbers(A: Int, B: Int, C: Int): Int = {
  val X = ((A - 1) / C + 1) * C
  val Y = (B / C) * C
  val count = (Y - X) / C + 1
  return count
}

def main(args: Array[String]) {
  val A = 1
  val B = 10
  val C = 2
  val count = countDivisibleNumbers(A, B, C)
  println(count)
  // Output: 5
}

}
