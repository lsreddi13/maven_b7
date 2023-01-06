package com.selenium.testng.dataProvider;

import org.testng.annotations.DataProvider;

public class ListDataProviders {

	@DataProvider(name = "fb_loginData2")
	public Object[][] createData2() {

		Object[][] str3 = { { "ram1", "ram2", "ram3" }, { "sasi1", "sasi2", "sasi3" },
				{ "ssi123", "sasi234", "sasi456" } };

		return str3;
	}

	@DataProvider(name = "fb_loginData3")
	public Object[][] createData3() {

		Object[][] str3 = { 
				{ "sasi1", "sasi234" }, 
				{ "sasi2", "sasi234" }, 
				{ "sasi3", "sasi234" },
				{ "sasi4", "sasi234" }, 
				{ "sasi5", "sasi234" }, 
				{ "sasi6", "sasi234" } };

		return str3;
	}

}
