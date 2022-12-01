package com.nt.practice;

public class Exception1 {
	public static void main(String[] args) {
		System.out.println("In main Method");
		try {
			System.out.println("main try start");
			m1();
			
		}catch(ArithmeticException e) {
			System.out.println("In main catch");
		}
		System.out.println("main Method end");
	}
	public static void m1() {
		System.out.println("In m1 method start");
		System.out.println(10/0);
		System.out.println("m1 method end");
	}

}
