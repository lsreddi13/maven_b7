package com.selenium.multiplewindows;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoNewTab {

	WebDriver driver;

	@BeforeMethod
	public void testSetUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/companies-hiring-in-india?src=gnbCompanies_homepage_srch");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().window().setSize(new Dimension(1024, 800));
		Thread.sleep(2000);
	}

	@Test(enabled=true)
	public void testNewTab() throws InterruptedException {
//		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://www.facebook.com");
	}

	@Test(enabled=false)
	public void testNewWindow() throws InterruptedException {
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://www.google.com");
	}

}
