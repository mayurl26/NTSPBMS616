package com.nt.sbeans;


import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime dateTime;
	
	@Autowired
	private Date date;
	
	/*@Autowired
	public void setDateTime(LocalDateTime dateTime) {
		System.out.println("WishMessageGenerator.setDateTime()");
		this.dateTime=dateTime;
		
	}*/
	
	public String getWishMessage(String user) {
		
		System.out.println("WishMessageGenerator.getWishMessage()");
		
		System.out.println("Date time:-"+dateTime+ " date "+date);
		
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
