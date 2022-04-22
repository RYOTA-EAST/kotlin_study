fun main() {

  // ローカル関数（関数の中の関数）
  // fun getTriangleArea (width: Double, height: Double): Double {
  //   return width * height / 2
  // }

  //単一式関数は戻り値の型記述、returnは省略できる 
  fun getTriangleArea (width: Double=1.0, height: Double=1.5) = width * height / 2

  println(getTriangleArea(10.0, 11.1))
  println(getTriangleArea())
  println(getTriangleArea(height = 10.0))
  sayHello("Masao")
  val (sum, average) = getSumAverage(3, 4, 8, 1)
  println("${sum} : ${average}")
}

fun getSumAverage(vararg values: Int): Pair<Int, Double> {
  var result = 0
  var count = 0.0
  for (value in values) {
    result += value
    count ++
  }
  return Pair(result, result / count)
}

fun sayHello (name: String): Unit {
  println("Hello, ${name}.")
}