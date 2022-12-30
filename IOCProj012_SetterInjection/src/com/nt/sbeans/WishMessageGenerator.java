package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	
	private LocalDateTime dateTime;
	@Autowired
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime=dateTime;
	}
	
	public String getWishMessage(String user) {
		int hour= dateTime.getHour();
		
		if(hour<=12) {
			return "Good Morning ::"+user;
		}
		else if(hour<=16) {
			return "Good Afternoon ::"+user;
		}
		else if(hour<=20) {
			return "Good Evening  ::"+user;
			
		}
		else {
			return "Good Night  ::"+user;
			
		}
	}

}
