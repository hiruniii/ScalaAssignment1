import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readInt
import scala.io.StdIn._

object Cypher2 extends App {

  var Alphabet = new ListBuffer[Char]()
  for(i <- 'A' to 'Z'){
    Alphabet += i
  }

  var cypherIndex:Int = 0         //index in alphabet of the plaintext letter's corresponding cypher

  def Encode(): String = {

    //take inputs
    println("Enter shift value- ")
    val shift = readInt()
    println("Enter plaintext- ")
    val plaintext = readLine()
    var cyphertext: String = null

    for(x <- 0 until plaintext.length()) {
      if (Character.isLetter(plaintext.charAt(x))) {
        cypherIndex = Alphabet.indexOf(plaintext(x)) + shift
        if(cyphertext == null){cyphertext = (Alphabet(cypherIndex).toString)}
        else{cyphertext += Alphabet(cypherIndex)}
      }
      else{
        if(cyphertext == null){cyphertext = plaintext(x).toString}
        else{cyphertext += plaintext(x)}
      }
    }

    return cyphertext
  }

  def Decode():String = {

    //take inputs
    println("Enter shift value- ")
    val shift = readInt()
    println("Enter cyphertext- ")
    val cyphertext = readLine()
    var plaintext: String = null

    for(x <- 0 until cyphertext.length()) {
      if (Character.isLetter(cyphertext.charAt(x))) {
        cypherIndex = Alphabet.indexOf(cyphertext(x)) - shift
        if(plaintext == null){plaintext = (Alphabet(cypherIndex).toString)}
        else{plaintext += Alphabet(cypherIndex)}
      }
      else{
        if(plaintext == null){plaintext = cyphertext(x).toString}
        else{plaintext += cyphertext(x)}
      }
    }
    return plaintext
  }

  println(Encode())
  println(Decode())

}