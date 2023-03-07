object String_Check {
  def isInteger(string: String): Boolean =
  {

    var flag = false
    for (index <- 0 until string.length)
    {

      if (string(index) == '1' || string(index) == '2' || string(index) == '3' || string(index) == '4' || string(index) == '5' || string(index) == '6' || string(index) == '7' || string(index) == '8' || string(index) == '9' || string(index) == '0') {
        flag = true

      }
      else
        flag= false
    }
     flag

  }


  def main(args: Array[String]): Unit = {
    val inputString = scala.io.StdIn.readLine("Enter a string : ")
    println(isInteger(inputString))

  }
}