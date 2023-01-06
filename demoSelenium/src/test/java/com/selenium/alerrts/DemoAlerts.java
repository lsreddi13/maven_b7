package com.selenium.alerrts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAlerts {

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

//		Thread.sleep(6000);
		
		
		//simple alerts
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
		String alertValue = driver.switchTo().alert().getText();
		System.out.println(alertValue);
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		String conirm_alert_value = driver.switchTo().alert().getText();
		System.out.println(conirm_alert_value);
		driver.switchTo().alert().dismiss();
		String confirm_alert_status_Text = driver.findElement(By.id("confirmResult")).getText();
		System.out.println(confirm_alert_status_Text);
		Thread.sleep(3000);
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("sasidhar");
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		String promptResult = driver.findElement(By.id("promptResult")).getText();
		
		System.out.println(promptResult);
		
		
		
		
		
		
		
		

	}
}
