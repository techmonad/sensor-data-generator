package com.techmonad.kafka

import java.util.Random

object SensorDataGeneratorApp extends App {

  val producer = new Producer("localhost:9092")

  val rand = new Random

  while (true) {
   // val id = rand.nextInt(100)
    val temperature: Float = rand.nextInt(120)
    val time = System.currentTimeMillis()
    producer.send("data_queue3", s"$time,$temperature,$time")
    Thread.sleep(5)
  }

}
