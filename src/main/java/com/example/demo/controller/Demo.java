package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo
{
    @GetMapping("/home")
    public String home() {
        System.out.println("xin chao");
        return "home";
    }
}
