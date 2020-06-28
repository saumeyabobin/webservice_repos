package com.adamamy.restws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.adamamy.restws.CustomerService;
import com.adamamy.restws.entities.Customer;



@RestController
public class UserProfileController {
	    @Autowired
	    private CustomerService customerService;
	    
	    @GetMapping(value = "/api/users/{id}",produces = "application/json")
	    public Customer getUserDetail(@PathVariable Long id){
	        return customerService.findById(id);
	    }
	    
	
}
