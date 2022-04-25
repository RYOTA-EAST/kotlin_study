data class Member(var name: String = "") {
  var age: Int = 0
}

data class Member2(val name: String, val job: String, val age: Int)

fun main() {
  val m1 = Member("佐藤")
  m1.age = 30
  val m2 = Member("佐藤")
  m2.age = 30
  println(m1 == m2) //true
  println(m1) //Member(name=佐藤)

  val m3 = Member2("海崎", "フリーター", 27)
  val (name, job, age) = m3
  println(m3) //Member2(name=海崎, job=フリーター, age=27)
  println(age) //27
  val m4 = m3.copy(age = 28)
  println(m4) //Member2(name=海崎, job=フリーター, age=28)
  println(m4.age) //28
}