package com.kafka.kafkaspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MyController {

    @GetMapping(value = "/test")
    public List<String> getStrings(){
        return Arrays.asList("This", "is", "String");
    }
}
