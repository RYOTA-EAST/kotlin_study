abstract class Animal(var name: String) {
  abstract fun voice()

  open fun intro() {
    println("私は動物です")
  }
}

class Dog(name:String): Animal(name) {
  override fun voice() {
    println("${name}が鳴きます")
    println("ワン！")
  }
}

class Cat(name:String): Animal(name) {
  override fun voice() {
    println("${name}が鳴きます")
    println("ニャン！")
  }

  override fun intro(){
    println("吾輩は猫である")
  }
}

fun main() {
  val pochi = Dog("Pochi")
  pochi.voice()
  pochi.intro()
  val tama = Cat("Tama")
  tama.voice()
  tama.intro()
}