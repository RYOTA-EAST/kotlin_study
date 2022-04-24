fun main(){
  // class Human constructor(name: String, age: Int) {
  //   var name : String
  //   var age : Int

  //   init {
  //     this.name = name
  //     this.age = age
  //   }

  //   fun intro(){
  //     println("私の名前は${this.name}です。${this.age}歳です。")
  //   }
  // }

  // val ryota = Human("亮太", 10)
  // ryota.intro()

  class Human(var name: String = "太郎", var age: Int = 10){
    fun intro(){
      println("私の名前は${this.name}です。${this.age}歳です。")
    }
  }

  val human1 = Human("三郎", 30)
  val human2 = Human("二郎", 20)
  val human3 = Human()

  human1.intro()
  human2.intro()
  human3.intro()
}