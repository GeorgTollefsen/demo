package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {
    @GetMapping(path = "/")
    public String hello(){
        return "Fuck u";
    }
}
