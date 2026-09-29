package com.example.demo.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.login.entity.Login_Entity;
import com.example.demo.login.repository.Login_Repo;

@Service
public class Login_Service {
	
	@Autowired
	private Login_Repo repo;
	
	public Login_Entity saveUser(Login_Entity entity) {
		return repo.save(entity);
		
	}
	public Login_Entity getUser(String username,String password) {
		Login_Entity entity=repo.findByUsername(username);
		
		if(entity!=null) {
			if(entity.getPassword().equals(password)) {
			return entity;}
		}
		
			return null;
		
	}

}
