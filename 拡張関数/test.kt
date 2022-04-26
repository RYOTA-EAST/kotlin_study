// fun String.repeat(n:Int): String{
//   var builder = StringBuilder()
//   for (i in 1..n) {
//     builder.append(this)
//   }
//   return builder.toString()
// }

fun Int.repeat_plus(n:Int): Int{
  var num = 0
  for (i in 1..n){
    num += this
  }
  return num
}

fun main(){
  val hoge = "ほげ"
  val num = 3
  println(hoge.repeat(3)) //文字列を引数分繰り返す(Stringの標準メソッド)
  println(hoge.count()) //文字数を返す(Stringの標準メソッド)
  println(num.javaClass.kotlin) //class kotlin.Int
  println(num.repeat_plus(5)) //15 = 3 * 5 (引数の回数繰り返し足す)
  println(num.inc()) //4 = 3 + 1 (1増やす)
}