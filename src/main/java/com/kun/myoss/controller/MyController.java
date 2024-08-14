package com.kun.myoss.controller;

import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/username")
    public String getUsername(Authentication authentication) {
        if (authentication != null && authentication.isAuthenticated()) {
            System.out.println(authentication.getCredentials().toString());
            System.out.println(authentication.getPrincipal());
            return "Authenticated User: " + authentication.getName();
        } else {
            return "User not authenticated";
        }
    }
}
