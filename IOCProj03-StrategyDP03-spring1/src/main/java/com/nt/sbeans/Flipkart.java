package com.nt.sbeans;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart {
	@Autowired
	@Qualifier("bdart")
	private Courier courier;
	
	public String shopping(String item[], double prices[]) {
		System.out.println("Flipkart.shopping() Method");
		double billamount=0;
		for(double p:prices) {
			billamount=p+billamount;
		}
		//Generate the order id(Random number as The order)
		int oid=new Random().nextInt(1000);
		
		String msg=courier.deliver(oid);
		return msg;
	
	}
}
