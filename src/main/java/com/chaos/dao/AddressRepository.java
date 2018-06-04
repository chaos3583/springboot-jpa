package com.chaos.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chaos.entity.Address;

public interface AddressRepository  extends JpaRepository<Address, Long>{
	
	List<Address> findAll();
}
