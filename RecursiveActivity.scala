import scala.collection.mutable.ArrayBuffer
import scala.annotation.tailrec

object Main extends App {
  def Main(args: Array[String]): Unit = {
//     println(sum(5)) //q3
//     println(evenOdd(7)) //q4
     println(add(4)) //q5
     println(fib(9)) //q6
  }

  def GCD(a: Int, b: Int): Int = b match {
    case 0          => a
    case x if x > a => GCD(x, a)
    case x          => GCD(x, a % x)
  }

  def prime(a: Int, n: Int = 2): Boolean = n match {
    case x if x == a        => true
    case x if GCD(a, x) > 1 => false
    case x                  => prime(a, x + 1)
  }

  def primeSeq(n: Int): Unit = {}

//  // q3
//  def sum(n:Int):Int = n match{
//    case 1 => n
//    case x if x!=1 => n+sum(n-1)
//  }
//
//  // q4
//  def evenOdd(n:Int):ArrayBuffer = {
//    var Even = new ArrayBuffer[Int]()
//    var Odd = new ArrayBuffer[Int]()
//    if (n%2==0) => Even += n; evenOdd(n-1)
//    else => Odd += n; evenOdd(n-1)
//  }

  //q5
  def add(n: Int): Int = n match {
    case x if x % 2 == 0 => x + add(x - 1) //x =
    case x               => x + add(x - 1) //x =
  }

  //q6
  def fib(n: Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case x => fib(n - 1) + fib(n - 2)
  }
}