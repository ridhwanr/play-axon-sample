name := """play-axon-sample"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  javaJpa,
  cache,
  javaWs,
  "mysql" % "mysql-connector-java" % "5.1.18",
  "org.hibernate" % "hibernate-entitymanager" % "3.6.10.Final",
  "org.axonframework" % "axon-core" % "2.3.2",
  "com.google.inject" % "guice" % "3.0",
  "com.google.inject.extensions" % "guice-assistedinject" % "3.0"
)
