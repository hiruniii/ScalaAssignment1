import scala.math.{pow, sqrt}
object CaseClass extends App{
  val p1 = Point(3,5)
  val p2 = Point(8,6)

  println("Addition of p1 and p2 = " + p1.+(p2))
  println("Move p1 by d -> " + p1.move(1,2))
  println("Distance between p1 and p2 = " + p1.distance(p2))
  println("Inversion of p1 = " + p1.invert())
}

case class Point(a:Int, b:Int){
  def x = a;
  def y = b;

  def +(p:Point) = Point(this.x + p.x,this.y + p.y)
  def move(dx:Int, dy:Int) = Point(this.x + dx, this.y + dy)
  def distance(p:Point):Double = (sqrt(pow((this.x - p.x),2) + pow((this.y - p.y),2)))
  def invert() = Point(this.y, this.x)
}
