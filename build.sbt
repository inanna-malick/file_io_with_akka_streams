name          := "streams-mini"

version       := "0.0.1"

scalaVersion  := "2.12.0"

scalacOptions := Seq("-unchecked", "-feature", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaVersion = "2.4.12"
  Seq(
    "com.typesafe.akka" %% "akka-stream" % akkaVersion,
    "com.typesafe.akka" %% "akka-actor" % akkaVersion
  )
}

resolvers ++= Seq(
  "Confluentic repository" at "http://packages.confluent.io/maven/"
)


initialCommands := """|import akka.actor._
                      |import akka.stream.scaladsl._
                      |import akka.stream._
                      |import akka.stream.io._
                      |import akka.util._
                      |import java.io.File
                      |import java.net.URI
                      |import scala.util._
                      |import scala.concurrent._
                      |import scala.language.postfixOps
                      |import org.reactivestreams._
                      |implicit val as = ActorSystem()
                      |implicit val mat = ActorMaterializer()
                      |implicit val ec = as.dispatcher
                      |import scala.concurrent.duration._""".stripMargin
