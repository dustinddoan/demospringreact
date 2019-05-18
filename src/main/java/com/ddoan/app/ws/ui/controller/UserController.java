package com.ddoan.app.ws.ui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ddoan.app.ws.ui.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping
	public User getUser() {
		User user = new User();
		user.setFirstName("Dustin");
		user.setLastName("Doan");
		
		return user;
	}
}
