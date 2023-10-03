package com.api.services;

import java.util.List;

import com.api.userservice.entities.User;

public interface UserService {
	
	User save (User user);
	
	List<User> getAllUser();
	
	User getUser(String userId);
}
