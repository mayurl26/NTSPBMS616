package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
@Component("pinfo1")
@PropertySource("com/nt/commons/info.properties")
public class PersonInfo {
	@Autowired
	private Environment env;

	@Override
	public String toString() {
		return "name		"+env.getProperty("per.name")+" age=	"+env.getProperty("per.age")+" addrs		"+env.getProperty("per.addrs")
	                   +"\n"+" OS name:   "+env.getProperty("os.name");
	}
	
	

}
