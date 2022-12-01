package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public class FlipKart {
	private Courier courier;
	
	public void setCourier(Courier courier) {
		System.out.println("FlipKart.setCourier() Method");
		this.courier=courier;
	}
	
	public String shopping(String items[], double price[]) {
		System.out.println("FlipKart.shopping() methods");
		
		Double Billamount=0.0;
		for(Double p:price) {
			Billamount=p+Billamount;
			
		}
		int oid=new Random().nextInt(1000);
		// Deliver the product using courier
		String msg=courier.deliver(oid);
		
		return Arrays.toString(items)+ " Items with BillAmount : "+ Billamount+" ----- "+msg;
		
	}

}
