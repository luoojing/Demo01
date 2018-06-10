package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConroller {
	@RequestMapping("/")
    public String hello(){
        return "Welcome to start SpringBoot123123asd!";
    }
}
