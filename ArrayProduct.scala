class ArrayProduct(val array : Array[Int])
{
  def arrayComponents : Unit =
  {
    var productOfArrayComponents  = 1
    for(index <- 0 to (array.length-1))
    {
      productOfArrayComponents = productOfArrayComponents * array(index)
    }
    println(" The calculated product of the array components :- "+ productOfArrayComponents)
  }
}
object ArrayProduct
{
  def main(args:Array[String]): Unit =
  {
    var array = Array(1,2,3,4,5)
    val getArrayProduct = new ArrayProduct(array)
    getArrayProduct.arrayComponents
  }
}