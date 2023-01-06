package com.selenium.information.IsDisplayed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_isSelected {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}

	@Test
	public void test() throws InterruptedException {
Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(), 'Create New Account')]")).click();
		Thread.sleep(3000);
		//
		
		boolean female_isSelected = driver.findElement(By.xpath("//*[contains(text(), 'Female')]/following-sibling::input")).isSelected();
		System.out.println("female_isSelected ? : " +female_isSelected);
		
		
		driver.findElement(By.xpath("//*[contains(text(), 'Female')]/following-sibling::input")).click();
		
		boolean female_isSelected_after = driver.findElement(By.xpath("//*[contains(text(), 'Female')]/following-sibling::input")).isSelected();
		System.out.println("female_isSelected_after ? : " +female_isSelected_after);
		
		
	}

}
