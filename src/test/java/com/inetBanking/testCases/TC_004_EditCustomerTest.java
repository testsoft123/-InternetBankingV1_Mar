package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetBanking.pageObjects.Page_003_EditCustomer;
import com.inetBanking.utilities.ReadConfig;

public class TC_004_EditCustomerTest  extends BaseClass{

	
	@Test
	public void editCustomer() throws IOException {
		
		TC_001_LoginTest loginTest = new TC_001_LoginTest();
		loginTest.loginTest();
		
		Page_003_EditCustomer editCustomerPage = new Page_003_EditCustomer(driver);
		editCustomerPage.clickEditCustomer();
		editCustomerPage.enterCoustomerID(ReadConfig.readPropertyFileData("customerId", "editCustomer"));
		editCustomerPage.submitCustomerId();
		captureScreen(driver, "EditCustomerTest");
	}
}
