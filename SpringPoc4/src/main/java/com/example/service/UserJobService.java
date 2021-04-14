package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.JobDao;
import com.example.dao.UserDao;
import com.example.model.Job;
import com.example.model.User;

@Service
public class UserJobService {
	
	@Autowired
	private UserDao userdao;
	
	@Autowired
	private JobDao jobdao;
	
	public User saveUser(User user) {
		return userdao.save(user);
	}
	
	public Job saveJob(Job job) {
		return jobdao.save(job);
	}
	
	

}
