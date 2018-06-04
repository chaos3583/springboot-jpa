package com.chaos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.chaos.dao.UserRepository;
import com.chaos.entity.User;

@Service
public class UserService implements IUserService{

	@Autowired
    private UserRepository userRepository;
	
	public User findUserByName(String userName) {
		return userRepository.findByUserName(userName);
	}

	@Override
	public List<User> findAll(Pageable pageable) {
		return userRepository.findAll();
	}
	
	
}
