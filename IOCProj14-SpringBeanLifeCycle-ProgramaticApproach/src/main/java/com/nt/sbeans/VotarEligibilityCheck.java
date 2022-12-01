package com.nt.sbeans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("vec")
public class VotarEligibilityCheck implements InitializingBean, DisposableBean {
	@Value("${votar.name}")
	private String name;
	@Value("${votar.age}")
	private int age;
	private Date verifiedOn;

	
	public void setName(String name) {
		System.out.println("VotarEligibilityCheck.setName()");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("VotarEligibilityCheck.setAge()");
		this.age = age;
	}
	public void setVerifiedOn(Date verifiedOn) {
		System.out.println("VotarEligibilityCheck.setVerifiedOn()");
		this.verifiedOn = verifiedOn;
	}
	
	public String votarEligibilityCheck() {
		System.out.println("VotarEligibilityCheck.votarEligibilityCheck()");
		if(age<=18) {
			return " mr/mrs/miss "+name+" you are not eligible for voting";
		}
		else {
			return  " mr/mrs/miss "+name+" you are eligible for voting";
		}
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("VotarEligibilityCheck.destroy()");
		name=null;
		age=0;
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("VotarEligibilityCheck.afterPropertiesSet()");
		verifiedOn=new Date();
		if(name==null || name.trim().length()==0 || age<18) {
			throw new IllegalAccessException(" invalic argument has benn passed");
		}
	}
	
	
	

}
