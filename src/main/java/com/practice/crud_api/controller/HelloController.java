package com.practice.crud_api.controller;

import org.springframework.web.bind.annotation.GetMapping;

import io.swagger.v3.oas.annotations.Operation;

public class HelloController {
    
    @Operation(summary = "Returns a Hello World message")

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

}
