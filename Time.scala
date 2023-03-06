class Time(val hours:Int=0, val minutes:Int=0) {
  val asMinutes:Int = hours * 60+ minutes
  def minus(that:Time): Int= asMinutes - that.asMinutes
  def -(that :Time):Int =minus(that)
}
object Time extends App {
  def fromMinutes(m:Int): Time={
    val hours=m/60
    val minutes= m%60
    new Time(hours,minutes)
  }
}
