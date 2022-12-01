package com.nt.test;

import java.util.Locale;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringI18nTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		Locale locale= new Locale(args[0],args[1]);
		String msg1= ctx.getMessage("goodbye.msg",new Object[] {}, locale );
		String msg= ctx.getMessage("welcome.msg",new Object[] {}, locale );
		
		
		System.out.println(msg+"      "+msg1);
		
		ctx.close();
		
	}

}
