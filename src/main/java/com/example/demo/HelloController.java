package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello11")
    public String hello1() {
        return "Hello from  Spring Apps Enterprise\n";
    }
}