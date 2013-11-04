package example

import scala.scalajs.js.{JsGlobals, CanvasRenderingContext2D, Math}
import scala.util.Random

case class Asteroids(bounds: Point, resetGame: () => Unit) extends Game{

  var bullets = Seq.empty[Bullet]
  val craft = new Craft(bounds / 2, Point(0, 0), 0)
  var frameCount = 0
  var asteroids = Seq.fill(10)(
    new Asteroid(3,
      if (Random.nextBoolean()) Point(0, Random.nextInt(bounds.y.toInt))
      else Point(Random.nextInt(bounds.y.toInt), 0),
      Point(Random.nextInt(5), Random.nextInt(5)) - Point(2.5, 2.5)
    )
  )

  def update(keys: Set[Int]) = {
    frameCount += 1


    asteroids.foreach(_.move())
    bullets.foreach(_.move())
    craft.move(keys)



    if (keys(32) && bullets.length < 10 && frameCount % 2 == 0){
      bullets = bullets :+ new Bullet(
        craft.position,
        craft.momentum + Point(15, 0).rotate(craft.theta)
      )
    }

    val changes = for{
      b <- bullets
      a <- asteroids
      if a.contains(b.position)
    } yield {
      val newAsteroids =
        if (a.level == 1) Nil
        else {
          Seq(30, -30).map(d =>
            new Asteroid(a.level - 1, a.position, a.momentum.rotate(d*Math.PI/180))
          )
        }
      (Seq(a, b), newAsteroids)
    }
    val (removed, added) = changes.unzip
    val flatRemoved = removed.flatten
    asteroids = asteroids.filter(!flatRemoved.contains(_)) ++ added.flatten
    bullets =
      bullets
        .filter(!flatRemoved.contains(_))
        .filter(_.position.within(Point(0, 0), bounds))

    if(asteroids.exists(_.contains(craft.position))){
      result = Some("Your ship hit an asteroid!")
      resetGame()
    }else if (asteroids.length == 0){
      result = Some("You successfully destroyed every asteroid!")
      resetGame()
    }
  }

  def draw(ctx: CanvasRenderingContext2D) = {
    ctx.fillStyle = Color.Black
    ctx.fillRect(0, 0, 800, 800)

    ctx.fillStyle = Color.White
    ctx.strokeStyle = Color.White

    asteroids.foreach(_.draw(ctx))
    bullets.foreach(_.draw(ctx))
    craft.draw(ctx)
  }


  class Asteroid(val level: Int, var position: Point, val momentum: Point){
    def draw(ctx: CanvasRenderingContext2D) = {
      val size = 10*level
      ctx.fillRect(position.x - size/2, position.y - size/2, size, size)
    }
    def move() = {
      position += momentum
      position += bounds
      position %= bounds
    }
    def contains(other: Point) = {
      val min = position - Point(5, 5) * level
      val max = position + Point(5, 5) * level
      other.within(min, max)
    }
  }

  class Craft(var position: Point, var momentum: Point, var theta: Double){
    def draw(ctx: CanvasRenderingContext2D) = {
      ctx.beginPath()
      val pts = Seq(
        Point(15, 0).rotate(theta) + position,
        Point(7, 0).rotate(theta + 127.5/180 * Math.PI) + position,
        Point(7, 0).rotate(theta - 127.5/180 * Math.PI) + position
      )
      ctx.moveTo(pts.last.x, pts.last.y)
      pts.map(p => ctx.lineTo(p.x, p.y))
      ctx.fill()
    }
    def move(keys: Set[Int]) = {
      position += momentum
      position += bounds
      position %= bounds

      if (keys(37)) theta -= 0.05
      if (keys(38)) momentum += Point(0.2, 0).rotate(theta)
      if (keys(39)) theta += 0.05
      if (keys(40)) momentum -= Point(0.2, 0).rotate(theta)
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
}