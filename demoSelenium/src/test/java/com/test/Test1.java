package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.oops.inheritance.hrm.AdminPage;
import com.oops.inheritance.hrm.ComminProperties;
import com.oops.inheritance.hrm.LoginPage;
import com.oops.inheritance.hrm.PIMPage;
import com.oops.inheritance.hrm.TestBase;

public class Test1 extends TestBase {

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
		LoginPage LP = new LoginPage();
		// enter login data
		LP.enterUserName("sandya");
		LP.enterPassword();
		LP.clickLogin();

		// verify PIM page
		PIMPage PP = new PIMPage();
		PP.label();

		// verify admin
		AdminPage AP = new AdminPage();
		AP.label();
		// logout
		ComminProperties CP = new ComminProperties();
		CP.clickProfile();
		CP.clickLogout();

	}

	@Test
	public void scenario2() {

		// enter invalid login data
		LoginPage LP = new LoginPage();
		// enter login data
		LP.enterUserName("sasi");
		LP.enterPassword();
		LP.clickLogin();
		// verify error message

	}

}
