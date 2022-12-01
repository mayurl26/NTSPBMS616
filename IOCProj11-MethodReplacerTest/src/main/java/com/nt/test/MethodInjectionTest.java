package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class MethodInjectionTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		BankService bse= ctx.getBean("bankService", BankService.class);
		double intramt=bse.service(1000, 12, 2);
		System.out.println("interest amount is :-   "  +intramt);
		ctx.close();
	}

}
