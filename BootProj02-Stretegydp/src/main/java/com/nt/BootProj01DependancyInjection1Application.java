package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySources;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootProj01DependancyInjection1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj01DependancyInjection1Application.class, args);
		Vehicle vehicle= ctx.getBean("vehicle", Vehicle.class);
		vehicle.move("pandhurna", "Goa");
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
