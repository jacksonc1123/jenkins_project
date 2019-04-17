package com.infy.jenkins.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {

    @GetMapping("/hello")
    public @ResponseBody String helloWorld() {
        return "Hello World";
    }
}