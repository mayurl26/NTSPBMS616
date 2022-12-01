package com.nt.practice.BankExcpetion;

public interface Bank {
	public void deposit(double amt)throws InvalidamountException;
	public double Withdraw(double amt)throws InsufficientFundsException;
	public void balanceEnquiry();
	

}
