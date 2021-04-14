package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Job;
import com.example.model.User;
import com.example.service.UserJobService;

@RestController

public class UserJobController {
	
	@Autowired
	private UserJobService userjobservice;
	 
	@PostMapping
	public User saveUser(User user) {
		return userjobservice.saveUser(user);
	}
	
	@PostMapping
	public Job saveJob(Job job) {
		return userjobservice.saveJob(job);
	}
	
	

}
