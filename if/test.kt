fun main() {
  val a = 10
  // var msg = if (a <= 5){
  //   "aは5以下です"
  // } else if (a <= 10) {
  //   "aは10以下です"
  // } else {
  //   "aは10より大きいです"
  // }
  var msg = if (a <= 5) "aは5以下です" else if (a <= 10) "aは10以下です" else "aは10より大きいです"
  println(msg)
}