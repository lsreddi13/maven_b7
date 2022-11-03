package com.java.vars;

public class DemoVars {
	// instance vars
	int a1 = 1;
	// static vars
	static int s1;
	public void test1() {
		// local vars
		int x = 10;
		System.out.println("local var : " + x);
	}

	// instance var
	// static vars
	public void test2() {
		System.out.println("instance var ( non-static var ) : "+a1);
		System.out.println("static var : "+s1);
	}

	public static void test3() {
		DemoVars obj = new DemoVars();
		System.out.println("instance var ( non-static var )  : "+obj.a1);
		System.out.println("static var : "+s1);
	}
	
	public static void main(String[] args) {
		DemoVars obj = new DemoVars();
		obj.test1();
		obj.test2();
		test3();
	}
	
}
