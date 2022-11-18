package com.oops.inheritance;

public class A1 {

	// vars - static
	static int id = 10457;
	static String name = "sasi";
	static String password = "sasi123";
	// instance vars - personal
	int zip = 500018;
	int cell = 1212121212 ;
	
//	String emailID;
	//this is method
	public void printEmail(String emailID) {
		System.out.println(emailID);
	}
	
	public void printval2(String emailID, int mobile) {
		System.out.println(emailID);
		System.out.println(mobile);
		
	}
	
	//void method
	public void printLogin() {
		System.out.println(name);
		System.out.println(password);
		
	}
	
	
	
	public void printPersonalData() {
		System.out.println(zip);
		System.out.println(cell);
	}
	
	
	
	
	

}
