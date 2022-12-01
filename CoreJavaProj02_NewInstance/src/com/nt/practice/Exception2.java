package com.nt.practice;
class Division{
	static int divide(String[] args) {
		int res=-1;
		
		try {
			int a= Integer.parseInt(args[0]);
			int b= Integer.parseInt(args[1]);
			int c= a/b;
			res=4;
			
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			res=5;
			
		}
		catch(NumberFormatException nf) {
			res=6;
		}
		catch(ArithmeticException ae) {
			res=7;
		}
		return res;
		
	}
}

public class Exception2 {
	public static void main(String[] args) {
        int res= Division.divide(args);
        System.out.println("Result :"+res);
	}

}
