fun main() {
  val a = 10
  a = 11  //error
  println(a)

  val b = arrayOf(1, 2, 3)
  // a = arrayOf(4, 5, 6)  //error
  b[2] = 4
  println(b[2])
}