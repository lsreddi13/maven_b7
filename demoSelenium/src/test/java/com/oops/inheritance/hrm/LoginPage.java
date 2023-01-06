package com.oops.inheritance.hrm;

import org.openqa.selenium.By;

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
		driver.findElement(By.name("username")).sendKeys("Admin");
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
