package com.example.demo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello,world,how are you?";
    }

    @GetMapping("/hello2")
    public String hello2(){
        return "hello,world2,how are you?";
    }
}
