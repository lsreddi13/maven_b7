package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

//	public static void main(String[] args) {
	@Test
	public void test1() {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.fb.com");
		
//		driver.findElement(By.id("fasd"));

	}

}
