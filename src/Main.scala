

object Main {
  def main(args: Array[String]) {
    val hw = new HelloWorld()
    run(hw.getClass, hw.main);
    
    run(Singleton.cls, Singleton.main)
    
    val ovrds = new Overrides(j=15)
    run(ovrds.getClass, ovrds.main)
    
    val implc = new Implicit(3, "*test*")
    run(implc.getClass, implc.main)
  }
  
  def run [A](klass: Class[_], f: Array[String] => A) {
    println(klass.getSimpleName() + ".class")
    f(null)
    println()
  }
}