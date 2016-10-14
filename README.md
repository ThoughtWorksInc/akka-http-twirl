[![Build Status](https://travis-ci.org/ThoughtWorksInc/akka-http-twirl.svg?branch=master)](https://travis-ci.org/ThoughtWorksInc/akka-http-twirl)
[![Maven Central](https://img.shields.io/maven-central/v/com.thoughtworks.akka-http-twirl/akka-http-twirl_2.11.svg)](https://maven-badges.herokuapp.com/maven-central/com.thoughtworks.akka-http-twirl/akka-http-twirl_2.11)

# ThoughtWorks' fork of akka-http-twirl

Base on [spray/spray](https://github.com/spray/spray/blob/master/spray-httpx/src/main/scala/spray/httpx/TwirlSupport.scala) `TwirlSupport` and https://github.com/btomala/akka-http-twirl

akka-http-twirl provides Twirl `Xml`, `Html` and `Txt` file marshalling support for [Akka](akka.io) HTTP.

This fork adds Scala 2.10 support.

## Installation

depend on akka-http version 2.0.4

Don't forget add twirl plugin.

plugins.sbt
```scala
addSbtPlugin("com.typesafe.sbt"  % "sbt-twirl"            % "1.1.1")
```

build.sbt
``` sbt
enablePlugins(SbtTwirl)

libraryDependencies += "com.thoughtworks.akka-http-twirl" %% "akka-http-twirl" % "latest.release"
```

## Usage

Mix `TwirlSupport` into your Akka HTTP code which is supposed to marshal Twirl `Html`, `Xml` or `Txt`.

For more details look in to `ExampleApp`.

## License ##

This code is open source software licensed under the [Apache 2.0 License]("http://www.apache.org/licenses/LICENSE-2.0.html").
