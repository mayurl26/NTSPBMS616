package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
//@Lazy(true)
@Component("engine")
public class DieselEngine implements Engine{
	
	
	public DieselEngine() {
		System.out.println("Diesel engine starts  ");
	}
	@Override
	public void start() {
		System.out.println("Vehicle running on Diesel engine ");
		// TODO Auto-generated method stub
		
	}@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle Stopped ");
	}

}
