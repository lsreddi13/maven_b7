package com.xpath.amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoxpathClass2 {
	static WebDriver driver;

	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");

		// xpath for Testing list items -
		// //h4/b[text()='Testing']/../following-sibling::ul[1]/li

		List<WebElement> listText = driver
				.findElements(By.xpath("//h4/b[text()='Testing']/../following-sibling::ul[1]/li"));
		
		for(WebElement we : listText) {
			
			String textT = we.getText();
			System.out.println("forEach with list webelemetns : "+textT);
		}
		

		int listSize = driver.findElements(By.xpath("//h4/b[text()='Testing']/../following-sibling::ul[1]/li")).size();

		System.out.println(listSize);

		for (int i = 0; i < listSize; i++) {
			String text = driver.findElements(By.xpath("//h4/b[text()='Testing']/../following-sibling::ul[1]/li"))
					.get(i).getText();
			System.out.println("normal  list text : "+text);
		}

		for (int i = 1; i <= listSize; i++) {
			String text = driver
					.findElement(By.xpath("//h4/b[text()='Testing']/../following-sibling::ul[1]/li[" + i + "]"))
					.getText();
			System.out.println("i value  list text : "+text);
		}

	}

}
