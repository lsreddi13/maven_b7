package com.selenium.screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoScreenshot {

	WebDriver driver;

	

	@BeforeClass
	public void testSetUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/windows/#create-new-window-or-new-tab-and-switch");

		driver.manage().window().maximize();
		Thread.sleep(2000);

	}

	@Test(enabled = true)
	public void testPageScreenshot() throws InterruptedException, IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		String sss = "testPageScreenshot";
		FileUtils.copyFile(scrFile, new File(".//Screenshots//"+sss+"image.png")); // save image with method name and system time
	
		//print system time
		
		
	}
	
	@Test(enabled = true)
	public void testElementScreenshot() throws InterruptedException, IOException {
		
		
		
		WebElement ele = driver.findElement(By.className("DocSearch"));
		
		Thread.sleep(3000);
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).build().perform();
		File scrFile = ele.getScreenshotAs(OutputType.FILE);
		
		
		FileUtils.copyFile(scrFile, new File(".//Screenshots//image.png")); // save image with method name and system time
	
		//print system time
		
		
	}

}
