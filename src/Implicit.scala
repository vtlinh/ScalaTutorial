

class Implicit(x: Int, txt: String) {
  implicit class XTimes(x: Int) {
    def times [A](f: => A): Unit = {
      def loop(current: Int): Unit = {
        if (current > 0) {
          f
          loop(current - 1)
        }
      }
      loop(x)
    }
  }
  
  def main(args: Array[String]) {
    x times print(txt)
  }
}