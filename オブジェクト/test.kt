object TanakaTaro{
  val name = "田中太郎"
  var clothe = "Tシャツ"

  fun intro() {
    println("${name}は${clothe}を着ている")
  }
}

fun main(){
  TanakaTaro.clothe = "Yシャツ"
  TanakaTaro.intro()
}