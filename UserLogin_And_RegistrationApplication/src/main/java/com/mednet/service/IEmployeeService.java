package com.mednet.service;

import com.mednet.model.Employee;

public interface IEmployeeService {
	
	public Employee registerEmployee(Employee emp);
    public Employee findByloginDetails(String loginId, String Password)	;
}
