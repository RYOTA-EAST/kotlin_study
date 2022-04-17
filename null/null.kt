fun main(){
  var str: String? = "hello"
  str = null
  println(str)

  var a: Int = 10000
  var b: Int = a
  var c: Int? = a
  println(a == b)
  println(a === b)
  println(a == c)
  println(a === c)
}