name := "akka-http-twirl"

crossScalaVersions in ThisBuild := Seq("2.10.6", "2.11.8")

organization in ThisBuild := "com.thoughtworks.akka-http-twirl"

libraryDependencies += "com.typesafe.akka" %% "akka-http-experimental" % "2.0.4"

libraryDependencies += "com.typesafe.play" %% "twirl-api" % "1.1.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % Test
