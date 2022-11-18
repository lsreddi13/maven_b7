package com.interfaces;

import org.testng.annotations.Test;

public class HDFC implements RBI{

	
	public void cuIdProof() {
		System.out.println(" i am taking adhar proof");
		
	}

	
	public void cuContact() {
		System.out.println("i am taking cell number");
		
	}
	
	public void cuAddressProof() {
		System.out.println("I am taking address proof");
	}
	
	@Test
	public void testcase1() {
		cuIdProof();
		cuContact();
		cuAddressProof();
		
	}

}
