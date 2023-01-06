package com.selenium.testng.assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoSoftAssertions {

	SoftAssert softAssert = new SoftAssert();
	@Test
	public void test2() {
		
		
					
		
		System.out.println("*** test case three started ***");
		
		softAssert.assertEquals("Hello", "Hello", "First soft assert failed - testCaseThree");
		System.out.println("Soft assert success....");
		softAssert.assertTrue("Hello".equals("hello"), "Second soft assert failed - testCaseThree");
		softAssert.assertTrue("Welcome".equals("welcomeeee"), "Third soft assert failed - testCaseThree");
		System.out.println("*** test case three executed successfully ***");
		softAssert.assertAll();
		

	}
	
	
	@Test
	public void test() {
		
		
					
//		SoftAssert softAssert = new SoftAssert();
		System.out.println("*** test case three started ***");
//		Assert.assertEquals("fasdf", "fasdf"); // hard
		softAssert.assertEquals("Hello", "Hello", "First soft assert failed - testCaseThree");
		System.out.println("Soft assert success....");
		softAssert.assertTrue("Hello".equals("hello"), "Second soft assert failed - testCaseThree");
		softAssert.assertTrue("Welcome".equals("welcomeeee"), "Third soft assert failed - testCaseThree");
		System.out.println("*** test case three executed successfully ***");
		softAssert.assertAll();
		

	}
	
	
}
