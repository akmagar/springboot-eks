package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Rest Controller
@RestController
public class Controller {
    @GetMapping("/welcome")
    public String welcome() {
        return "welcome to spring boot app for deploying to EKS";
    }
}
