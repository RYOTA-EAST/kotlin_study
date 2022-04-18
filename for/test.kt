fun main() {
  val arr = arrayOf(1, 2, 3) 
  for (item in arr) {
    println(item)
  }

  val map = mapOf("First" to 1, "Second" to 2, "Thitd" to 3)
  for ((key, value) in map) {
    println("${key}:${value}")
  }

  val list = listOf("あ", "い", "う")
  for ((index, value) in list.withIndex()) {
    println("${index}:${value}")
  }

  outer@ for (i in 1..3) {
    for (j in 1..3){
      if (i * j > 5) break@outer
      println("${i * j} ")
    }
    println()
  }
}