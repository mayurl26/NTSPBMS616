package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.VotingEligibilityCheck;

public class SpringBeanLifeCycleTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		VotingEligibilityCheck ve=ctx.getBean("vec", VotingEligibilityCheck.class);
		try {
			String result= ve.checkVotingEligibility();
			System.out.println(result);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("-----------------------");
		ctx.close();		

	}

}
