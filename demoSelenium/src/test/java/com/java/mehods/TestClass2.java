package com.java.mehods;

public class TestClass2 {

	//constructor
	public TestClass2(String eduQualification, int grade) {
		System.out.println("hello i am here");
		System.out.println(eduQualification );
		System.out.println(grade);
		
	}
	// static var
	static int x = 12;
	// instance var
	int y = 15;

	static String course = "selenium";

	double sal = 1500000.05;

	// void method
	public void addTest() {
		// local var
		int c;

		c = x + y;

		System.out.println(c);
	}

	public static void substractionTest() {
		// local var
		int substraction;
		// crate an object
		TestClass2 tc2 = new TestClass2("mca", 8);
		substraction = x - tc2.y;

		System.out.println(substraction);
	}

	public String printCourse() {
		System.out.println("i am printing coursename");

		return course;
	}

	public static double printSal() {
		System.out.println("i am printing salary");
		TestClass2 tc3 = new TestClass2("mca", 8);
		return tc3.sal;
	}

	public void testLogin1(String username, String pwd) {

		System.out.println(username);

		System.out.println(pwd);

	}

	public void testLogin2(String empname, int phone) {

		System.out.println(empname);

		System.out.println(phone);

	}

}
