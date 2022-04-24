fun main() {
  val price = Price(2000)
  price.call()
  price.checkPrice()
}

interface MyInterface {
  var price: Int
  val taxIncludePrice: Int
    get() = (this.price * 1.1).toInt()
  fun checkPrice() {
    println("税込${taxIncludePrice}円です")
  }
}

interface MyInterface2 {
  fun call(){
    println("いらっしゃいませ!MyInterface2です")
  }
}

class Price(var input_price: Int): MyInterface, MyInterface2 {
  override var price = input_price
}