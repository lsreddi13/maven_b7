package com.selenium.navigation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoNavigation {
	
	
	WebDriver driver;

	@BeforeClass
	public void testSetUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/windows/#create-new-window-or-new-tab-and-switch");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}

	@Test(enabled = true)
	public void testPageScreenshot() throws InterruptedException, IOException {
		
		driver.get("http://www.facebook.com");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.navigate().to("http://www.yahoo.com");
		
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println("i navigated to one step back : "+ driver.getTitle());
		driver.navigate().back();
		System.out.println("again navigated to one more step back : "+ driver.getTitle());
		driver.navigate().forward();
		System.out.println("I navigated to one  step fwd : "+ driver.getTitle());
		driver.navigate().refresh();
		System.out.println("I refreshed the same page : "+ driver.getTitle());
	}

}
