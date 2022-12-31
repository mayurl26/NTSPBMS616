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
	public int getCno() {
		return cno;
	}
	public String getCname() {
		return cname;
	}
	public String getCadd() {
		return cadd;
	}
	public double getCoreBill() {
		return coreBill;
	}
	public double getTotalBill() {
		return totalBill;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	public void setCoreBill(double coreBill) {
		this.coreBill = coreBill;
	}
	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
	public double getAfterDiscount() {
		return afterDiscount;
	}
	public void setAfterDiscount(double afterDiscount) {
		this.afterDiscount = afterDiscount;
	}
	
}
