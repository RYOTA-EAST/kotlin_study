fun main(){
  var a = arrayOf(1, 2, 3)
  var b = intArrayOf(1, 2, 3)
  var c: Array<String?> = arrayOfNulls(3)
  var d = Array(3, {i -> i * 2})

  var list = mutableListOf(1, 2, 3)
  list[2] = 4

  var set = setOf("B", "B", "A", "C", "D", "A")
  var map = mapOf("First" to 1, "second" to 2, "third" to 3)
  println(a)
  println(b[1])
  println(c[1])
  println(d[2])

  println(list)
  println(set)
  println(map)
  println(map["First"])
}