package com.nt.commons;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("cBat")
public class CricketBat {
	public CricketBat() {
		System.out.println("CricketBat- 0-param constructor");
	}
	public int scoreRun() {
		return new Random().nextInt(100);
	}

}
