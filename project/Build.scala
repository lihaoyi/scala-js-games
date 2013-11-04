import sbt._
import Keys._
import scala.scalajs.sbtplugin.ScalaJSPlugin._
import ScalaJSKeys._

object Build extends sbt.Build {
  lazy val root = project.in(file(".")).settings(
    scalaJSSettings: _*
  ).settings(
    name := "games",
    unmanagedSources in (Compile, ScalaJSKeys.packageJS) +=
      baseDirectory.value / "js" / "startup.js"
  ).dependsOn(lib)

  lazy val lib = RootProject(file("../scala-js-dom"))
}
