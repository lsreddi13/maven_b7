package com.oops.poly;

import org.testng.annotations.Test;

public class SBI extends RBI {
	
	public void interestRates() {
		System.out.println("8");
	}

	@Test
	public void testflow() {
		proof();
		interestRates();
	}

}
