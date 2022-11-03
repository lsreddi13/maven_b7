package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.oops.inheritance.hrm.TestBase;


public class Test2 extends TestBase{

	Test2() {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setUp() {
		OpenBrowser();
	}

	@AfterMethod
	public void close() {
		// close browser
		closeBrwoser();
	}

	@Test
	public void happyPath() {

		// enter login data

		// verify PIM page

		// verify admin

		// logout

	}

	@Test
	public void scenario2() {
		// open browser

		// open launch app

		// enter invalid login data

		// verify error message

	}

}
