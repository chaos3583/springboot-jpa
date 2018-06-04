package com.chaos.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.chaos.entity.User;

public interface IUserService {
	
	public User findUserByName(String userName);
	
	public List<User> findAll(Pageable pageable);

}
