package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngg")
public class PetrolEngine implements Engine{

	
	public PetrolEngine() {
		System.out.println("Petrol Engine Started");
	}

	@Override
	public void start() {
		System.out.println("Vehicle running on petrol engine");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Pertol engine Stops");
	}
	

}
