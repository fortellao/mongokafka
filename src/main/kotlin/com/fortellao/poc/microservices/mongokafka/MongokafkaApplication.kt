package com.fortellao.poc.microservices.mongokafka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MongokafkaApplication

fun main(args: Array<String>) {
	runApplication<MongokafkaApplication>(*args)
}
