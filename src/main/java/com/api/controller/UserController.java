package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.services.UserService;
import com.api.userservice.entities.User;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired 
	UserService userService;
	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user){
		User savedUser = userService.save(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
	}
	
	@PutMapping("{userId}")
	public ResponseEntity<User> getSingleUser(@RequestBody String userId){
		User fetchedUser = userService.getUser(userId);
		return ResponseEntity.ok(fetchedUser);
	}
	
	@PutMapping
	public ResponseEntity<List<User>> getAllUser(){
		List<User> allUser = userService.getAllUser();
		return ResponseEntity.ok(allUser);
	}

}
