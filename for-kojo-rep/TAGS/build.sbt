// https://stackoverflow.com/questions/40622878/how-do-i-tell-sbt-or-scala-cli-to-use-a-nightly-build-of-scala-2-12-or-2-13
// https://app.travis-ci.com/github/scala/scala/builds
Global / resolvers += "scala-integration" at
  "https://scala-ci.typesafe.com/artifactory/scala-integration/"
// See: TAGS/scala-jars -- git SHA: 3faf9a98282a2f06219fd0b05b7fede2ab8fb326
//lazy val scalaVer = "2.13.9-bin-3faf9a9"

//scalaVersion := "2.13.6-bin-SNAPSHOT"
//scalaHome := Some(file("/Users/ben/.ivy2/local/org.scala-lang/scala-compiler/2.13.6-bin-SNAPSHOT"))
//scalaHome := Some(file("/Users/ben/.ivy2/local/org.scala-lang/scala-compiler"))
//scalaHome := Some(file("/Users/ben/src/scala-2.13.6/build/pack"))
