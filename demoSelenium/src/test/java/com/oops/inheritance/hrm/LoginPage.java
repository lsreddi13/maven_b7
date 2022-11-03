package com.oops.inheritance.hrm;

public class LoginPage extends TestBase{

	// page object model framework

	String userName = "Admin";
	// username
	String password = "admin123";
	// password

	// login button

	// forgot password

	// enter user
	public void enterUserName(String name) {
		System.out.println(name);

	}

	// enter password
	public void enterPassword() {
		System.out.println(password);

	}
	// click login button
	public void clickLogin() {
		System.out.println("click login button");
		
	}

}
