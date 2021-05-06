resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.7.2")
addSbtPlugin("org.scoverage" % "sbt-coveralls" % "1.2.7+6-dc5943b6-SNAPSHOT")
