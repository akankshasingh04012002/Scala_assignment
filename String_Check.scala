object String_Check {
  def isInteger(string: String): Boolean = {
//    val length = string.length
    var flag = false
    for(index<- 0 until string.length) {

      if(string.charAt(index)=='1'.toInt||string.charAt(index)=='2'.toInt||string.charAt(index)=='3'.toInt||string.charAt(index)=='4'.toInt||string.charAt(index)=='5'.toInt||string.charAt(index)=='6'.toInt||string.charAt(index)=='7'.toInt||string.charAt(index)=='8'.toInt||string.charAt(index)=='9'.toInt||string.charAt(index)=='0'.toInt)
        {
          flag = true
          return flag
        }
      else
        return false
    }
  return flag

  }


  def main(args: Array[String]): Unit = {
    val inputString = scala.io.StdIn.readLine("Enter a string : ")
    if (isInteger(inputString)) {
      print("yes")
    }
    else
      print("no")

  }
}