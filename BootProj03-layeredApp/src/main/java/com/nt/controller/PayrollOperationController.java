package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;

import com.nt.sbeans.Employee;
import com.nt.service.IEmployeeService;

@Controller("payrollControl")
public class PayrollOperationController {
	@Autowired
	private IEmployeeService empService;
	
	public String processEmployee(Employee emp) throws Exception{
		String result=empService.registerEmployee(emp);
		return result;
	}

}
