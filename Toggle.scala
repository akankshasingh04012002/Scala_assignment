object Toggle {
  def main(args: Array[String]): Unit = {
    val inputString = scala.io.StdIn.readLine("Enter a string:")
    println(toggleCase(inputString))
  }

  def toggleCase(string: String): String = {
    var outputString = ""
    try {
      for (index <- 0 to string.length - 1) {
        if (string.charAt(index) >= 'a' && string.charAt(index) <= 'z') {
          outputString = outputString + ((string.charAt(index) - 32).toChar).toString
        }
        if (string.charAt(index) >= 'A' && string(index) <= 'Z') {
          outputString = outputString + ((string.charAt(index) + 32).toChar).toString
        }
      }
      return outputString
    }
    catch {
      case ex: Exception =>
        println("An exception occurred: " + ex.getMessage())
        outputString
    }
  }

}
