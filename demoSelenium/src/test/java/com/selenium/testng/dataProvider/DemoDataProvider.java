package com.selenium.testng.dataProvider;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.selenium.java.readxlsfile.DemoReadXlsFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoDataProvider {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

	}

	@Test(dataProvider = "getXlsFileData")
	public void test(String s1, String s2, String s3) throws InterruptedException {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(s1);
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(s2);
		Thread.sleep(3000);
	}

	@DataProvider(name = "getXlsFileData")
	public Object[][] readDataFromXLS() throws EncryptedDocumentException, IOException {
		DemoReadXlsFile ss = new DemoReadXlsFile();
		Object[][] str3 = ss.getData();

		return str3;
	}

	@DataProvider(name = "fb_loginData")
	public Object[][] createData1() {

		Object[][] str3 = { { "ram1", "ram2", "ram3" }, { "sasi1", "sasi2", "sasi3" },
				{ "ssi123", "sasi234", "sasi456" } };

		return str3;
	}

}
