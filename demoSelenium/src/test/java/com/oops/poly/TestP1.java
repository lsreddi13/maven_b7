package com.oops.poly;

import org.testng.annotations.Test;

public class TestP1 extends P1{

	double x = 4;
	
	@Test
	public void testP(){
		
		System.out.println(x);
		
		validLoginTest("sss@gmail.com", "sss123");
		
		
		validLoginTest(123, "pss123");
		
		
		m1(9);
		
		m1(91);
		m1(29);
		m1(9);
		m1(19);
		m1(9);
		m1(9);
		m1(9);
		
		m1();
		
		
		t2(1,"12",4);
		
		
		t2(4,4,4);
	}
	
}
