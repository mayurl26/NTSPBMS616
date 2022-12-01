package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("bdart")
public class BDart implements Courier {

	@Override
	public String deliver(int oid) {
		System.out.println("BDart.deliver() Method");
		return oid+" Delivering by BDart services";
	}

}
