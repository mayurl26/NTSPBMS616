package com.nt.commons;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cktr")
public class Cricketer {
	public Cricketer() {
		System.out.println(" Cricketer 0 param constructor");
	}
	
	public String batting() {
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		CricketBat crbat=ctx.getBean("cBat", CricketBat.class);
        int run=crbat.scoreRun();
        return "Cricketer scores "+run;
	}
	public String Fielding() {
		return "Cricketer is Fielding ";
	}
	public String wicketKeeping() {
		return "Cricketer is WicketKeeping";
	}
	public String bowling() {
		return "Cricketer is Bowling";
	}

	

}
