fun main(){
  class Human {
    var name = "名無し"
    var age = 20
      set(value) {
        if (value < 0){
          println("値が不正です")
        } else {
          field = value
        }
    }

    fun intro(){
      println("私の名前は${name}です。${age}歳です。")
    }
  }

  val human = Human()
  human.intro()
  human.age = 35
  human.name = "ryota"
  human.intro()
  println(human.name)
}