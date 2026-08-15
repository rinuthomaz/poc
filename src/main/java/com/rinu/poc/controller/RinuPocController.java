package com.rinu.poc.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RinuPocController {
    
    @RequestMapping("/welcome")
    public String index() {
        return "Kollam mone!";
    }
    
}
