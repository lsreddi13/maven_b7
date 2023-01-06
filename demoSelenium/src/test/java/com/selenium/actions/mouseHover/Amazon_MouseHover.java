package com.selenium.actions.mouseHover;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_MouseHover {

	String url = "https://www.amazon.in/";
	String url2 = "https://www.perfecto.io/";
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url2);

	}

	@Test
	public void testPerfectoLoginlist() throws InterruptedException {

		String xpath_login = "//li[@role='menuitem' and contains(@class,'login')]";
		Thread.sleep(3000);
		WebElement LoginList = driver.findElement(By.xpath(xpath_login));
		Actions ac = new Actions(driver);
		ac.moveToElement(LoginList).build().perform();

		List<WebElement> li = driver
				.findElements(By.xpath("//*[contains(@class, 'menu-item is-submenu-item is-dropdown-submenu-item')]/a"));

		for (WebElement we : li) {
			// print link name and link url - name : url
			System.out.println(we.getText() + " : " + we.getAttribute("href"));

		}

	}
//	10 applicaiotn by using mouse hove and print
	//move mouse cursor to perticular web element
	//get the list of allweb elements 
	//print the link url from the list

	@Test(enabled = false)
	public void testMouseHover() {

//		String xpath_accountList = "";
		WebElement accountList = driver.findElement(By.id("nav-link-accountList"));

		// mouse move to element
		Actions ac = new Actions(driver);
		ac.moveToElement(accountList).build().perform(); // thsi is the correxct proceedure.
//		ac.moveToElement(accountList).build(); // this wil not work
//		ac.moveToElement(accountList).perform(); // this will work

	}

}
