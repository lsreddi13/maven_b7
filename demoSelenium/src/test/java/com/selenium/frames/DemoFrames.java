package com.selenium.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoFrames {

	WebDriver driver;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}

	@Test
	public void test() throws InterruptedException {

		driver.switchTo().frame("main");
		
		System.out.println(driver.findElement(By.tagName("h2")).getText()); // print title bar text
//		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		driver.switchTo().frame("navbar");
		System.out.println(driver.findElement(By.tagName("h3")).getText()); // print navigation text
		

	}

}
