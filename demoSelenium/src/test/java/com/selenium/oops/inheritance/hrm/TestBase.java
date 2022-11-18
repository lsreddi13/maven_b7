package com.selenium.oops.inheritance.hrm;

public class TestBase {
	public TestBase(){
		//load properties file
		
		System.out.println("load properties file");
	}
	
	public void OpenBrowser() {
		
		
		// open browser
				System.out.println("open browser");

				// open launch app
				System.out.println("app launch");
	}
	
	public void closeBrwoser() {
		System.out.println("broweser closed.");
	}

}
