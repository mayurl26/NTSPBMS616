package com.nt.test;

import java.time.LocalDateTime;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class SingletonTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
				 LocalDateTime dt1=ctx.getBean("ldt", LocalDateTime.class);
				 LocalDateTime dt2=ctx.getBean("ldt", LocalDateTime.class);
		  
				 System.out.println(dt1.hashCode()+"    "+dt2.hashCode());
				 System.out.println(("is dt1==dt2 ")+(dt1==dt2));
				 System.out.println("==========================================================");
				 
				 LocalDateTime dt3=ctx.getBean("ldt1", LocalDateTime.class);
				 LocalDateTime dt4=ctx.getBean("ldt1", LocalDateTime.class);
				 System.out.println(dt3.hashCode()+"     "+dt4.hashCode());
				 System.out.println("(is dt3==dt4)"+(dt3==dt4));
				 
		/* 
		WishMessageGenerator generator=ctx.getBean("wmg", WishMessageGenerator.class);
		WishMessageGenerator generator1=ctx.getBean("wmg", WishMessageGenerator.class);
		
		System.out.println("(Gene==gene1)"+(generator==generator1));
		System.out.println(generator.hashCode()+"  "+generator1.hashCode());
		*/
		ctx.close();
	}

}
