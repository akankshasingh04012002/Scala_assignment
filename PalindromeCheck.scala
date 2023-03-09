object PalindromeCheck {
  def isPalindrome(string: String): Boolean = {
    val length = string.length
    for (index <- 0 until length / 2) {
      if (string(index) != string(length - index - 1)) {
        return false
      }
    }
    return true
  }

  //defining main class
  def main(args: Array[String]): Unit = {
    //Taking input from user in inputString and pass it to method isPalindrome
    val inputString = scala.io.StdIn.readLine("Enter a string : ")
    if (isPalindrome(inputString)) {
      println("YES")
    }
    else {
      println("NO")
    }
  }
}
