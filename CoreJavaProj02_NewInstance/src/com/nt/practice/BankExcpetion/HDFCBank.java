package com.nt.practice.BankExcpetion;

public class HDFCBank implements Bank{
	private double balance;
	@Override
	public void balanceEnquiry() {
		System.out.println("Current balance is : "+balance);
		
		
	}@Override
	public void deposit(double amt) throws InvalidamountException {
		if(amt<=0) {
			throw new InvalidamountException(" please enter valid deposite amount");
		}
			balance=balance+amt;
			
		
		
	}@Override
	public double Withdraw(double amt) throws InsufficientFundsException {
		if(amt<balance) {
			throw new InsufficientFundsException("you have Insufficient funds");
		}
		balance=balance-amt;
		return balance-amt;
	}

}
