package com.webdriver.ohrmLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFBLogin {

	@Test
	public void testLogin() throws InterruptedException {

		// open the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// launch application

		String url = "https://www.facebook.com/";

		driver.get(url);
		Thread.sleep(3000);

		String printText = driver.findElement(By.className("_8esh")).getText();
		System.out.println(printText);
		
		

		

	}

	

}
