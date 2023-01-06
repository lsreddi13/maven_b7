package com.selenium.actions.mouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoDragAndDrop {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();

	}

	@Test
	public void test() throws InterruptedException {
		
		Thread.sleep(6000);
		// Element which needs to drag.
		WebElement From = driver.findElement(By.xpath("//*[@id='credit2']/a"));

		// Element on which need to drop.
		WebElement To = driver.findElement(By.xpath("//*[@id='bank']/li"));

		// Using Action class for drag and drop.
		Actions act = new Actions(driver);

		// Dragged and dropped.
		act.dragAndDrop(From, To).build().perform();
		WebElement From2 = driver.findElement(By.xpath("//*[@id='fourth']/a"));
		WebElement To2 = driver.findElement(By.xpath("//*[@id='amt7']/li"));
		act.dragAndDrop(From2, To2).build().perform();
		// Using Action class for drag and drop.
//		         Actions act=new Actions(driver);					

		// Drag and Drop by Offset.
//		act.dragAndDropBy(From2, 135, 40).build().perform();

	}
}
