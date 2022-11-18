package com.selenium.oops.inheritance.hrm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//launch login page
//verify page title
//login as valid user
//navigate to Admin tab
//verify user navigated to admin tab
//logout

public class TestDemo {

	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String username = "Admin";
	String password = "admin123";
	String exp_PageTitle = "OrangeHRM";
	String exp_btnValuee = "Login";
	WebDriver driver;
	public void enterUserName() {
		try {
			// login as valid admin user
			WebElement name = driver.findElement(By.name("username"));
			String a = name.getAttribute("placeholder");
			System.out.println(a);
			name.sendKeys("Admin");
			} catch (Exception e) {
				// it will come here
				// logic 
				System.out.println("hey i found an errro in username!................."+e);
				
			}
			
	}
	public void enterPassword() {
		try {
			WebElement password = driver.findElement(By.name("password"));
			String p = password.getAttribute("placeholder");
			System.out.println(p);
			password.sendKeys("admin123");
			}catch (Exception e){
				System.out.println("error in passwrod : "+e);
			}
			
	}
	
	@Test
	public void testLogin() throws InterruptedException, IOException {
		

			// open browser
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();

//			Properties prop = new Properties();
//
//			FileInputStream fis = new FileInputStream("c://desktop//test.properties");
//			prop.load(fis);
//		prop.getProperty("username");

			// launch app login page
			driver.get(url);
			Thread.sleep(3000);
			// verify page title
			String pageTitle = driver.getTitle();
//		Assert.assertEquals(pageTitle, exp_PageTitle);
			Assert.assertEquals(pageTitle, exp_PageTitle, "page title not matched.");
			enterUserName();
			enterPassword();
			
			try {
			WebElement loginBtn = driver.findElement(By.tagName("button"));

			String act_btnValue = loginBtn.getText();

			Assert.assertEquals(act_btnValue, exp_btnValuee, "Button value not matched.");
			loginBtn.click();
			}
			catch (NoSuchWindowException u) {
				System.out.println(u);
				// TODO: handle exception
			}
			
			catch (NoAlertPresentException u) {
				System.out.println(u);
				// TODO: handle exception
			}
			catch (Exception e) {
				System.out.println("error in login button : "+ e);
			}
			finally {
				System.out.println("now i am in finally");
				driver.close();
			}
			// navigate to admin tab

			// verify user navigated to admin tab

			// logout
		

	}

}
