import scala.collection.mutable.ListBuffer

object FunctionsAndData extends App {

  //question 1
  class Rational(a: Int, b: Int) {
    def num = a
    def denom = b

    def neg = new Rational(-this.num, this.denom)

    //question 2
    def sub(n: Rational) = new Rational(this.num * n.denom + this.denom * n.neg.num, this.denom * n.denom)
  }

  //question 3
  class Account(n:String, m:Int, b:Double){
    val nic:String = n
    val accNum:Int = m
    var balance:Double = b

    def transfer(a:Account, b:Double):Unit = {
      a.balance = a.balance + b;
      this.balance = this.balance - b;
    }
  }

  //question 4
  var Bank:ListBuffer[Account] = ListBuffer();

  //question 4.1
  def negBalAccounts(x:ListBuffer[Account]):ListBuffer[Account] = {
    var result:ListBuffer[Account] = ListBuffer()
    for(i <- 0 until x.length){
      if(x(i).balance < 0.0){result += x(i)}
    }
    return result
  }

  //question 4.2
  def accBalance(x:ListBuffer[Account]):Double = {
    var sum:Double = 0
    for(i <- 0 until x.length){sum = sum + x(i).balance}
    return sum
  }

  //question 4.3
  def finalBalance(x:ListBuffer[Account]):Double = {
    var sum:Double = 0
    for(i <- 0 until x.length){
      var bal:Double = x(i).balance
      if(bal < 0) sum = sum+(bal*1.1)
      else sum = sum+(bal*1.05)}
    return  sum
  }

  //DISPLAYING OUTPUT

  //question 1,2
  var x = new Rational(3,4)
  var y = new Rational(5,8)
  var z = new Rational(2,7)
  var result = new Rational(x.sub(y.sub(z)).num, x.sub(y.sub(z)).denom)
  println(result.num + "/" + result.denom)

  //question 3
  var a = new Account("9912334567v",233, 12000.00)
  var b = new Account("877654321v", 148, 20000.00)
  a.transfer(b,4000.00)
  println("balance of transferring account " + a.balance)
  println("balance of receiving account " + b.balance)

  //question 4
  var c = new Account("901234567v", 30, 120000.00)
  var d = new Account("651234567v", 213, -24000.00)
  var e = new Account("721234567v",156, -14000.00)

  //question 4.1
  Bank+=a;Bank+=b;Bank+=c;Bank+=d;Bank+=e;
  var negAccounts:ListBuffer[Account] = negBalAccounts(Bank)
  for(i <- 0 until negAccounts.length){printf(negAccounts(i).accNum + ",")}
  println

  //question 4.2
  println(accBalance(Bank))

  //question 4.3
  println(finalBalance(Bank))
}
