package com.selenium.BrowserOption;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//@Listeners(ListenersTest.class)
public class DemoChromeOptions2 extends DemoChromeOptions {
	

	
	@Test
	public void testLoginActionsClass() {
		
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.in");

		System.out.println(driver.getTitle());
		Assert.assertTrue(false);

	}

	
}
