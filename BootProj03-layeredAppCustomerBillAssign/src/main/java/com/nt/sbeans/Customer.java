package com.nt.sbeans;

import lombok.Data;


@Data
public class Customer {
	private int cno;
	private String cname;
	private String cadd;
	private double coreBill;
	private double totalBill;
	private double afterDiscount;
	
	
}
