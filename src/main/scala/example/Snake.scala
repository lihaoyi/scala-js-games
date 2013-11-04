package example

import scala.scalajs.js.CanvasRenderingContext2D
import scala.util.Random

trait Spot
case class Wall(duration: Int) extends Spot
case class Apple(duration: Int, bonus: Int) extends Spot
case object Empty extends Spot

case class Snake(bounds: Point, resetGame: () => Unit) extends Game{
  var frameCount = 0
  var length = 10
  var direction = Point(1, 0)
  var position = Point(40, 30)
  val grid = {
    val spots: Array[Array[Spot]] = Array.fill(80)(Array.fill(60)(Empty))
    for(i <- 0 until 80) {
      spots(i)(0) = Wall(Int.MaxValue)
      spots(i)(59) = Wall(Int.MaxValue)
    }
    for(i <- 0 until 60) {
      spots(0)(i) = Wall(Int.MaxValue)
      spots(79)(i) = Wall(Int.MaxValue)
    }
    spots
  }
  def appleCount = {
    val apples = for {
      col <- grid
      spot <- col
    } yield spot match{
        case Apple(_, _) => 1
        case _ => 0
    }

    apples.sum
  }
  def draw(ctx: CanvasRenderingContext2D) = {
    ctx.fillStyle = "rgb(0, 0, 0)"
    ctx.fillRect(0, 0, 800, 800)

    for {
      i <- 0 until 80
      j <- 0 until 60
    }{
      grid(i)(j) match{
        case Wall(_) =>
          ctx.fillStyle = "rgb(200, 200, 200)"
          ctx.fillRect(i * 10, j * 10, 10, 10)
        case Apple(_, x) =>
          ctx.fillStyle = x match{
            case 2 => "rgb(255, 0, 0)"
            case 5 => "rgb(255, 255, 0)"
          }
          ctx.fillCircle(i * 10 + 5, j * 10 + 5, 5)

        case Empty =>
      }


    }
  }
  def update(keys: Set[Int]) = {
    frameCount += 1

    if (frameCount % 2 == 0){


      if (math.random > 0.9 + appleCount/10.0){
        val (x, y) = (Random.nextInt(80), Random.nextInt(60))
        grid(x)(y) match{
          case Empty =>
            val score = if (Random.nextInt(20) == 0) 5 else 2
            grid(x)(y) = Apple(15 * 25, score)
          case _ =>
        }
      }
      position = position + direction

      grid(position.x.toInt)(position.y.toInt) match{
        case Wall(d) =>
          result = Some("You hit a wall!")
          resetGame()
        case x =>
          x match{
            case Apple(_, s) => length += s
            case _ =>
          }
          grid(position.x.toInt)(position.y.toInt) = Wall(length)
      }

      val newDirection =
        if(keys(37)) Point(-1, 0)
        else if (keys(39)) Point(1, 0)
        else if (keys(38)) Point(0, -1)
        else if (keys(40)) Point(0, 1)
        else direction

      if (newDirection + direction != Point(0, 0)) direction = newDirection

      for {
        i <- 0 until 80
        j <- 0 until 60
      }{
        grid(i)(j) = grid(i)(j) match{
          case Wall(1) | Apple(1, _) => Empty
          case Wall(d) => Wall(d-1)
          case Apple(d, s) => Apple(d-1, s)
          case Empty => Empty
        }
      }
    }
  }
}
