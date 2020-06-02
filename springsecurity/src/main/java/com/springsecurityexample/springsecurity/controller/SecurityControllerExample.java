package com.springsecurityexample.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityControllerExample {
	
	@GetMapping("/annonymous")
	public String getDetails() {
		return "Welcome Annonymous";
	}
	
	@GetMapping("/user")
	public String getUserDetails() {
		return "Welcome User";
	}
	
	@GetMapping("/admin")
	public String getAdminDetails() {
		return "Welcome Admin";
	}

}
