package com.selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoList_PrintMonths {

	@Test
	public void testPrintMonthNames() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // 3.14.0
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver, 10);// -2, another 8

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.className("_6lti")).click();

//		Thread.sleep(30000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("birthday_month")));
		
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("dd")));
		
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.className("_6lti")), "dsd"));
		
		
		driver.findElement(By.name("birthday_month")).click();
//		Thread.sleep(3000);
		List<WebElement> li = driver.findElements(By.xpath("//select[@name='birthday_month']/option"));
//		System.out.println(li.size());
 
		ListIterator<WebElement> it = li.listIterator();

		while (it.hasNext()) {
			System.out.println(it.next().getText());
		}

//		for (int i = 0; i < li.size(); i++) {
//			System.out.println(li.get(i).getText());
//		}

		/*
		 * for (WebElement we : li) { System.out.println(we.getText());
		 * 
		 * }
		 */
		// print month names in reverse order

//		for(int i=li.size()-1; i>=0; i--) {
//			System.out.println(li.get(i).getText());
//		}

//		ListIterator<WebElement> it = li.listIterator();

//		while (it.hasPrevious()) {
//			System.out.println(it.previous().getText());
//		}

//		driver.close();

	}

}
