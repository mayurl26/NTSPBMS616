package com.nt.comp;

public class DieselEngine implements Engine{
	@Override
	public String drive(double speed) {
		System.out.println("DieselEngine.drive() Method");
		
		return speed+"Driving Diesel engine vehicle";
	}

}
