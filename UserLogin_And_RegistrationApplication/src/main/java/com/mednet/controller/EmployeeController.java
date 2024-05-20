package com.mednet.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.mednet.model.Employee;

import com.mednet.service.IEmployeeService;

@Controller
public class EmployeeController {
	
    @Autowired
    private IEmployeeService employeeServiceImpl;

    @GetMapping("/")
	public String getHomePage() {
		return "welcome";
	}
    
    @GetMapping("/register_emp")
    public String getRegistrationPage(@ModelAttribute("emp") Employee emp) {
    	System.out.println("EmployeeController.getRegistrationPage()");
    	return "register";
    }
    @PostMapping("/register_emp")
	public String saveAllEmployee(@ModelAttribute("emp") Employee emp, Map<String, Object> map) {
		Employee msg=employeeServiceImpl.registerEmployee(emp);
		map.put("resultmsg", msg);
		return "registerMSG";
		
	}
    @GetMapping("/login_emp")
    public String getLogin(@ModelAttribute("emp") Employee emp) {
    	System.out.println("EmployeeController.getLogin()");
    	return "login";
    }
    
    @PostMapping("/login_emp")
	public String validateUser(@ModelAttribute("emp") Employee emp, @RequestParam String loginId,@RequestParam String password, Map<String, Object> map) {
		Employee employee=employeeServiceImpl.findByloginDetails(loginId,password);
	    map.put("resultList", employee);
		
		if(employee!=null) {
			return "Validated";
		}
		else {
			return "register";
		}
		
	}

   
    
    
}
