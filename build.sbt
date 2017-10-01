enablePlugins(ScalaJSPlugin)

name := "games"

version := "0.1"

scalaVersion := "2.12.3"

// This is an application with a main method
scalaJSUseMainModuleInitializer := false
mainClass in compile := Some("example.ScalaJSExample")
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.2"
