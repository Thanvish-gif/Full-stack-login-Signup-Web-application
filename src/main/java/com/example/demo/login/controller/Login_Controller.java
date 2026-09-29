package com.example.demo.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.login.entity.Login_Entity;
import com.example.demo.login.service.Login_Service;

@RestController
public class Login_Controller {
	@Autowired
	Login_Service service;
	
	@PostMapping("/signup")
	public Login_Entity signup( Login_Entity entity) {
		return service.saveUser(entity);
	}
	
	@PostMapping("/signin")
	public String signin( Login_Entity entity ) {
		 Login_Entity entity1=service.getUser(entity.getUsername(), entity.getPassword());
		  if(entity1 != null){
	            return "Login Success";
	        }
		  else {
	        return "Invalid Credentials";
		  }
	}
	
}
