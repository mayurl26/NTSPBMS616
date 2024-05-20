package com.mednet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mednet.model.Employee;
import com.mednet.repository.EmployeeRepo;

@Service
public class EmployeeServiceIMPL  implements IEmployeeService{

	 @Autowired
	private EmployeeRepo employeeRepo;
	 
	 @Override
	public Employee registerEmployee(Employee emp) {
	     Employee empl=employeeRepo.save(emp);
		 return empl;
	}
	 
	@Override
	public Employee findByloginDetails(String loginId, String password) {
		Employee emp= employeeRepo.findByloginIdAndPassword(loginId, password).orElse(null);
		return emp;
	}
}
	

