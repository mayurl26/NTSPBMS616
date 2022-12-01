package com.nt.practice;

public class Exception {
	public static void main(String[] args) {
		System.out.println("In main method");
		System.out.println(m2());
	}
	static int m2() {

			try {
				System.out.println(" In outer try block");
				try {
					System.out.println("in Inner try");
				    System.out.println(10/0);
				}catch(NullPointerException e) {
					System.out.println("In inner catch block");
				}
				finally {
					System.out.println("In inner finally");
					return 10;
				}
			
			}
			catch (NumberFormatException e) {
				e.printStackTrace();
			
			}
			finally {
				System.out.println(" In Finally block");
				//return 30;
			}
			return 30;
			//System.out.println("out");
			
				
			
		}
	

}
