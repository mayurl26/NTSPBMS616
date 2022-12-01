package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class CalculateInterestAmountMethodReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method arg1, Object[] args) throws Throwable {
		System.out.println("CalculateInterestAmountMethodReplacer.reimplement()");
		double pamt=(double)args[0];
		double rate=(double)args[1];
		double time=(double)args[2];
		double intraamount=(pamt*rate*time)/100.0f;
		return intraamount;
	}

}
