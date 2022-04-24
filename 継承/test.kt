fun main(){
  open class Human(var name: String) {
    open fun intro(){
      println("私の名前は${this.name}です。")
    }
  }

  class PerfectHuman(name: String, var place: String): Human(name) {
    override fun intro(){
      println("${this.name}! ${this.name}! I'm a parfect human.")
      super.intro()
    }
    fun liveIn() {
      println("We live in ${this.place}.")
    }
  }

  val nakata = PerfectHuman("Nakata", "Tokyo")
  nakata.liveIn()
  nakata.intro()
}