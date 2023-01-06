package com.xpath.amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoxpathClass {
	static WebDriver driver;

	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");

		// xpath for Testing list items -
		// //h4/b[text()='Testing']/../following-sibling::ul[1]/li

		test3("Testing");
		System.out.println("**************************");
		test3("SAP");
		System.out.println("**************************");
		test3("AI");
		
		
		/*
		 * List<WebElement> listText = driver .findElements(By.xpath(
		 * "//h4/b[text()='Testing']/../following-sibling::ul[1]/li"));
		 * 
		 * for(WebElement we : listText) {
		 * 
		 * String textT = we.getText();
		 * System.out.println("forEach with list webelemetns : "+textT); }
		 * 
		 * List<WebElement> listText2 = driver
		 * .findElements(By.xpath("//h4/b[text()='SAP']/../following-sibling::ul[1]/li")
		 * );
		 * 
		 * for(WebElement we2 : listText2) {
		 * 
		 * String textT2 = we2.getText();
		 * System.out.println("forEach with list webelemetns : "+textT2); }
		 * List<WebElement> listText3 = driver
		 * .findElements(By.xpath("//h4/b[text()='AI']/../following-sibling::ul[1]/li"))
		 * ;
		 * 
		 * for(WebElement we3 : listText3) {
		 * 
		 * String textT3 = we3.getText();
		 * System.out.println("forEach with list webelemetns : "+textT3); }
		 */
		

		

	}
	
	public void test3(String s) {
		List<WebElement> listText3 = driver
				.findElements(By.xpath("//h4/b[text()='"+s+"']/../following-sibling::ul[1]/li"));
		
		for(WebElement we3 : listText3) {
			
			String textT3 = we3.getText();
			System.out.println("forEach with list webelemetns : "+textT3);
		}
		
		
	}

}
