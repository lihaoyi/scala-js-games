package example
import scala.js._
import scala.collection.mutable
import scala.js.Any._

object Color{
  def rgb(r: Int, g: Int, b: Int) = s"rgb($r, $g, $b)"
  val White = rgb(255, 255, 255)
  val Red = rgb(255, 0, 0)
  val Green = rgb(0, 255, 0)
  val Blue = rgb(0, 0, 255)
  val Cyan = rgb(0, 255, 255)
  val Magenta = rgb(255, 0, 255)
  val Yellow = rgb(255, 255, 0)
  val Black = rgb(0, 0, 0)
}

case class Point(x: Double, y: Double){
  def +(other: Point) = Point(x + other.x, y + other.y)
  def -(other: Point) = Point(x - other.x, y - other.y)
  def %(other: Point) = Point(x % other.x, y % other.y)
  def <(other: Point) = x < other.x && y < other.y
  def >(other: Point) = x > other.x && y > other.y
  def /(value: Double) = Point(x / value, y / value)
  def *(value: Double) = Point(x * value, y * value)
  def *(other: Point) = x * other.x + y * other.y
  def length = Math.sqrt(lengthSquared)
  def lengthSquared = x * x + y * y
  def within(a: Point, b: Point, extra: Point = Point(0, 0)) = {
    import math.{min, max}
    x > min(a.x, b.x) - extra.x &&
    x < max(a.x, b.x) + extra.y &&
    y > min(a.y, b.y) - extra.x &&
    y < max(a.y, b.y) + extra.y
  }
  def rotate(theta: Double) = {
    val (cos, sin) = (Math.cos(theta), math.sin(theta))
    Point(cos * x - sin * y, sin * x + cos * y)
  }
}

class GameHolder(canvasName: String, gameMaker: (Point, () => Unit) => Game){
  private[this] val canvas = JsGlobals.window.document.getElementById(canvasName).asInstanceOf[HTMLCanvasElement]
  private[this] val bounds = Point(canvas.width, canvas.height)
  private[this] val keys = mutable.Set.empty[Int]
  var game: Game = gameMaker(bounds, () => resetGame())

  canvas.onkeydown = {(e: KeyboardEvent) =>
    keys.add(e.keyCode.toInt)
    e.preventDefault()
    message = None
  }
  canvas.onkeyup = {(e: KeyboardEvent) =>
    keys.remove(e.keyCode.toInt)
    e.preventDefault()
  }

  canvas.onfocus = {(e: FocusEvent) =>
    active = true
  }
  canvas.onblur = {(e: FocusEvent) =>
    active = false
  }

  private[this] val ctx = canvas.getContext("2d").asInstanceOf[CanvasRenderingContext2D]
  var active = false
  var firstFrame = false
  def update() = {
    if (!firstFrame){
      game.draw(ctx)
      firstFrame = true
    }
    if (active && message.isEmpty) {
      game.draw(ctx)
      game.update(keys.toSet)
    }else if (message.isDefined){
      ctx.fillStyle = Color.Black
      ctx.fillRect(0, 0, bounds.x, bounds.y)
      ctx.fillStyle = Color.White
      ctx.font = "20pt Arial"
      ctx.textAlign = "center"
      ctx.fillText(message.get, bounds.x/2, bounds.y/2)
      ctx.font = "14pt Arial"
      ctx.fillText("Press any key to continue", bounds.x/2, bounds.y/2 + 30)
    }
  }

  var message: Option[String] = None
  def resetGame(): Unit = {
    message = game.result
    println("MESSAGE " + message)
    game = gameMaker(bounds, () => resetGame())
  }
  ctx.font = "12pt Arial"
  ctx.textAlign = "center"
}
abstract class Game{
  var result: Option[String] = None
  def update(keys: Set[Int]): Unit

  def draw(ctx: CanvasRenderingContext2D): Unit


  implicit class pimpedContext(val ctx: CanvasRenderingContext2D){
    def fillCircle(x: Double, y: Double, r: Double) = {
      ctx.beginPath()
      ctx.arc(x, y, r, 0, math.Pi * 2)
      ctx.fill()
    }
    def strokePath(points: Point*) = {

      ctx.beginPath()
      ctx.moveTo(points.last.x, points.last.y)
      for(p <- points){
        ctx.lineTo(p.x, p.y)
      }
      ctx.stroke()
    }
  }
}

object ScalaJSExample {
  def main(): Unit = {
    val asteroids = new GameHolder("asteroids", Asteroids)
    val astrolander = new GameHolder("astrolander", AstroLander)
    val snake = new GameHolder("snake", Snake)
    val pong = new GameHolder("pong", Pong)
    val bricks = new GameHolder("bricks", BrickBreaker)
    val games = Seq(asteroids, astrolander, snake, pong, bricks)
    JsGlobals.setInterval(() => games.foreach(_.update()), 15)
  }
}
