package dev.andre_su.springdemo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class PledgeController {
    @GetMapping("/hello")
    public String getHelloMessage(){
        return "Hello World, from Spring!";
    }
}
