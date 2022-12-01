package com.nt.factory;

import com.nt.comp.Bike;
import com.nt.comp.BulletBike;
import com.nt.comp.ElectricBike;
import com.nt.comp.SportsBike;
import com.nt.comp.StandardBike;

public class BikeFactory {
	
	public static Bike orderBike(String type) {
		Bike bike=null;
		if(type.equalsIgnoreCase("Standard")) {
			bike=new StandardBike();
		}
		else if(type.equalsIgnoreCase("bullet")) {
			bike=new BulletBike();
		}
		else if(type.equalsIgnoreCase("Sports")) {
			bike=new SportsBike();
		}
		else if(type.equalsIgnoreCase("electric")) {
			bike=new ElectricBike();
		}else {
			throw new IllegalArgumentException("Invalid Bike Type");
		}
		return bike;
		
	}

}
