package com.nt.commons;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cktr")
public class Cricketer implements ApplicationContextAware {
	private ApplicationContext ctx;
	
	public Cricketer() {
		System.out.println(" Cricketer 0 param constructor");
	}
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
		
		
	}
	
	public String batting() {
		
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
