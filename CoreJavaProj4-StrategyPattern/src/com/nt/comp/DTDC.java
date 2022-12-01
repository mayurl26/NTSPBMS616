package com.nt.comp;

public class DTDC implements Courier{

	@Override
	public String deliver(int oid) {
		System.out.println("DTDC.deliver() Method");
		return oid+"Item has been Shipped by DTDC Courier.";
	}

}
