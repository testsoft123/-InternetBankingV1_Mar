package com.inetBanking.testCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetBanking.pageObjects.Page_002_AddNewCustomer;


public class TC_003_AddNewCustomerTest  extends BaseClass{
	
	@Test
	public void addNewCustomer() throws IOException {
		
		TC_001_LoginTest loginTest = new TC_001_LoginTest();
		loginTest.loginTest();
		/*
		 * LoginPage loginPage = new LoginPage(driver); loginPage.setUserName(userName);
		 * loginPage.setPassword(password); loginPage.clickSubmit();
		 */
	
		
		Page_002_AddNewCustomer addCustomerPage = new Page_002_AddNewCustomer(driver);
		addCustomerPage.clickAddNewCustomer();
		/*
		 * addCustomerPage.customerName("neemaikj");
		 * addCustomerPage.customerGender("male"); addCustomerPage.dateOfBirth("06",
		 * "08", "1990"); addCustomerPage.customerAddress("india");
		 * addCustomerPage.customerCity("banglore");
		 * addCustomerPage.customerState("karnataka");
		 * addCustomerPage.pincode("560087"); addCustomerPage.custPhone("99898898");
		 * addCustomerPage.custEmailid(randomString()+"@gamil.com");
		 * addCustomerPage.custPassword("kkkllk");
		 */
		addCustomerPage.addCustomerDeails();
		addCustomerPage.resetBtn();
		addCustomerPage.addCustomerDeails();
		addCustomerPage.submitBtn();
		
		boolean result= driver.getPageSource().contains("Customer Registered Successfully!!!");
		if(result==true) {
			Assert.assertTrue(true);
			logger.info("Add New CustomerTest Passed");
		}else {
			logger.info("Add New CustomerTest failed");
			captureScreen(driver, "addNewCustomer");
			Assert.assertTrue(false);
		}
		captureScreen(driver, "addNewCustomer");
	}

	
}

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 