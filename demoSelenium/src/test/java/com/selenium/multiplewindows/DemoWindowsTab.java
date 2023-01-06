package com.selenium.multiplewindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWindowsTab {

	WebDriver driver;

	@BeforeMethod
	public void testSetUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/companies-hiring-in-india?src=gnbCompanies_homepage_srch");
		Thread.sleep(2000);

	}

	@Test
	public void testWinowID() throws InterruptedException {

		WebElement Services_ele = driver.findElement(By.xpath("//a[@title='Naukri FastForward- Resume Services']"));
		String parent = driver.getWindowHandle();

		Actions ac = new Actions(driver);
		ac.moveToElement(Services_ele).build().perform();

		driver.findElement(By.xpath("//a[@title='Resume display']")).click();

		String pageTitle = driver.getTitle();
		String pageURL = driver.getCurrentUrl();

		System.out.println(pageTitle + " : " + pageURL);
		Set<String> s = driver.getWindowHandles();

		int numberOfWindows = s.size();
		System.out.println(numberOfWindows);

		Iterator<String> ss = s.iterator();

		while (ss.hasNext()) {

			String child_window = ss.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle() + " : "
						+ driver.switchTo().window(child_window).getCurrentUrl());
				Thread.sleep(3000);
//				driver.switchTo().window(parent);
//				String pageTitle2 = driver.getTitle();
//				System.out.println(pageTitle2);
				driver.close();
			}

		}
//		driver.switchTo().defaultContent();
	}
}
