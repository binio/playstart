#!/usr/bin/env bash

./sbt-dist/bin/sbt "$@"

libraryDependencies ++= Seq(
  "org.hamcrest"                  %  "hamcrest-all"                % "1.3"           % "test",
  "junit"                         %  "junit"                       % "4.12"          % "test",
  "org.powermock"                 %  "powermock-module-junit4"     % "1.6.6"         % "test",
  "org.powermock"                 %  "powermock-api-mockito"       % "1.6.6"         % "test"
)