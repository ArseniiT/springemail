package com.arseniit.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {

    @RequestMapping("/hello")
    public String Hello(){
        return "Hello!";
    }
}
