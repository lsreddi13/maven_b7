package com.Collections;

public class P3 extends P2{
	String name = "P3";
	String id = "45678";
	
	P3(){
		super();
//		super("ddd");
//		super(33);
		System.out.println(super.name);
		System.out.println(name);
	}
	
	public void test1() {
		System.out.println("this is test3.");
	}
	
	
	public static void main(String[] args) {
		
		P3 pp3 = new P3();
		
		
	}
	
}
