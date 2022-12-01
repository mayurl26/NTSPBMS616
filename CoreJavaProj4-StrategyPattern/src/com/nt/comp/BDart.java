package com.nt.comp;

public class BDart implements Courier {
	@Override
	public String deliver(int oid) {
		System.out.println("BDart.deliver() Method");
		return oid+" This item has been shipped by BDart Courier";
	}

}
