package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.DAO.IEmployeeDAO;
import com.nt.sbeans.Employee;
@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
	private IEmployeeDAO empDAO;
	@Override
	public String registerEmployee(Employee emp) throws Exception {
	    
		double gSalary=emp.getBasicSalary()+(emp.getBasicSalary()*0.4f);
		double netSalary=gSalary-(gSalary*0.2f);
		
		emp.setGrossSalary(gSalary);
		emp.setNetSalary(netSalary);
		
		int count=empDAO.insertEmployee(emp);
		return count==0?"Employee not registered":"Employee is registered with basicSalary="+emp.getBasicSalary()+" grossSalary="+gSalary+" netsalary="+netSalary;
	}

}
