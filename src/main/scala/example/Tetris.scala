package example

import scala.js.CanvasRenderingContext2D
import scala.util.Random

case class Tetris(bounds: Point, resetGame: () => Unit) extends Game{
  val pieces = Seq(
    Seq(
      Array(0, 1, 0, 0),
      Array(0, 1, 0, 0),
      Array(0, 1, 0, 0),
      Array(0, 1, 0, 0)
    ),
    Seq(
      Array(1, 1),
      Array(1, 1)
    ),
    Seq(
      Array(1, 1, 0),
      Array(0, 1, 1),
      Array(0, 0, 0)
    ),
    Seq(
      Array(0, 1, 1),
      Array(1, 1, 0),
      Array(0, 0, 0)
    ),
    Seq(
      Array(0, 1, 0),
      Array(1, 1, 1),
      Array(0, 0, 0)
    ),
    Seq(
      Array(0, 1, 0),
      Array(0, 1, 0),
      Array(1, 1, 0)
    ),
    Seq(
      Array(0, 1, 0),
      Array(0, 1, 0),
      Array(0, 1, 1)
    )
  )
  def iterator(piece: Seq[Array[Int]], offset: Point = Point(0, 0)) = {
    for{
      i <- 0 until piece.length
      j <- 0 until piece(0).length
      if piece(i)(j) != 0
    } yield (i + offset.x.toInt, j + offset.y.toInt)
  }
  var moveCount = 0
  var keyCount = 0
  val blockWidth = 20
  val gridDims = Point(13, bounds.y / blockWidth)
  val leftBorder = (bounds.x - blockWidth * gridDims.x) / 2
  var linesCleared = 0
  var nextPiece = Random.nextInt(pieces.length)
  var currentPiece = Random.nextInt(pieces.length)
  var piecePos = Point(gridDims.x/2, 0)
  class Position(var filled: String = Color.Black)

  val grid = Array.fill(gridDims.x.toInt, gridDims.y.toInt)(new Position)
  var prevKeys = Set.empty[Int]

  def rotate(p: Seq[Array[Int]]) = {
    val w = p.length
    val h = p(0).length
    val center = Point(w - 1, h - 1) / 2
    val out = Seq.fill(w)(Array.fill(h)(0))

    for {i <- 0 until w; j <- 0 until h}{
      val centered = (Point(i, j) - center)
      val rotated = Point(centered.y * -1, centered.x * 1) + center
      out(rotated.x.toInt)(rotated.y.toInt) = p(i)(j)
    }

    for {i <- 0 until w; j <- 0 until h}{
      p(i)(j) = out(i)(j)
    }
  }

  def findCollisions(offset: Point) = {
    val pts = iterator(pieces(currentPiece), piecePos).toArray
    for {
      index <- 0 until pts.length
      (i, j) = pts(index)
      newPt = Point(i, j) + offset
      if !newPt.within(Point(0, 0), gridDims) || grid(newPt.x.toInt)(newPt.y.toInt).filled != Color.Black
    } yield {}
  }

  def moveDown() = {
    val collisions = findCollisions(Point(0, 1))
    val pts = iterator(pieces(currentPiece), piecePos).toArray
    if (collisions.length > 0){
      for (index <- 0 until pts.length) {
        val (i, j) = pts(index)
        grid(i)(j).filled = Color.all(currentPiece)
      }
      currentPiece = nextPiece
      nextPiece = Random.nextInt(pieces.length)
      piecePos = Point(gridDims.x/2, 0)
      if (!findCollisions(Point(0, 0)).isEmpty){
        result = Some("The board has filled up!")
        resetGame()
      }
    }else{
      piecePos += Point(0, 1)
    }
  }
  def update(keys: Set[Int]): Unit = {
    if (keys(37) && !prevKeys(37) && findCollisions(Point(-1, 0)).isEmpty) piecePos += Point(-1, 0)
    if (keys(39) && !prevKeys(39) && findCollisions(Point(1, 0)).isEmpty) piecePos += Point(1, 0)
    if (keys(32) && !prevKeys(32)) {
      rotate(pieces(currentPiece))
      if (!findCollisions(Point(0, 0)).isEmpty){
        for (i <- 0 until 3) rotate(pieces(currentPiece))
      }
    }
    if (keys(40)) moveDown()

    prevKeys = keys

    if (moveCount > 0) moveCount -= 1
    else{
      moveCount = 15
      moveDown()
    }

    def row(i: Int) = (0 until gridDims.x.toInt).map(j => grid(j)(i))
    var remaining = for{
      i <- (gridDims.y.toInt-1 to 0 by -1).toList
      if !row(i).forall(_.filled != Color.Black)
    } yield i

    for(i <- gridDims.y.toInt-1 to 0 by -1) remaining match{
      case first :: rest =>
        remaining = rest
        for ((oldS, newS) <- row(i).zip(row(first))){
          oldS.filled = newS.filled
        }
      case _ =>
        linesCleared += 1
        for (s <- grid(i)) s.filled = Color.Black
    }
  }

  def draw(ctx: CanvasRenderingContext2D): Unit = {
    ctx.fillStyle = Color.Black
    ctx.fillRect(0, 0, bounds.x, bounds.y)


    ctx.textAlign = "left"
    ctx.fillStyle = Color.White
    ctx.fillText("Lines Cleared: " + linesCleared, leftBorder * 1.3 + gridDims.x * blockWidth, 100)
    ctx.fillText("Next Block", leftBorder * 1.35 + gridDims.x * blockWidth, 150)


    def fillBlock(i: Int, j: Int, color: String) {
      ctx.fillStyle = color.replace("255", "128")
      ctx.fillRect(leftBorder + i * blockWidth, 0 + j * blockWidth, blockWidth, blockWidth)
      ctx.strokeStyle = color
      ctx.strokeRect(leftBorder + i * blockWidth, 0 + j * blockWidth, blockWidth, blockWidth)
    }
    for{
      i <- 0 until gridDims.x.toInt
      j <- 0 until gridDims.y.toInt
    }{
      fillBlock(i, j, grid(i)(j).filled)
    }

    def draw(p: Int, pos: Point, external: Boolean) = {
      val pts = iterator(pieces(p), pos)
      for (index <- 0 until pts.length) {
        val (i, j) = pts(index)
        if (Point(i, j).within(Point(0, 0), gridDims) || external) fillBlock(i, j, Color.all(p))
      }
    }
    draw(currentPiece, piecePos, external = false)
    draw(nextPiece, Point(18, 9), external = true)

    ctx.strokeStyle = Color.White
    ctx.strokePath(
      Point(leftBorder, 0),
      Point(leftBorder, bounds.y)
    )
    ctx.strokePath(
      Point(bounds.x - leftBorder, 0),
      Point(bounds.x - leftBorder, bounds.y)
    )
  }
}
