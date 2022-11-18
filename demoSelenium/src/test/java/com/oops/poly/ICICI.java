package com.oops.poly;

import org.testng.annotations.Test;

public class ICICI extends RBI{
	public void interestRates() {
		System.out.println("9");
	}

	@Test
	public void testflow() {
		proof();
		interestRates();
	}
}
