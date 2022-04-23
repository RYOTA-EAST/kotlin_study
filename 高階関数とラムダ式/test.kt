fun main() {
  // // 高階関数
  // fun output(n:Int) {
  //   println(n)
  // }
  val arr = arrayOf(1, 2, 3, 4)
  // arr.forEach(::output)

  // // ラムダ式
  // arr.forEach({ n: Int -> println(n) })
  // // 省略
  // arr.forEach { println(it) }

  // ラベル構文
  arr.forEach {
    // if (it == 3) return //main関数事終了する
    if (it == 3) return@forEach
    // println(it)
  }
  // println("終了しました")



  val time = benchmark("ミリ秒") {
    var x = 0
    for (i in 1..1_000) {
      Thread.sleep(1) //1ms待機
      x++
    }
  }

  println("処理時間：" + time)
}

  fun benchmark(unitStr: String, func: ()-> Unit): String {
    val start = System.currentTimeMillis()
    println(start)
    func()
    val end = System.currentTimeMillis()
    println(end)
    return (end - start).toString() + unitStr
  }