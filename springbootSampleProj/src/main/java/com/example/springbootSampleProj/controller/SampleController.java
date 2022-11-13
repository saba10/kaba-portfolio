package com.example.springbootSampleProj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1")
public class SampleController {
    @GetMapping(path="/hello-world")
    public String helloWorld(){
        return "hello world";
    }

}
