name := """textrank"""

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "commons-logging" % "commons-logging" % "1.1.1",
  "org.apache.commons" % "commons-math" % "2.0",
  "net.sf.extjwnl" % "extjwnl" % "1.9.1",
  "net.sf.extjwnl" % "extjwnl-data-wn31" % "1.2",
  "log4j" % "log4j" % "1.2.15" excludeAll(
    ExclusionRule(organization = "com.sun.jdmk"),
    ExclusionRule(organization = "com.sun.jmx"),
    ExclusionRule(organization = "javax.jms")),
  "org.apache.opennlp" % "opennlp-tools" % "1.5.3",
  "org.apache.lucene" %	"lucene-snowball" %	"3.0.3",
  "org.specs2" %% "specs2-core" % "3.6" % "test"
)

unmanagedResourceDirectories in Compile += baseDirectory.value / "res"
