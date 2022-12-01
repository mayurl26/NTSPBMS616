package com.nt.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("printer")
//@Scope("singleton")
public class Printer {
	private static Printer INSTANCE;

	private Printer() {
		System.out.println("Printer.Printer() Constructor");
	}
	
	public static Printer getInstance() {
		INSTANCE=null;
		if(INSTANCE==null)
			INSTANCE=new Printer();
		return INSTANCE;
		
	}
	
	

}
