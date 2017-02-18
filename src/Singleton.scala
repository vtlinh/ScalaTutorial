object Singleton {
  val cls = Singleton.getClass.asInstanceOf[Class[Singleton]]
  
  def main(args: Array[String]) {
    println("Singleton!")
  }
}