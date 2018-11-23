package com.meetokra.springboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringbootApplication

fun main(args: Array<String>) {
    runApplication<SpringbootApplication>(*args)
}
