package com.tacocloud.impl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// this class was replaced by WebConfig class

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
