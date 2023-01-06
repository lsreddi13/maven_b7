package com.selenium.waits;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoPageLoadVerification {

	WebDriver driver;

	@BeforeClass
	public void testSetUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/need-selenium-to-wait-until-the-document-is-ready");

		driver.manage().window().maximize();

	}

	@Test(enabled = true)
	public void testPageScreenshot() throws InterruptedException, IOException {

		// page load wait
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			if (js.executeScript("return document.readyState").toString().equals("complete")) {
				System.out.println("Page in ready state");
			}
			
			
		} catch (Exception exe) {
			System.out.println("Page not in ready state");
		}
	}

}
