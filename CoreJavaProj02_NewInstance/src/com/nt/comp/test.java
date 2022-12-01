package com.nt.comp;

public class test {
	private int a;
	private int b;
	 //o-param constructor
	public test() {
		System.out.println("test.test()");
	}
	
	//parameterised constructor
	public test(int a, int b) {
		System.out.println("test.test()");
		this.a=a;
		this.b=b;
	}

	@Override
	public String toString() {
		return "test [a=" + a + ", b=" + b + "]";
	}
	
	

}
