name := """play-java"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.11"

libraryDependencies += javaJdbc
libraryDependencies += cache
libraryDependencies += javaWs

resolvers += "mvnrepository" at "https://mvnrepository.com//artifact/"

libraryDependencies ++= Seq(
  "org.mockito"                %  "mockito-core"              % "1.10.19" % "test",
  "org.powermock"              %  "powermock-api-mockito"     % "1.6.5"   % "test",
  "org.powermock"              %  "powermock-module-junit4"   % "1.6.5"   % "test"
)
