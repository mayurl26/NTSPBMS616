package com.nt.factory;

import com.nt.comp.BDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.FlipKart;

public class FlipkarFactory {
	
	public static FlipKart getInstance(String courierType) {
		Courier courier;
		
		if(courierType.equalsIgnoreCase("Dtdc"))
				courier=new DTDC();
		else if(courierType.equalsIgnoreCase("Bdart"))
			courier=new BDart();
 		else 
                     throw new IllegalArgumentException("Invalid COurier Type");
		FlipKart fpkt= new FlipKart();
		fpkt.setCourier(courier);
		return fpkt;
	}

}
