object Count_Divisors {
  def main(args:Array[String]): Unit={
    print("Enter the first number:")
    val firstnumber: Int = scala.io.StdIn.readInt()
    print("Enter the second number:")
    val secondnumber: Int = scala.io.StdIn.readInt()
    print("Enter the third number:")
    val thirdnumber: Int = scala.io.StdIn.readInt()
    val count = countDivisibleNumbers(firstnumber, secondnumber, thirdnumber)

  }
  def countDivisibleNumbers(firstnumber: Int, secondnumber: Int, thirdnumber: Int): Unit = {
    var count = 0
    // Try clause
    try {
      for (index <- firstnumber to secondnumber) {
        if (index % thirdnumber == 0) {
          count = count + 1
        }
      }
      print(count)
    }
      //catch clause
    catch {
      case x: ArithmeticException => {
        // Display this if exception is found
        println("Exception: A number is not divisible by zero.")
      }
    }
  }


}
