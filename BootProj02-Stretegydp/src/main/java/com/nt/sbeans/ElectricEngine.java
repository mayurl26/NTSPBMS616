package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngg")
public class ElectricEngine implements Engine{
	
	@Override
	public void start() {
		System.out.println("Vehicle running on electric engine");
		
	}
	
	@Override
	public void stop() {
		System.out.println("Electric engine stops");
		
	}
	public ElectricEngine() {
	     System.out.println("Electric engine Starts  ");
	}

}
