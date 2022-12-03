package com.oops.inheritance;

public class A extends C{
	//vars - static 
	static int id = 10457;
	static String name ="sasi";
	static String password = "sasi123";
	//instance vars
	int zip = 500018;
	int cell = 1919191919;
	
	public static void testLogin() {
		System.out.println("enter user id : "+ id);
		System.out.println("enter password : "+password);
	}

	public void testLogin2() {
		course();
		System.out.println("enter user id : "+ id);
		System.out.println("enter password : "+password);
	}
}


//create admin user and verify admin tabs are displayed or not for new user
//create staff user and verify staff tabs are displayed or not for new user
//edit new user and change the role from admin to staff and verify staff tabs are displayed or not for new user
//edit new user and change the role from staff to admin and verify admin tabs are displayed or not for new user
//patent and doc - test
//url - 


