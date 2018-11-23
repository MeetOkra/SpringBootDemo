package com.meetokra.springboot.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping("/hello")
    fun index(): String {
        return "Hello World, SpringBoot!"
    }
}