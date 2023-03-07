object AnonymousObject {
  def main(args: Array[String]): Unit = {


  val doubler: Int => Int = (x:Int) => x*2
    val tripler: Int => Int = x => x * 3
    val quadrapler = (x: Int) => x * 4

    val str: (String, String) => String = (str1: String, str2: String) => str1 + str2
    println(str("abc","cde"))
    println(doubler(2))
    println(tripler(3))
    println(quadrapler(4))
  }

}
