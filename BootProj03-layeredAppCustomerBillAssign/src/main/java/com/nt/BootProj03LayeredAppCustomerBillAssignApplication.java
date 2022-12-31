package com.nt;

import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.CustRegistrationController;
import com.nt.sbeans.Customer;

@SpringBootApplication
public class BootProj03LayeredAppCustomerBillAssignApplication {

	public static void main(String[] args) {
		Customer cust=new Customer();
		
		ApplicationContext ctx=SpringApplication.run(BootProj03LayeredAppCustomerBillAssignApplication.class, args);
		try(Scanner sc= new Scanner(System.in)){
			System.out.println("======Welcome=========");
			System.out.print("Enter Customer Name   :  ");
			String name= sc.next();
			System.out.print("Enter Customer address    :  ");
			String addrs= sc.next();
			System.out.print("Enter Customer billAmount   :   ");
			double bill=sc.nextDouble();
			
			cust.setCname(name);
			cust.setCadd(addrs);
			cust.setCoreBill(bill);
		 
		}
		try {

			CustRegistrationController controller=ctx.getBean("CustController", CustRegistrationController.class);
			String message=controller.processCustRegistration(cust);
			System.out.println(message);
		}
		catch (SQLException se) {
			se.printStackTrace();
			System.out.println("Some SQl problem");
			// TODO: handle exception
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Some Internal problem ---------");
		}
	}

}
