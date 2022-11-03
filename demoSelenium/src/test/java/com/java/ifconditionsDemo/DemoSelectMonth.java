package com.java.ifconditionsDemo;

public class DemoSelectMonth {
	public static void main(String[] args) {
		DemoSelectMonth DS = new DemoSelectMonth();
		
		DS.testSignup("chrome");
	}

	public void testSignup(String browser ) {

		System.out.println("open browser");

		System.out.println("applicaiton launch");

		System.out.println("click create new account button");

		String popup = "displayed";
		//switch 
//		//if 
//		if else
//			ested if
		
		//scanner - take input from kyboard
		//pass the value in the method
		//create object and call methods.
		
		
		if (popup.equals("displayed")) {
			
			System.out.println("enter first name");
			System.out.println("enter middle name");
			System.out.println("enter last name");
			System.out.println("enter password");
			
			System.out.println("select date");		
			
			switch (browser) {
			case "chrome":
				webdrivermanager.chromedriver.setUp().
				Webdriver driver = new ChromeDriver()
				driver.get(url)


				break;
			case "firefox":
			webdrivermanager.chromedriver.setUp().
			Webdriver driver = new ChromeDriver()
			driver.get(url)

				break;
			case "edge":
				webdrivermanager.chromedriver.setUp().
				Webdriver driver = new ChromeDriver()
				driver.get(url)

				break;
			case 4:
				System.out.println("Apr");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("Jun");
				break;
			case 7:
				System.out.println("Jul");
				break;
			case 8:
				System.out.println("Aug");
				break;
			case 9:
				System.out.println("Sep");
				break;
			case 10:
				System.out.println("Oct");
				break;
			case 11:
				System.out.println("Nov");
				break;
			case 12:
				System.out.println("Dec");
				break;
			default:
				System.out.println("no month");
				break;
			}
		}else {
			System.out.println("popup not displayed.");
		}

		System.out.println("hello i completed.");
	}
}
