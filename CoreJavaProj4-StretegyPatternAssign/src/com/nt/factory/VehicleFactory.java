package com.nt.factory;

import com.nt.comp.DieselEngine;
import com.nt.comp.Engine;
import com.nt.comp.PetrolEngine;
import com.nt.comp.Vehicle;

public class VehicleFactory  {
	public static Vehicle getInstance(String EngineType) throws IllegalAccessException {
		Engine engine=null;
		
		if(EngineType.equalsIgnoreCase("petrolEngine"))
			engine=new PetrolEngine();
		else if(EngineType.equalsIgnoreCase("DieselEngine"))
			engine=new DieselEngine();
		else
			throw new IllegalAccessException("Illegal engine type");
		
		Vehicle vehicle= new Vehicle();
		vehicle.setEngine(engine);
		return vehicle;
		
	}

}
