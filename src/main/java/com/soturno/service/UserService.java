package com.soturno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soturno.entity.User;
import com.soturno.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public User getUserByUsername(String username) {
		
		return userRepository.findByUsername(username);
	}
}
