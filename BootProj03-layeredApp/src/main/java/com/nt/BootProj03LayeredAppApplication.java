package com.nt;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.PayrollOperationController;
import com.nt.sbeans.Employee;

@SpringBootApplication
public class BootProj03LayeredAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj03LayeredAppApplication.class, args);
	    
		PayrollOperationController pay= ctx.getBean("payrollControl",PayrollOperationController.class);
		Employee emp=null;
		try(Scanner sc= new Scanner(System.in)){
			System.out.println("==============Welcome===============");
			
			System.out.print("Enter Employee name   :");
			String ename=sc.next();
			System.out.print("Enter Employee Address    :  ");
			String eadd=sc.next();
			System.out.print("Enter Employee basic salary    : ");
			double bsalary=sc.nextDouble();
			
			emp= new Employee();
			emp.setEname(ename);
			emp.setEadd(eadd);
			emp.setBasicSalary(bsalary);
		} 
		try {

			String res=pay.processEmployee(emp);
		     System.out.println(res);
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
		
	}

}
