package com.java.mehods;

public class DemoTestMethodParameters {

	int b = 30;
	String course = "Selenium";

	static String name = "karthik"; // not dynamic value

	public static void m3(String x) {
		System.out.println(x);
	}
	
	public static void m2() {
		DemoTestMethodParameters obj = new DemoTestMethodParameters();
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
		
		m3("Ajaz");
//		m3("karthik");
//		m2();

	}

}
