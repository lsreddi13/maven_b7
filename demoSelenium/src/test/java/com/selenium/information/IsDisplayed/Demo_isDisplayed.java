package com.selenium.information.IsDisplayed;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_isDisplayed {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

	}

	@Test
	public void test() throws InterruptedException {

		WebElement elements_ele = driver
				.findElement(By.xpath("//div[@class='accordion']//div[contains(text(), 'Elements')]"));

		if (elements_ele.isDisplayed()) {
			System.out.println("Elements tab is displayed");
			elements_ele.click();
		} else {
			System.out.println("Elements tab is not displayed.");
		}
		Thread.sleep(3000);

		WebElement WebTables_ele = driver.findElement(By.xpath(
				"//div[@class='accordion']//div[contains(text(), 'Elements')]/../../following-sibling::div/ul/li[@id='item-3']"));
		
		
		if(WebTables_ele.isDisplayed()) {
			System.out.println("WebTables displayed");
			WebTables_ele.click();
			
			//verify url
			String webTable_url = driver.getCurrentUrl();
			Assert.assertEquals(webTable_url, "https://demoqa.com/webtables");
			
			//verify main header
			String hearderTxt= driver.findElement(By.xpath("//div[@class='main-header']")).getText();
			Assert.assertEquals(hearderTxt, "Web Tables");

			WebElement AddBtn_ele = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
			boolean x = AddBtn_ele.isEnabled();
			System.out.println(x);
			if(AddBtn_ele.isEnabled()) {
				System.out.println("add button enabled.");
				AddBtn_ele.click();
			}
			
		}
		
		
		
	}
}
