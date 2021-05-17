package com.inetBanking.testCases;
/** @Author Ambika
*
*/

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.Page_006_AddNewAccount;
import com.inetBanking.utilities.ReadConfig;

public class TC_007_AddNewAccount extends BaseClass {
	
	
	
		
	@BeforeMethod
	public void newAccountDetails() throws IOException {
		
		TC_001_LoginTest loginTest = new TC_001_LoginTest();
		loginTest.loginTest();
		}
	
	@Test()
	public void restAccount() throws IOException {
		Page_006_AddNewAccount accountPage = new Page_006_AddNewAccount(driver);
		accountPage.newAccountLinkClick();
		accountPage.newAccountDetails();
		accountPage.resetAccount();
		accountPage.newAccountDetails();
		accountPage.submitAccount();
	}
	
	
}











