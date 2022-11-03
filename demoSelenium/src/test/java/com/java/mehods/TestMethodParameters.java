package com.java.mehods;

public class TestMethodParameters {

	int b = 30;
	String course = "Selenium";

	static String name = "sandya";

	public static void m2() {
		TestMethodParameters obj = new TestMethodParameters();
		System.out.println(name);
		System.out.println(obj.b);
		System.out.println(obj.course);

	}

	public void m1() {

		int a = 45;
		int c = a + b;
		System.out.println(c);
		System.out.println(course);
		System.out.println(name);

	}

	public static void main(String[] args) {
		

		m2();

	}

}
