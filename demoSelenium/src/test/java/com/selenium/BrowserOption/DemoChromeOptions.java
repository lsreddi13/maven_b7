package com.selenium.BrowserOption;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(ListenersTest.class)
public class DemoChromeOptions {
	public static WebDriver driver;

	public void t1() {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
//		options.addArguments("--incognito");
//		options.addArguments("--headless");
		options.addArguments("--disable-notifications");
//		options.addArguments("--enable-notifications");

		driver = new ChromeDriver(options);
	}

	public  void takeScreen() throws IOException {

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String sss = "testPageScreenshot_listeners";
		FileUtils.copyFile(scrFile, new File(".//Screenshots//" + sss + "image.png")); // save image with method name
																						// and system time
	}
}
