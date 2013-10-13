package example
import scala.js._
import scala.util.Random
import scala.collection.mutable
import scala.js.Any._

case class Point(x: Double, y: Double){
  def +(other: Point) = Point(x + other.x, y + other.y)
  def -(other: Point) = Point(x - other.x, y - other.y)
  def %(other: Point) = Point(x % other.x, y % other.y)
  def <(other: Point) = x < other.x && y < other.y
  def >(other: Point) = x > other.x && y > other.y
  def /(value: Double) = Point(x / value, y / value)
  def *(value: Double) = Point(x * value, y * value)
  def length = Math.sqrt(x * x + y * y)
  def rotate(theta: Double) = {
    val (cos, sin) = (Math.cos(theta), math.sin(theta))
    Point(cos * x - sin * y, sin * x + cos * y)
  }
}

class Asteroid(val level: Int, var position: Point, val momentum: Point){
  def draw(ctx: CanvasRenderingContext2D) = {
    val size = 10*level
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
    val p1 = Point(15, 0).rotate(theta) + position
    val p2 = Point(7, 0).rotate(theta + 127.5/180 * Math.PI) + position
    val p3 = Point(7, 0).rotate(theta - 127.5/180 * Math.PI) + position

    ctx.moveTo(p1.x, p1.y)
    ctx.lineTo(p2.x, p2.y)
    ctx.lineTo(p3.x, p3.y)
    ctx.lineTo(p1.x, p1.y)
    ctx.fill()
  }
  def move() = {
    position += momentum
    position += ScalaJSExample.bounds
    position %= ScalaJSExample.bounds

    if (ScalaJSExample.keys(37)) theta -= 0.05
    if (ScalaJSExample.keys(38)) momentum += Point(0.2, 0).rotate(theta)
    if (ScalaJSExample.keys(39)) theta += 0.05
    if (ScalaJSExample.keys(40)) momentum -= Point(0.2, 0).rotate(theta)
  }
}
class Bullet(var position: Point, val momentum: Point){
  def draw(ctx: CanvasRenderingContext2D) = {
    ctx.beginPath()
    ctx.moveTo(position.x, position.y)
    val forward = position + momentum * 5.0 / momentum.length
    ctx.lineTo(forward.x, forward.y)
    ctx.stroke()
  }

  def move() = {
    position += momentum
  }
}

object ScalaJSExample {
  val document = JsGlobals.window.document
  val canvas = document.getElementById("canvas").asInstanceOf[HTMLCanvasElement]
  val bounds = Point(800, 800)
  var asteroids = Seq.fill(10)(
    new Asteroid(3,
      if (Random.nextBoolean()) Point(0, Random.nextInt(bounds.y.toInt))
      else Point(Random.nextInt(bounds.y.toInt), 0),
      Point(Random.nextInt(10), Random.nextInt(10)) - Point(5, 5)
    )
  )

  var bullets = Seq.empty[Bullet]
  val craft = new Craft(Point(400, 400), Point(0, 0), 0)
  val keys = mutable.Set.empty[Int]

  def main(): Unit = {

    document.onkeydown = fromFunction1{(e: KeyboardEvent) =>
      keys.add(e.keyCode.toInt)
    }
    document.onkeypress = fromFunction1{(e: KeyboardEvent) =>
      if (e.keyCode.toInt == 32 && bullets.length < 10){
        JsGlobals.console.log("Fire!")
        bullets = bullets :+ new Bullet(craft.position, craft.momentum + Point(15, 0).rotate(craft.theta))
        println(bullets.length)
      }
    }
    document.onkeyup = fromFunction1{(e: KeyboardEvent) =>
      keys.remove(e.keyCode.toInt)
    }

    JsGlobals.setInterval(() => update(), 15)
  }

  def update() = {
    val ctx = canvas.getContext("2d").asInstanceOf[CanvasRenderingContext2D]
    ctx.fillStyle = "rgb(0, 0, 0)"

    ctx.fillRect(0, 0, 800, 800)

    ctx.fillStyle = "rgb(255, 255, 255)"
    ctx.strokeStyle = "rgb(255, 255, 255)"

    asteroids.foreach(_.move())
    bullets.foreach(_.move())
    craft.move()

    asteroids.foreach(_.draw(ctx))
    bullets.foreach(_.draw(ctx))
    craft.draw(ctx)
    craft.move()

    val changes = for{
      b <- bullets
      a <- asteroids
      min = a.position - Point(10, 10) * a.level
      max = a.position + Point(10, 10) * a.level
      if b.position > min && b.position < max
    } yield {
      val newAsteroids =
        if (a.level == 1) Nil
        else {
          Seq(30, -30).map(d => new Asteroid(a.level - 1, a.position, a.momentum.rotate(d*Math.PI/180)))
        }
      (Seq(a, b), newAsteroids)
    }
    val (removed, added) = changes.unzip
    val flatRemoved = removed.flatten
    asteroids = asteroids.filter(!flatRemoved.contains(_)) ++ added.flatten
    bullets = bullets.filter(!flatRemoved.contains(_)).filter(b => b.position.x > 0 && b.position.y > 0 && b.position.x < bounds.x && b.position.y < bounds.y)
  }
}
