package com.oops.poly;

public class P1 {

	//method overloading
	public void validLoginTest(String email, String password) {
	
		System.out.println(email);
		
		System.out.println(password);
		
	}
	
	
	
	public void validLoginTest(int phone, String password) {
		
		System.out.println(phone);
		
		System.out.println(password);
		
	}
	
	//
	public void m1() {
		System.out.println("this is India");
		
	}
	
	public void m1(int a) {
		System.out.println("my name is sasi");
		
		System.out.println(a);
		
	}
	
	public void t2(int a, int b, int c )
	{
		System.out.println("this is 3 parametes");
	}
	
	
	public void t2(int a, String b, double c) {
		System.out.println("this is diff paramter types");
	}
	
	
	
	
	
}
