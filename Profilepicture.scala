object Profilepicture {
  def main(args: Array[String]): Unit = {

    def dimentionCheck(width: Int, height: Int, length: Int): String = {
      if (width < length || height < length) {
        "UPLOAD ANOTHER"
      } else if (width == height) {
        "ACCEPTED"
      } else {
        "CROP IT"
      }
    }
    try {
      println("Enter the length: ")
      val length = scala.io.StdIn.readInt()
      println("Enter the width:")
      val width = scala.io.StdIn.readInt()
      println("Enter the height:")
      val height = scala.io.StdIn.readInt()
      println(dimentionCheck(width, height, length))
    }
    catch {
      case e: NumberFormatException => println("Exception caught")
    }
  }


}
