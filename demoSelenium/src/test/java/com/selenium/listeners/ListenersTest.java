package com.selenium.listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.selenium.BrowserOption.DemoChromeOptions;

public class ListenersTest implements ITestListener {
//	WebDriver driver;
	public void onTestStart(ITestResult result) {
		System.out.println("this is on test start");
	}

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("this is finish");
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("this is on start");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("this is onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onTestFailure( ITestResult arg0) {
		System.out.println("this is failed");
		
//			DemoChromeOptions.takeScreen();
		

	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("this is skip");
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("this is success");
	}
}
