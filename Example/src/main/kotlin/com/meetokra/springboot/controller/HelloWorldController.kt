package com.meetokra.springboot.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @RequestMapping("/hello")
    fun index(): String {
        return "Hello World, SpringBoot!"
    }
}