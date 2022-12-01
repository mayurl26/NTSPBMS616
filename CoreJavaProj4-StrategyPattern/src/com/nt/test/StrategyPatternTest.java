package com.nt.test;

import com.nt.comp.FlipKart;
import com.nt.factory.FlipkarFactory;

public class StrategyPatternTest {
	
	public static void main(String[] args) {
		FlipKart fpkt= FlipkarFactory.getInstance("bdart");
		String msg=  fpkt.shopping(new String[] {"Shirt","Trousers" }, new double[] {1000.0,2500.0});
		System.out.println(msg);
	}

}
