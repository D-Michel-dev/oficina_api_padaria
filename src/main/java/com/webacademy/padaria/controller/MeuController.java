package com.webacademy.padaria.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MeuController {
    @GetMapping("/")
    public String endpointPublico() {
        return "Esse é o endpoint público.";
    }
    @GetMapping("/user")
    public String endpointUser() {
        return "Esse é o endpoint de user";
    }
    @GetMapping("/admin")
    public String endpointAdmin() {
        return "Esse é o endpoint de admin";
    }
    
    
}
