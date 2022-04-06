package br.com.endpointtester

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EndpointTesterApplication

fun main(args: Array<String>) {
    runApplication<EndpointTesterApplication>(*args)
}
