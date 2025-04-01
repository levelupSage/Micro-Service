package com.levelUp360.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

    @GetMapping("/welcome")
    public String welcomeMsg(){
        String msg = "Welcome to Level up 360...";

        return msg;
    }
}
