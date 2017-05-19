enablePlugins(SbtTwirl)

name := "akka-http-twirl"

crossScalaVersions in ThisBuild := Seq("2.10.6", "2.11.11", "2.12.1")

organization in ThisBuild := "com.thoughtworks.akka-http-twirl"

libraryDependencies += (if (!scalaVersion.value.startsWith("2.10"))
  "com.typesafe.akka" %% "akka-http" % "10.0.6"
else
  "com.typesafe.akka" %% "akka-http-experimental" % "2.0.4")

libraryDependencies += "com.typesafe.play" %% "twirl-api" % "1.3.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % Test
