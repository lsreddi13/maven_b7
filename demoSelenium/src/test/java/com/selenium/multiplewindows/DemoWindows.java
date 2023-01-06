package com.selenium.multiplewindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWindows {

	WebDriver driver;

	@BeforeMethod
	public void testSetUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);

	}

	@Test
	public void testWinowID() throws InterruptedException {

		String parent = driver.getWindowHandle();
		System.out.println("parent window id ---------- " + parent);

		// click the buttons to open new windows and tabs
		driver.findElement(By.id("tabButton")).click();

//		driver.findElement(By.id("windowButton")).click();

//		driver.findElement(By.id("messageWindowButton")).click();

		Set<String> s = driver.getWindowHandles();

		System.out.println(s);

//		for (String windowID : s) {
//			driver.switchTo().window(windowID);
			driver.switchTo().newWindow(WindowType.TAB);
			Thread.sleep(3000);
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			driver.switchTo().newWindow(WindowType.TAB);
			
//			System.out.println(driver.getCurrentUrl());

//			//close the child window
//			if (!parent.equals(s)) {
//				driver.close();
//				Thread.sleep(3000);
//			} else {
//				System.out.println("this is parent window");
//			}
//		}
	}
}
