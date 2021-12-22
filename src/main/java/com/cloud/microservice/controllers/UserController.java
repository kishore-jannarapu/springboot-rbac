package com.cloud.microservice.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/user")
    @PreAuthorize("hasPermission(canReadUser)")
    public String hello() {
        return "Hello user!";
    }
}
