package com.nt.comp;

public class PetrolEngine implements Engine {

	@Override
	public String drive(double speed) {
		
		System.out.println("PetrolEngine.drive() method");
		return "Driving Petrol Engine at "+speed;
	}

	

}
