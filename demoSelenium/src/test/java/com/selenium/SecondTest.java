package com.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest {

	@Test
	public void verifyPageTitle() {
		System.setProperty("webdriver.chrome.driver", ".//browserdriver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.eenadu.net");

		String empName = "karthik";

		String pagetitle = driver.getTitle();// to get the page title - string

		String exp_pagetitle = "Latest Telugu News | Breaking News Telugu | Telugu News Today | News in Telugu - Eenadu";

		Assert.assertEquals(pagetitle, exp_pagetitle);

//		Assert.assertEquals(driver.getTitle(), "dfasdfasdf");

	}
}
