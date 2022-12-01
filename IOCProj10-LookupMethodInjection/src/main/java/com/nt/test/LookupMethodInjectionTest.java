package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.commons.Cricketer;

public class LookupMethodInjectionTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		Cricketer ctr=ctx.getBean("cktr", Cricketer.class);
		System.out.println("-------------------------------");
		System.out.println(ctr.batting());
		System.out.println(ctr.bowling());
		System.out.println(ctr.Fielding());
		System.out.println(ctr.wicketKeeping());
		ctx.close();
	}

}
