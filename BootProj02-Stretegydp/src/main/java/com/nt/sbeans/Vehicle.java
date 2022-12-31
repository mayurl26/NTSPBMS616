package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("vehicle")
public class Vehicle {
	@Autowired
	@Qualifier("motor")
	private Engine engine;

	public Vehicle() {
		System.out.println("Vehicle Constructor:: 0-param constructor");
	}
	
	public void move(String startPosition, String stopPosition) {
		engine.start();
		System.out.println("Journey starts from:: "+ startPosition);
		System.out.println("Journey is going on.....");
		engine.stop();
		System.out.println("Journey Stopped at ::  "+stopPosition);
	}
	
	
	

}
