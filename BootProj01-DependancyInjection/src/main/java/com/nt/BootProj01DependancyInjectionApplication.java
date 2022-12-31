package com.nt;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.SeasonFinder;

@SpringBootApplication
public class BootProj01DependancyInjectionApplication {

	@Bean("ldt")
	public LocalDate getMonth() {
		return LocalDate.now();
		
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj01DependancyInjectionApplication.class, args);
		SeasonFinder sf= ctx.getBean("sf",SeasonFinder.class);
		System.out.println(sf.findSeason());
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
