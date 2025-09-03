package com.springBoot.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
@RequestMapping("/")
    public String car(){
        return "I am Mercedes Benz.";
    }
    @RequestMapping("/about")
    public String aboutUs(){
        return "I am a classic and premium car";
    }
}
