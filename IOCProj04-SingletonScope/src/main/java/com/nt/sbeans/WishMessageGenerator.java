package com.nt.sbeans;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wmg")
@Scope("singleton")
public class WishMessageGenerator {
	@Autowired
	@Qualifier("Idt")
	private LocalDateTime dateTime;
	/*@Autowired
	private Date date;*/
	
	/*
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator() 0- param constructor");
	}
	
	@Autowired
	public WishMessageGenerator(LocalDateTime dateTime) {
	     System.out.println("WishMessageGenerator.WishMessageGenerator()");
	     this.dateTime=dateTime;
	}
	
	
	@Autowired
	public void setDateTime(LocalDateTime dateTime) {
		System.out.println("WishMessageGenerator.setDateTime()");
		this.dateTime=dateTime;
		}
	@Autowired
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date=date;
	}
	@Autowired
	public void put1(LocalDateTime datetime) {
		System.out.println("WishMessageGenerator.put1()   1st arbitary method");
		this.dateTime=datetime;
	}
	@Autowired
	public void put2(Date date) {
		System.out.println("WishMessageGenerator.put2() 2nd arbitary method");
		this.date=date;
	}*/
	
	public String getWishMessage(String user) {
		
		System.out.println("WishMessageGenerator.getWishMessage()");
		//System.out.println("Date Time="+dateTime + "Date= "+date);
		
		int hour= dateTime.getHour();
		
		if(hour<12)
			return "Good Morning "+user;
		else if(hour<16)
			return "Good Afternoon "+user;
		else if(hour<20)
			return "Good Evening "+user;
		else
			return "Good Night "+user;
		
		
	}
	
	

}
