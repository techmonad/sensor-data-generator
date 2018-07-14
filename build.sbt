name := "sensor-data-generator"

version := "0.1"

scalaVersion := "2.11.8"


libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.1.7",
  "org.apache.kafka" % "kafka-clients" % "0.10.0.1"
)

