package com.example.demo.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.login.entity.Login_Entity;

@Repository
public interface Login_Repo extends JpaRepository<Login_Entity,Integer> {
		Login_Entity findByUsername(String username);
}
