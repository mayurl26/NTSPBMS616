package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.VotarEligibilityCheck;

public class ProgramaticApproachTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		VotarEligibilityCheck vc= ctx.getBean("vec", VotarEligibilityCheck.class);
		String msg= vc.votarEligibilityCheck();
		System.out.println(msg);
		ctx.close();
				
	}

}
