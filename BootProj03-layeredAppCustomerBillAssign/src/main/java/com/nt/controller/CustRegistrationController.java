package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.sbeans.Customer;
import com.nt.service.CustomerRegistrationService;

@Controller("CustController")
public class CustRegistrationController {
	
	@Autowired
	CustomerRegistrationService cservice;
	
	public String processCustRegistration(Customer cust) throws Exception {
		String result= cservice.ragistrationService(cust);
		return result;
	}

}
