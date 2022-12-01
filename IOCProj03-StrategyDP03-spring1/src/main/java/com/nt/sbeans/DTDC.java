package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements Courier {
	@Override
	public String deliver(int oid) {
		System.out.println("DTDC.deliver() Method");
		return oid+"Delivering your order by DTDC service";
	}

}
