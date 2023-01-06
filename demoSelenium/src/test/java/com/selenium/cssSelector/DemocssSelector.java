package com.selenium.cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemocssSelector {

	
	//css -
	
	//cssSelector - locator 
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("._9npi")).sendKeys("dddd");
		driver.findElement(By.cssSelector("#email")).sendKeys("sasi");
		
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("hello");
		
		
		driver.navigate().refresh();
		driver.findElement(By.id("email")).sendKeys("goodmorning");
		
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("password");
		
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("id given");

	
	}
}
