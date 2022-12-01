package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Printer;
import com.nt.sbeans.WishMessageGenerator;

public class SingleTonPrinter {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		/*Printer p1=ctx.getBean("printer", Printer.class);
		Printer p2=ctx.getBean("printer", Printer.class);
		
		System.out.println("is P1==p2"+(p1==p2));
		System.out.println(p1.hashCode()+"    "+p2.hashCode());
		
		System.out.println("=============================");
		
		Printer p3=ctx.getBean("printer2", Printer.class);
		Printer p4=ctx.getBean("printer2", Printer.class);
		
		System.out.println("is P3==p4"+(p3==p4));
		System.out.println(p3.hashCode()+"    "+p4.hashCode());*/
		
		WishMessageGenerator g1= ctx.getBean("wmg", WishMessageGenerator.class);
		WishMessageGenerator g2=ctx.getBean("wmg", WishMessageGenerator.class);
		
		System.out.println(g1.hashCode()+"   "+g2.hashCode());
		System.out.println(g1.getWishMessage("raja"));
		System.out.println(g2.getWishMessage("ramesh"));
	}

}
