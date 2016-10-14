package com.thoughtworks.akka.http

import java.io.{BufferedReader, InputStreamReader}

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Directives._
import akka.stream.{ActorMaterializer, Materializer}
import stub.Foo

import scala.concurrent.ExecutionContext

object ExampleApp {

  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem()
    implicit val mat = ActorMaterializer()
    import system.dispatcher

    Http().bindAndHandle(route, "127.0.0.1", 8080)

    val stdIn = new BufferedReader(new InputStreamReader(System.in))
    println("Hit ENTER to exit")
    stdIn.readLine()
    system.shutdown()
    system.awaitTermination()
  }

  def route(implicit ec: ExecutionContext, mat: Materializer) = {
    import TwirlSupport._

    path("html") {
      get {
        complete {
          html.twirl.render(Foo("html"))
        }
      }
    } ~ path("txt") {
      get {
        complete {
          txt.twirl.render(Foo("txt"))
        }
      }
    } ~ path("xml") {
      get {
        complete {
          xml.twirl.render(Foo("xml"))
        }
      }
    }
  }
}
