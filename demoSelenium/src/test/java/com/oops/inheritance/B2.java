package com.oops.inheritance;

import org.testng.annotations.Test;

public class B2 extends A{

	@Test
	public void testFlow() {
//		A obj = new A();
//		obj.testLogin();
		testLogin();
		test2();
	}
	
	
	public void test2() {
		testLogin2();
		course();
	}
	
	
	
}
