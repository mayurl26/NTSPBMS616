package com.nt.comp;

public class Electric implements Engine {
	@Override
	public String drive(double speed) {
		System.out.println("Electric.drive() Method");
		
		return speed+ "Driving electric moter vehicle";
	}

}
