package com.levelUp360.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@Autowired
	private Environment env;  
	
    @GetMapping("/welcome")
    public String welcomeMsg(){
        
    	String property = env.getProperty("server.port");
    	
    	String msg = "Welcome to Level up 360... (Port :: " + property + ")";

        return msg;
    }
}
