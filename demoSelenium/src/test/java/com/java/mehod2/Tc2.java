package com.java.mehod2;

import org.testng.annotations.Test;

import com.java.mehods.TestClass2;

public class Tc2 {
	@Test
	public void testCaseFlow() {

		TestClass2 tcObj = new TestClass2("mca", 8);
		String s1 = tcObj.printCourse();
		System.out.println(s1);
		System.out.println(tcObj.printCourse());

		tcObj.addTest();
		tcObj.substractionTest();
		double s2 = tcObj.printSal();
		System.out.println(s2);

		System.out.println(tcObj.printSal());
		tcObj.testLogin1("sasi", "sasi123");

		tcObj.testLogin2("sasi1", 1234567890);

		tcObj.testLogin1("sasi2", "india");

		tcObj.testLogin2("sasi3", 000011111);

		

	}
}
