package com.github.renuevo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootGuideInternal

fun main(args: Array<String>) {
    runApplication<SpringBootGuideInternal>(*args)
}