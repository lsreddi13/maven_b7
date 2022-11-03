package com.java.mehods;

import org.testng.annotations.Test;

public class DemoTest {

	public void setUp() {
		System.out.println("webdriver driver initialization");
	}

	public void openBrowser(String browserName) {
		System.out.println("open " + browserName + " browser");

	}

	// test1,
	public void openApp(String url) {
		System.out.println("enter :" + url);
	}

	public void loginTest(String name, String p) {

		System.out.println("enter user name : " + name);
		System.out.println("enter password : " + p);

		System.out.println("click login button.");

	}

	public void logout() {
		System.out.println("logout");
	}

	@Test
	public void testFlow1() {

		// driver initialise
		setUp();
		// open browser
		openBrowser("chrome");
		// launch applicaiton
		String test1_url = "http://www.fb.com";
		String dev_url = "http://www.fb.com";
		String prod_url = "http://www.fb.com";
		String preprod_url = "http://www.fb.com";
		String staging_url = "http://www.fb.com";
		openApp(staging_url);
		// login as user1 - method 1(user1 data)
		loginTest("giri", "giri123");
		// verify home page

		// verify add fren button

		// add friend

		// logout as user1 - method 2
		logout();
		// login as fren creds (user2) m1 ( user2 data)
		loginTest("ajaz", "pass123");
		// verify home page

		// verify fren request

		// accept fren request

		// verify fren in the frens list

		// logout as user2 - method2
		logout();
		// login as user1 - m1( user1 data)
		loginTest("giri", "giri123");
		// verify fren name in the frens list

		// logout as user1 - m 2
		logout();
	}
}

