ThisBuild / organization := "com.events"
name := "events"

version := "0.1"

scalaVersion := "2.12.6"
scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

lazy val eventing = (project in file("."))

  .settings(
    name:="builder",
    libraryDependencies += "com.eed3si9n" %% "gigahorse-okhttp" % "0.3.1",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
    libraryDependencies += "com.typesafe.play" %% "play-json" % "2.6.7",
    libraryDependencies += "org.apache.kafka" %% "kafka" % "0.10.2.2",
    libraryDependencies += "org.apache.kafka" % "kafka-streams" % "1.1.1",
    libraryDependencies ++= {
      val akkaV       = "2.5.3"
      val akkaHttpV   = "10.0.9"
      val scalaTestV  = "3.0.1"
      Seq(
        "com.typesafe.akka" %% "akka-actor" % akkaV,
        "com.typesafe.akka" %% "akka-stream" % akkaV,
        "com.typesafe.akka" %% "akka-testkit" % akkaV,
        "com.typesafe.akka" %% "akka-http" % akkaHttpV,
        "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpV,
        "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpV,
        "org.scalatest"     %% "scalatest" % scalaTestV % "test"

      )
    }
  )
