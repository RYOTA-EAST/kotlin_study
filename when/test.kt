fun main() {
  val x = 0
  when (x) {
    1 -> println("xは1です")
    2 -> println("xは2です")
    else -> {
      println("xは1でも2でも無いです")
    }
  }

  var b = 10
  when {
    b <= 5 -> println("aは5以下です")
    b <= 10 -> println("aは10以下です")
    else -> println("aは10より大きいです")
  }

  var obj: Any = "あいうえお"
  when (obj) {
    is String -> println("文字数は${obj.length}です")
    else -> println("String型ではない型です")
  }
}