package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.PersonInfo;

public class PersoninfoTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		PersonInfo per1= ctx.getBean("pinfo1", PersonInfo.class);
		System.out.println(per1.toString());
		
		
		System.out.println("================");
	}

}
