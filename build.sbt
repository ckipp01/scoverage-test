inThisBuild(
  List(
    organization := "io.kipp",
    scalaVersion := "2.13.5",
    crossScalaVersions := Seq(scalaVersion.value, "2.12.13")
  )
)

lazy val root = (project in file("."))
  .settings(
    name := "scoverage-test",
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.25" % Test
  )
