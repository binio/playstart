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
  "org.powermock"              %  "powermock-module-junit4"   % "1.6.5"   % "test",
  "org.webjars"    %%   "webjars-play"          % "2.3.0-2",
  "org.webjars"    %    "bootstrap"             % "3.1.1-2",
  "org.webjars"    %    "bootswatch-cerulean"   % "3.3.1+2",
  "org.webjars"    %    "html5shiv"             % "3.7.0",
  "org.webjars"    %    "respond"               % "1.4.2"
)
