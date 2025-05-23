package com.levelUp360.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.levelUp360.client.WelcomeApiClient;

@RestController
public class GreetController {

	@Autowired
	private WelcomeApiClient apiClient;
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		String greetMsg = "this is a greet ";
		
		String welcome = apiClient.invokeWelcomeApi();
		
		return greetMsg + welcome;
	}
}
