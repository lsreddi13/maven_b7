package com.oops.poly;

import org.testng.annotations.Test;

public class C1T1 extends P1T1{

	
	public void validLoginTest(String email, String password) {
		System.out.println("this is from child class");
		System.out.println(email);
		
		System.out.println(password);
		
	}
	
	
	@Test
	public void te1() {
		
		validLoginTest("sss@gmail.com", "password123");
		
	}
	
	
}
