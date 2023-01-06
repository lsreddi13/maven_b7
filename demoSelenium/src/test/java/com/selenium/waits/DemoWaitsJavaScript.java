package com.selenium.waits;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWaitsJavaScript {

	WebDriver driver;

	@BeforeClass
	public void testSetUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/need-selenium-to-wait-until-the-document-is-ready");

		driver.manage().window().maximize();
		Thread.sleep(2000);

	}

	@Test(enabled = true)
	public void testPageScreenshot() throws InterruptedException, IOException {
		
		//page load wait
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	      
	      try{
	    	  driver.navigate().to("https://www.amazon.in/");
	          // Javascript Executor for ready state
	          JavascriptExecutor j = (JavascriptExecutor)driver;
	          if (j.executeScript("return document.readyState").toString().equals("complete")){
	             System.out.println("Page in ready state"); }
	          } catch(Exception exe) {
	             System.out.println("Page not in ready state");
	          }
//	          driver.close();
//	       }
	      
	}
}
