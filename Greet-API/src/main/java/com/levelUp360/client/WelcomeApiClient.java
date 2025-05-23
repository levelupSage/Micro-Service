package com.levelUp360.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "Welcome-API")
//@FeignClient(url="http://localhost:8081/welcome") //if you can use 3rd party Apis
public interface WelcomeApiClient {

	@GetMapping("/welcome")
	public String invokeWelcomeApi();
}
