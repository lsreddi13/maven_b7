package com.Collections;

public class P1 {
	
	P1(){
		System.out.println("hello super.");
	}
	
	P1(int a, String b){
		System.out.println("hello super.");
	}
	String name = "P1";
	String id = "12345";
	
	public void test1() {
		System.out.println("this is test1.");
	}
	
	public static void main(String[] args) {
		P1 dd = new P1(34, "ddD");
		P1 dd1 = new P1();
		
		dd1.test1();
		
		dd.test1();
		
	}

}
