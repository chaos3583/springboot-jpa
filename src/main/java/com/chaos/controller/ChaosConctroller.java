package com.chaos.controller;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chaos.app.SpringbootWebApplication;
import com.chaos.entity.Address;
import com.chaos.entity.User;
import com.chaos.service.IAddressService;
import com.chaos.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=SpringbootWebApplication.class)
//@RestController
public class ChaosConctroller {

    @Autowired
    private IUserService userService;
    
    @Autowired
    private IAddressService addressService;

    @Test
    public void test() throws Exception {
        User findUser = userService.findUserByName("chaos");
        System.out.println(findUser.getUserName());
        Sort sort = new Sort(Direction.DESC, "id");
	    Pageable pageable = new PageRequest(1, 10, sort);
	    List<User> findAll = userService.findAll(pageable);
        List<Address> findAllAddress = addressService.findAllAddress();
    }

}
