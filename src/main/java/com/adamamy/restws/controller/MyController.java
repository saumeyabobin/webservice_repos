package com.adamamy.restws.controller;


import org.apache.cxf.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adamamy.restws.CustomerService;

@RestController
//@RequestMapping("/authenticate")
public class MyController {
	
	@Autowired
    private CustomerService customerService;

    @PostMapping("/authenticate")
    public String getToken(@RequestParam("username") final String username, @RequestParam("password") final String password){
       String token= customerService.login(username,password);
       if(StringUtils.isEmpty(token)){
           return "no token found";
       }
       return token;
    }
	/*
	@RequestMapping(value="/{autheticate}",method=RequestMethod.POST)
	public AuthenticateResponse check(@PathVariable String user,@PathVariable String password) {
		
		AuthenticateResponse res=new AuthenticateResponse();
		res.setUser(user);
		res.setPassword(password);
		return res;
		
	}*/
	
	/*@RequestMapping(value="/stockQuote/{firmName}",method=RequestMethod.GET)
	public StockQuoteResponse getStockQuote(@PathVariable String firmName) {
		
		StockQuoteResponse res= new StockQuoteResponse();
		res.setFirmName(firmName);
		res.setStockValue(1000);
		return res;
		
	}*/

}
