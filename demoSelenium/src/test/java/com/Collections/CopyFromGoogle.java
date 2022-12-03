package com.Collections;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CopyFromGoogle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url = "https://artoftesting.com/sampleSiteForSelenium";
		
		String url2 = "http://gmail.com";

				 //Launching sample website
		 driver.get(url2);
		 driver.manage().window().maximize();
		 
		 //Get list of web-elements with tagName  - a
		 List<WebElement> allLinks = driver.findElements(By.tagName("button"));
		 
		 
		 System.out.println(allLinks.size());
		 
		 //Traversing through the list and printing its text along with link address
//		 for(WebElement link:allLinks){
//		 System.out.println(link.getText() + " - " + link.getAttribute("href"));
//		 }
		 
		 //Commenting driver.quit() for user to easily verify the links
		 //driver.quit();
	}
	
}
