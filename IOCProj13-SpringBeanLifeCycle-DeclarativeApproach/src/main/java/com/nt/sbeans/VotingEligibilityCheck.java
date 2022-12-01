package com.nt.sbeans;

import java.util.Date;

public class VotingEligibilityCheck {
	private String name;
	private int age;
	
	private Date verifiedOn;
	
	
	
	public VotingEligibilityCheck() {
		System.out.println("VotingEligibilityCheck.VotingEligibilityCheck():: Constructor");
	}
	
	public void setName(String name) {
		System.out.println("VotingEligibilityCheck.setName()");
		
		this.name = name;
	}
	
	public void setAge(int age) {
		System.out.println("VotingEligibilityCheck.setAge()");
		this.age = age;
	}
	public void setVerifiedOn(Date verifiedOn) {
		System.out.println("VotingEligibilityCheck.setverifiedOn()");
		this.verifiedOn=verifiedOn;
	}
	
	public String checkVotingEligibility() {
		System.out.println("VotingEligibilityCheck.checkVotingEligibility() :: methods");
		if(age<18) {
			return "mr/mrs/mmiss "+name+" you are not eligible for voting";
		}
		else {
			return "mr/mrs/mmiss "+name+" you are eligible for voting";
		}
		
	}
	public void myInit() {
		System.out.println("VotingEligibilityCheck.myInit() Method");
		verifiedOn=new Date();
		if(name==null || name.trim().length()==0|| age<=0) {
			throw new IllegalArgumentException(" Invalid Input has been provided by your side!!!");
		}
	}
	public void destroy() {
		System.out.println("VotingEligibilityCheck.Destroy()");
		name=null;
		age=0;
	}

}
