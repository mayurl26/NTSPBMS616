package com.nt.practice;

public class MyThread extends Thread {
	public static void main(String[] args) {
		MyThread mt= new MyThread();
		mt.run();
		mt.start();
		
		
		
		for(int i=0;i<=50;i++) {
			System.out.println("i  :-  "+i);
		}
		
		
	}
	public void run() {
		System.out.println("run method");
		for(int i=0;i<=50;i++) {
			System.out.println("i  :-  "+i);
		}
	}

}
