package com.ecs.aws.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController("/hello")
public class HelloAwsEcs {

    @GetMapping
    public String HelloAwsEcs(){
        return "Hello AWS ECS!";
    }

}
