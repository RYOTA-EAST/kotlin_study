fun main() {
  var str = "kotlin"
  var msg1 = "こんにちは。\n私はkotlinを学んでいます。"
  var msg2 = """こんにちは。
                私はkotlinを学んでいます。"""
  var msg3 = """こんにちは。
                |私は${str}を学んでいます。""".trimMargin()
  println(msg1)
  println(msg2)
  println(msg3)
}