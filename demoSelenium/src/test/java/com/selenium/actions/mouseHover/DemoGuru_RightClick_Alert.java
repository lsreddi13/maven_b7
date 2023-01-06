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

public class DemoGuru_RightClick_Alert {

	String url = "https://demo.guru99.com/test/simple_context_menu.html";

	static WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);

	}

	public static void printList1(String xpath) {
		List<WebElement> li = driver.findElements(By.xpath(xpath));

		for (WebElement we : li) {
			// print link name and link url - name : url
			System.out.println(we.getText());
		}
	}

	@Test
	public void testDemoGuruRightClick() throws InterruptedException {

		WebElement rightClick_btn = driver.findElement(By.xpath("//*[contains(text(), 'right click me')]"));

		Actions ac = new Actions(driver);
		ac.moveToElement(rightClick_btn).contextClick().build().perform();

		
		printList1("//*[@class='context-menu-list context-menu-root']/li");
		
//		driver.findElement(By.xpath("//*[@class='context-menu-list context-menu-root']/li/span[contains(text(),'Edit')]")).click();
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
	}

}
