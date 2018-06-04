package com.chaos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.chaos.entity.User;

public interface UserRepository  extends JpaRepository<User, Integer>{
	User findByUserName(String userName);
	
	@Query("from User u where u.name=:name")
	User findUser(String userName);
}
