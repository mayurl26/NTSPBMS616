package com.nt.practice.BankExcpetion;


import java.util.Scanner;

public class Cleark {
	public static void main(String[] args) {
		Scanner sc;
		try {
			sc=new Scanner(System.in);
			Bank bk= new HDFCBank();
			String option="";
			do {
				System.out.println("Type number to do operation");
				System.out.println("1. Deposite");
				System.out.println("2. Withdraw");
				System.out.println("3. Balance Enquiry");
				option=sc.next();
				switch(option){
				case "1":
				{
					System.out.print("Enter anount to Deposite");
					String amt=sc.next();
					double amount=Double.parseDouble(amt);
					bk.deposit(amount);
					bk.balanceEnquiry();
					break;
					
				}
				case "2":
				{
					System.out.print("enter amount you want to withdraw: ");
					String amt=sc.next();
					double amount=Double.parseDouble(amt);
					bk.Withdraw(amount);
					bk.balanceEnquiry();
					break;
					
				}
				case "3":
				{
					bk.balanceEnquiry();
					break;
				}
				default:
					System.out.println("Invalid Option ");
				}
				System.out.println("Do you Want to Continue (Yes/ no): ");
				option=sc.next();
				
			}while(option.equalsIgnoreCase("yes"));
		
		}catch(InvalidamountException ie) {
			System.out.println(ie.getMessage());
		}catch(InsufficientFundsException ie) {
			System.out.println(ie.getMessage());
		}
		catch(NumberFormatException ne) {
			ne.getMessage();
		}
		
		
	}//main

}//class
