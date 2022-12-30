package com.nt.practice;

public class pattern3 {
	public static void main(String[] args) {
		
		int m=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=m;j++) {
				System.out.print("  ");
			}
			m--;
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		m=5;
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) { 
				System.out.print(" ");
			}
			for(int j=1;j<=m;j++) {
				System.out.print(" *");
			}
			m--;
			
			System.out.println();
		}
		
	}

}
