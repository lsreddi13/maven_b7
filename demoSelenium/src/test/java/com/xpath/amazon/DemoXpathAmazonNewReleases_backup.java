package com.xpath.amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoXpathAmazonNewReleases_backup {
	WebDriver driver;

	@Test
	public void testNewReleasePageNumbers() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// launch amazon url
		driver.get("https://www.amazon.in/");

		// driver will sleep for this time.
		Thread.sleep(3000);

		String homePage_title = driver.getTitle();
		Assert.assertEquals(homePage_title,
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in",
				"homePage_title page title does not match.");

		// new releases web element
		WebElement newReleases_Tab = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_newreleases']"));
		newReleases_Tab.click();

		String newReleasePage_title = driver.getTitle();
		Assert.assertEquals(newReleasePage_title,
				"Amazon.in Hot New Releases: The bestselling new and future releases on Amazon",
				"newReleasePage_title page title does not match.");

		// div[@class='a-column a-span4 a-span-last a-text-right']

//		WebElement HNR_VideoGames = driver.findElement(By.xpath("//h2[contains(text(), 'Hot New Releases in Video Games')]/../following-sibling::div"));

//		String HNR_VideoGames_pageCount = HNR_VideoGames.getText();

		test1("Hot New Releases in Video Games");

//		List<WebElement> li = driver.findElements(By.xpath(
//				"//h2[contains(text(), 'Hot New Releases in Video Games')]/../../following-sibling::div//ol/li"));


		List<WebElement> li = driver.findElements(By.xpath(
				"//h2[contains(text(), 'Hot New Releases in Video Games')]/../../following-sibling::div//ol/li/div/div/span"));

		for (WebElement we : li) {
			
			String pageNo = we.getText();
			
			System.out.println(pageNo);
			
		}
		
		
		
//		test1("Hot New Releases in Amazon Renewed");

		// ol[@class='a-carousel']/li -- list of video games

	}

	public void test1(String header) {
		WebElement pagenumber = driver
				.findElement(By.xpath("//h2[contains(text(), '" + header + "')]/../following-sibling::div"));

		String pagenumber_pageCount = pagenumber.getText();
	}

}
