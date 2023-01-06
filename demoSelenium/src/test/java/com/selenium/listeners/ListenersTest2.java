package com.selenium.listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.selenium.BrowserOption.DemoChromeOptions;

public class ListenersTest2 extends DemoChromeOptions implements ITestListener {
//

	
	public void onTestFailure(ITestResult results) {
		System.out.println("this is failed");
		
		try {
			DemoChromeOptions ddd = new DemoChromeOptions();
			ddd.takeScreen();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
}
