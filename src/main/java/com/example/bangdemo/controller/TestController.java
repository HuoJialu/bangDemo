package com.example.bangdemo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class TestController {
    @GetMapping ("/Hello")
    public String hello() {
        return "Hello world!";
    }
    @DeleteMapping("/testdelte")
    public int delete(){
        return 123;
    }

    @PostMapping("/testPost")
    public String post(@RequestParam (value = "username") String user,
                       @RequestParam(value = "password") String pass) {
        return user+pass;
    }


    @RequestMapping("/test")
    public String test222() {
        return "test!";
    }
}
