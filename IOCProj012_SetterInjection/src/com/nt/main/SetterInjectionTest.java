package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		Object obj=ctx.getBean("wmg");
		
		WishMessageGenerator msg=(WishMessageGenerator)obj;
		
		String result=msg.getWishMessage("raja");
		
		System.out.println(result);
		
	}

}
