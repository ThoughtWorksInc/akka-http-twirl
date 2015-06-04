name := "akka-http-twirl"

version := "0.1"

scalaVersion := "2.11.6"

val akkaHttpV  = "1.0-RC3"
val scalaTestV = "2.2.4"
val playTwirlV = "1.1.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http-experimental"          % akkaHttpV,
  "com.typesafe.play" %%  "twirl-api"                      % playTwirlV
) ++ Seq(
  "org.scalatest"     %% "scalatest"                       % scalaTestV % "test"
)