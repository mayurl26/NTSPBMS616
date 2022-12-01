package com.nt.service;

public class BankService {
	public double service(double pamt, double rate, double time) {
		System.out.println("BankService.service()");
		return (pamt*Math.pow(1+rate/100, time))-pamt;
	}

}
