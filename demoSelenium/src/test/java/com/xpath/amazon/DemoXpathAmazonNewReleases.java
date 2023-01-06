package com.xpath.amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoXpathAmazonNewReleases {
	WebDriver driver;

	@Test
	public void testNewReleasePageNumbers() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// launch amazon url
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		// driver will sleep for this time.
		Thread.sleep(3000);

		String homePage_title = driver.getTitle();
		Assert.assertEquals(homePage_title,
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in",
				"homePage_title page title does not match.");

		// new releases web element
		WebElement newReleases_Tab = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_newreleases']"));
		newReleases_Tab.click();

		// verify page title
		String newReleasePage_title = driver.getTitle();
		Assert.assertEquals(newReleasePage_title,
				"Amazon.in Hot New Releases: The bestselling new and future releases on Amazon",
				"newReleasePage_title page title does not match.");

		// print page number count
		WebElement HNR_VideoGamesPageCount = driver.findElement(
				By.xpath("//h2[contains(text(), 'Hot New Releases in Video Games')]/../following-sibling::div"));

		String HNR_VideoGames_pageCount = HNR_VideoGamesPageCount.getText();

//list for hot new releases items 
		List<WebElement> li = driver.findElements(By.xpath(
				"//h2[contains(text(), 'Hot New Releases in Video Games')]/../../following-sibling::div//ol/li/div/div/span"));

		for (WebElement we : li) {

			String pageNo = we.getText();

			System.out.println(pageNo);

		}
		
		
		List<WebElement> li2 = driver.findElements(By.xpath("//h2[contains(text(), 'Hot New Releases in Video Games')]/../../following-sibling::div//ol/li//a[2]/span/div"));
		for (WebElement we2 : li2) {

			String title = we2.getText();

			System.out.println(title);

		}

	}

}
