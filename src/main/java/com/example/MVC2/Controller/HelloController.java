package com.example.MVC2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/springboot")
public class HelloController {
	@GetMapping("/hello")
    public String message() {
        return "Hello, World!";
    }
}
