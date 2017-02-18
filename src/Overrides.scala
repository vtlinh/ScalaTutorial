
class Boo(val i: Int, val j: Int, val k: Int) {
  def main(args: Array[String]) {
    println("i: " + i + ", j: " + j + ", k: " + k)
  }
}

class Foo(override val i: Int, override val j: Int) extends Boo(i, j, 25)
class Overrides(override val i: Int = 5, override val j: Int) extends Foo(i, j)