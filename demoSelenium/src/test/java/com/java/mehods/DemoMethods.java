package com.java.mehods;

public class DemoMethods {

	public static void main(String[] args) { // stati method.
		DemoMethods obj = new DemoMethods();
		obj.m1();
		String name = obj.m2();
		System.out.println(name);
		int v1 = obj.m3();
		System.out.println(v1);
	}

	void m1() { // non - return type method ( void method ) : non static method
		//
		int a = 15;
		String course = "selenium";
		System.out.println(a);
		System.out.println(course);
	}

	String m2() { // return type method ( non-void method) : non static method
		return "xyz";
	}

	int m3() { // return type method ( non-void method) : non static method
		return 30;
	}

}
