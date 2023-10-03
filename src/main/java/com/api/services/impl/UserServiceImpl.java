package com.api.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.exceptions.ResourseNotFoundException;
import com.api.repositories.UserRepository;
import com.api.services.UserService;
import com.api.userservice.entities.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User save(User user) {
		 String randomUserId = UUID.randomUUID().toString();
		 user.setId(randomUserId);
		 return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId).orElseThrow(()-> new ResourseNotFoundException("Given user Id not found on server " + userId));	
	}

}
