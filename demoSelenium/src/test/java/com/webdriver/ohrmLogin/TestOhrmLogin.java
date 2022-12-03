package com.webdriver.ohrmLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestOhrmLogin {

	
	@Test
	public void testLogin() throws InterruptedException {
		
		//open the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		//launch application
		
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		
		driver.get(url);
		Thread.sleep(3000);
		
		String userName_placeHolderValue = driver.findElement(By.name("username")).getAttribute("placeholder");
		System.out.println(userName_placeHolderValue);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		
		String passwordType = driver.findElement(By.name("password")).getAttribute("type");
		System.out.println(passwordType);
		
		String passwordClass = driver.findElement(By.name("password")).getAttribute("class");
		System.out.println(passwordClass);
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		
		
		
		
		
		
	}
	
}
