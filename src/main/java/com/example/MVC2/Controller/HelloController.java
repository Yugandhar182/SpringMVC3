
package com.example.MVC2.Controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.runApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
class Mvc2Application

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}

@RestController
class HelloController{
    @GetMapping("/")
    fun hello() : String {
        return "Hello"
    }
}
