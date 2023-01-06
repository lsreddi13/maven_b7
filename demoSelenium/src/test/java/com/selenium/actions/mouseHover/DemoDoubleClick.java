package com.selenium.actions.mouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoDoubleClick {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");

	}

	@Test
	public void testPerfectoLoginlist() throws InterruptedException {

		//click "double click button"
		WebElement we = driver.findElement(By.id("doubleClickBtn"));
		
		
		Actions ac = new Actions(driver);
		ac.doubleClick(we).build().perform();
		
		String s1 = driver.findElement(By.id("doubleClickMessage")).getText();
		System.out.println(s1);
		Assert.assertEquals(s1, "You have done a double click");
		
		WebElement we2 = driver.findElement(By.id("rightClickBtn"));
		
		
		
		ac.contextClick(we2).build().perform();
		String s2 = driver.findElement(By.id("rightClickMessage")).getText();
		System.out.println(s2);
		Assert.assertEquals(s2, "You have done a right click");
		
		
	}

}
