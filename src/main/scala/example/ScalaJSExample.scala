package example
import scala.js._
import scala.js.{KeyboardEvent, CanvasRenderingContext2D, HTMLCanvasElement, JsGlobals}
import scala.util.Random
import scala.collection.mutable

case class Point(x: Int, y: Int){
  def +(other: Point) = Point(x + other.x, y + other.y)
  def -(other: Point) = Point(x - other.x, y - other.y)
  def %(other: Point) = Point(x % other.x, y % other.y)
  def rotate(theta: Double) = {
    val (cos, sin) = (Math.cos(theta), math.sin(theta))
    Point((cos * x - sin * y).toInt, (sin * x + cos * y).toInt)
  }
}

object Asteroid{
  val sizes = Seq(20, 40, 80)
}

class Asteroid(val level: Int, var position: Point, val momentum: Point){
  def draw(ctx: CanvasRenderingContext2D) = {
    val size = Asteroid.sizes(level)
    ctx.fillRect(position.x - size/2, position.y - size/2, size, size)
  }
  def move() = {
    position += momentum
    position += ScalaJSExample.bounds
    position %= ScalaJSExample.bounds
  }
}

class Craft(var position: Point, var momentum: Point, var theta: Double){
  def draw(ctx: CanvasRenderingContext2D) = {
    ctx.beginPath()
    val p1 = Point(100, 0).rotate(theta) + position
    val p2 = Point(-50, -50).rotate(theta + Math.PI * 2/3) + position
    val p3 = Point(-50, 50).rotate(theta + Math.PI * 4/3) + position

    ctx.lineTo(p1.x, p1.y)
    ctx.lineTo(p2.x, p2.y)
    ctx.lineTo(p3.x, p3.y)
    ctx.lineTo(p1.x, p1.y)
    ctx.fill()
  }
  def move() = {
    position += momentum
    position += ScalaJSExample.bounds
    position %= ScalaJSExample.bounds
    if (ScalaJSExample.keys(37)) theta += 0.1
    if (ScalaJSExample.keys(39)) theta += 0.1
  }
}
class Bullet(var position: Point, val momentum: Point)

object ScalaJSExample {
  val document = JsGlobals.window.document
  val canvas = document.getElementById("canvas").asInstanceOf[HTMLCanvasElement]
  val bounds = Point(800, 800)
  var asteroids = Seq.fill(10)(
    new Asteroid(2,
      Point(Random.nextInt(bounds.x), Random.nextInt(bounds.y)),
      Point(Random.nextInt(10), Random.nextInt(10)) - Point(5, 5)
    )
  )
  var bullets = Seq.empty[Bullet]
  val craft = new Craft(Point(400, 400), Point(0, 0), 0)
  val keys = mutable.Set.empty[Int]

  def main(): Unit = {
    canvas.onkeydown = {(e: KeyboardEvent) =>
      JsGlobals.console.log("Down " + e.keyCode.toInt)
      keys.add(e.keyCode.toInt)
    }.asInstanceOf[scala.js.Function1[KeyboardEvent, Any]]

    canvas.onkeyup = {(e: KeyboardEvent) =>
      JsGlobals.console.log("Up " + e.keyCode.toInt)
      keys.remove(e.keyCode.toInt)
    }.asInstanceOf[scala.js.Function1[KeyboardEvent, Any]]

    JsGlobals.setInterval(() => update(), 25)
  }

  def update() = {
    val ctx = canvas.getContext("2d").asInstanceOf[CanvasRenderingContext2D]
    ctx.fillStyle = "rgb(0, 0, 0)"
    ctx.fillRect(0, 0, 800, 800)
    ctx.fillStyle = "rgb(255, 255, 255)"
    asteroids.foreach(_.move())
    craft.move()
    asteroids.foreach(_.draw(ctx))
    craft.draw(ctx)
    craft.move()
  }
}
