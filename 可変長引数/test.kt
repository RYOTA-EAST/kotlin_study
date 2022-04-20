fun main() {
  fun allSum(vararg values: Int): Int {
    var result = 0
    for (value in values) {
      result += value
    }
    return result
  }

  val arr = intArrayOf(2, 3, 7, 10)

  println(allSum(4, *arr, 3))
  println(allSum(1, 3, 5, 6))
}