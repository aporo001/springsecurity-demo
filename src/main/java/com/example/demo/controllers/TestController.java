package com.example.demo.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    @PreAuthorize("hasRole('ROLE_1')")
    public String index(@AuthenticationPrincipal UserDetails userDetails) {
        return "Greetings from Spring Boot!";
    }
}
