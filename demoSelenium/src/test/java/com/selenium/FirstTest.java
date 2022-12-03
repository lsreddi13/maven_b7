package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

//	public static void main(String[] args) {
	@Test
	public void test1() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("C:/Users/Lenovo/OneDrive/Desktop/homepage.html");
		
//		driver.findElement(By.id("fasd"));
		driver.findElement(By.name("username")).sendKeys("this is my name");
		driver.findElement(By.id("mypig")).sendKeys("hello123");
		driver.findElement(By.tagName("button")).click();
		
//		driver.findElement(By.linkText("Forgotten password")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Page")).click();
		
//		List<WebElement> li = driver.findElements(By.tagName("a"));
//		
//		System.out.println(li.size());
//		
//		for (WebElement we : li) {
//			String linkName = we.getText();
//			System.out.println(linkName);
//		}
		
		

		
		
		
	}

}
