package example

import scala.scalajs.js.CanvasRenderingContext2D
import scala.util.Random

case class Brick(pos: Point,
                 color: String)

case class BrickBreaker(bounds: Point, resetGame: () => Unit) extends Game {
  val borderWidth = 175
  val brickSize = Point(50, 15)

  val colWidth = bounds.x - borderWidth * 2
  var ballsLeft = 3

  var ballVel = Point(0, 0)
  var ballPos = Point(0, 0)
  var paddlePos = Point(0, 0)

  var respawnCounter = 0

  def reset() = {

    ballVel = Point(0, 0)
    paddlePos = Point(bounds.x/2, bounds.y-40)
    ballPos = Point(bounds.x/2, paddlePos.y - 5)
    respawnCounter = 60
  }
  def relaunch() = {

  }
  reset()
  val paddleDims = Point(75, 5)
  var paddleDir = Point(0, 0)

  val bricks = {
    val colors = Seq(
      Color.White, Color.Cyan, Color.Yellow,
      Color.Magenta, Color.Red, Color.Green, Color.Blue
    )
    val bricks = scala.collection.mutable.Set.empty[Brick]
    for {
      i <- 0 to (colWidth / brickSize.x).toInt - 1
      j <- 3 to 15
    }{
      bricks.add(new Brick(Point(i * brickSize.x + borderWidth, j * brickSize.y), colors(Random.nextInt(colors.length))))
    }
    bricks
  }
  def draw(ctx: CanvasRenderingContext2D) = {
    ctx.fillStyle = Color.Black
    ctx.fillRect(0, 0, bounds.x, bounds.y)

    ctx.fillStyle = Color.White
    ctx.strokeStyle = Color.White
    ctx.strokeRect(0, 0, borderWidth-1, bounds.y)
    ctx.strokeRect(bounds.x - borderWidth + 1, 0, borderWidth-1, bounds.y)

    ctx.fillCircle(ballPos.x - 5, ballPos.y - 5, 5)

    ctx.textAlign = "left"
    ctx.fillText("Balls Left: " + ballsLeft, bounds.x - borderWidth / 2 - 40, 4 * bounds.y / 5 - 10)
    for (i <- 1 to ballsLeft){
      ctx.fillCircle(bounds.x - borderWidth / 2 - 40 + i * 15, 4 * bounds.y / 5 + 10, 5)
    }
    for(brick <- bricks){
      ctx.fillStyle = brick.color.replace("255", "128")
      ctx.fillRect(brick.pos.x, brick.pos.y, brickSize.x, brickSize.y)
      ctx.fillStyle = brick.color
      ctx.beginPath()
      ctx.moveTo(brick.pos.x + 1, brick.pos.y + brickSize.y - 1)
      ctx.lineTo(brick.pos.x + 1, brick.pos.y + 1)
      ctx.lineTo(brick.pos.x + brickSize.x - 1, brick.pos.y + 1)
      ctx.stroke()
    }

    ctx.fillStyle = Color.White.replace("255", "128")
    val c1 = paddlePos - paddleDims/2
    ctx.fillRect(c1.x, c1.y, paddleDims.x, paddleDims.y)
    ctx.fillStyle = Color.White
    ctx.strokeRect(c1.x, c1.y, paddleDims.x, paddleDims.y)
  }
  def update(keys: Set[Int]): Unit = {

    if (respawnCounter > 0) {
      respawnCounter -= 1
    }else if (respawnCounter == 0){
      ballVel = Point(3.5 * (Random.nextInt(2) - 0.5) * 2, -3.5)
      respawnCounter -= 1
    }else{
      paddleDir = Point(0, 0)
      if (keys(37)) paddleDir = Point(-8, 0)
      if (keys(39)) paddleDir = Point(8, 0)

      paddlePos = paddlePos + paddleDir
      paddlePos = paddlePos.copy(x =
        math.min(math.max(paddlePos.x, paddleDims.x / 2 + borderWidth), bounds.x - paddleDims.x / 2 - borderWidth)
      )
      ballPos = ballPos + ballVel
      if (ballPos.x + 5 > bounds.x - borderWidth) ballVel = ballVel.copy(x = -math.abs(ballVel.x))
      else if (ballPos.x - 5 < borderWidth) ballVel = ballVel.copy(x = math.abs(ballVel.x))
      else if (ballPos.y - 5 < 0) ballVel = ballVel.copy(y = math.abs(ballVel.y))
      else if (ballPos.y > bounds.y) {
        ballsLeft -= 1
        if (ballsLeft >= 0) reset()
        else {
          result = Some("You've run out of balls!")
          resetGame()
        }
      }else{
        if (ballPos.within(paddlePos - paddleDims/2, paddlePos + paddleDims/2, Point(5, 5))){
          ballVel = ballVel.copy(
            x = ballVel.x + paddleDir.x / 8,
            y = -math.abs(ballVel.y)
          )
        }
        for (brick <- bricks){
          val points = Seq(
            brick.pos,
            brick.pos + Point(brickSize.x, 0),
            brick.pos + brickSize,
            brick.pos + Point(0, brickSize.y)
          )
          val lines = Seq(
            (points(0), points(1), (p: Point) => p.copy(y = -math.abs(p.y))),
            (points(1), points(2), (p: Point) => p.copy(x = math.abs(p.x))),
            (points(2), points(3), (p: Point) => p.copy(y = math.abs(p.y))),
            (points(3), points(0), (p: Point) => p.copy(x = -math.abs(p.x)))
          )
          var hit = false
          for ((p1, p2, func) <- lines if !hit){
            val extent = (ballPos - p1) * (p2 - p1) / (p2-p1).length
            val perpDist = math.sqrt((ballPos - p1).lengthSquared - extent * extent)
            if (!hit && extent > 0 && extent < (p2-p1).length && perpDist < 5){
              ballVel = func(ballVel)
              bricks.remove(brick)
              hit = true
            }
          }
          for (p <- points if !hit){
            val delta = ballPos - p
            if (delta.length < 5){
              val impulse = delta * (ballVel * delta) / delta.lengthSquared
              ballVel = ballVel - impulse * 2
              bricks.remove(brick)
              hit = true
            }
          }

        }
        if(bricks.size == 0){
          result = Some("Success! You've destroyed all the bricks!")
          resetGame()
        }
      }
    }



  }

}
