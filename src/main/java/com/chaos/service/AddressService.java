package com.chaos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chaos.dao.AddressRepository;
import com.chaos.entity.Address;

@Service
public class AddressService implements IAddressService{

	@Autowired
    private AddressRepository addressRepository;
	
	@Override
	public List<Address> findAllAddress() {
		return addressRepository.findAll();
	}

}
