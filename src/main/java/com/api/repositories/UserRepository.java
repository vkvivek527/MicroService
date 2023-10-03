package com.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.userservice.entities.User;

public interface UserRepository extends JpaRepository<User,String>{

}
