package com.nt.sbeans;

public class Employee {
	private int eno;
	private String ename;
	private String eadd;
	private double basicSalary;
	private double grossSalary;
	private double netSalary;
	public int getEno() {
		return eno;
	}
	public String getEname() {
		return ename;
	}
	public String getEadd() {
		return eadd;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public double getGrossSalary() {
		return grossSalary;
	}
	public double getNetSalary() {
		return netSalary;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setEadd(String eadd) {
		this.eadd = eadd;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	

}
