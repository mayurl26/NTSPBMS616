package com.nt.commons;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("cktr")
public abstract class Cricketer{
	//@Lookup("ctx")
	@Lookup
	public abstract CricketBat getBat();
	
	public Cricketer() {
		System.out.println("Cricketer::- 0-param Constructor"+this.getClass());
	}

	public String batting() {
		
		CricketBat crbat=getBat();
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
