package com.interfaces;

import org.testng.annotations.Test;

public class SBI implements RBI {

	
	public void cuIdProof() {
		
		System.out.println(" i am taking voter proof");
	}


	public void cuContact() {
		
		System.out.println("i am taking landline number");
	}

	public void cuAddressProof() {
		System.out.println("I am taking powerbill proof");
	}
	
	@Test
	public void testcase1() {
		cuIdProof();
		cuContact();
		cuAddressProof();
		
	}
	
}
