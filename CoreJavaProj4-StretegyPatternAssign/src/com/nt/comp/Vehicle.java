package com.nt.comp;

public class Vehicle {
	private Engine engine;
	
	public void setEngine(Engine engine) {
		System.out.println("Vehicle.setEngine()");
		this.engine=engine;
	}
	
	public String Driving() {
		System.out.println("Vehicle.Driving() mehtod ");
		String msg= engine.drive(23);
		return msg;
		
	}

}
