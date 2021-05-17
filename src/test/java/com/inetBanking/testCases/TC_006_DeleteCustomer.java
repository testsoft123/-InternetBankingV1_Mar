package com.inetBanking.testCases;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.Page_004_DeleteOperation;
import com.inetBanking.utilities.ReadConfig;

/** @Author Ambika
*
*/
public class TC_006_DeleteCustomer extends BaseClass {
	
	@Test
	public void deleteCustomer() throws IOException {
		TC_001_LoginTest loginTest = new TC_001_LoginTest();
		loginTest.loginTest();
		
		Page_004_DeleteOperation deleteOperationPage = new Page_004_DeleteOperation(driver);
		deleteOperationPage.deleteCustomerLinkBtn();
		deleteOperationPage.deleteCustomer(ReadConfig.readPropertyFileData("customerId", "deleteOperation"));
		deleteOperationPage.deleteCustomerBtn();
		acceptAlert();
		acceptAlert();
		
		
	}

}
