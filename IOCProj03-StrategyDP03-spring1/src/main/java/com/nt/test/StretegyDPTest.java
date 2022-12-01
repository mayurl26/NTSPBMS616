package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Flipkart;

public class StretegyDPTest {
	public static void main(String[] args) {
		System.out.println("StretegyDPTest.main()");
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationcontext.xml");
		System.out.println("StretegyDPTest.main() after ctx");
		//Object obj=ctx.getBean("fpkt");
		Flipkart fpkt=ctx.getBean("fpkt", Flipkart.class);
		System.out.println("StretegyDPTest.main() After getBean");
	
		
		String result=fpkt.shopping(new String[] {"Shirt", "Trousers"}, new double[] {1000,200});
		System.out.println(result);
		ctx.close();
		
	}
	

}
