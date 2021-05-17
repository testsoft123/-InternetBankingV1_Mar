package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.Page_001_Login;

public class TC_001_LoginTest extends BaseClass {
	
	@Test
	public   void loginTest() throws IOException {
		
		
		logger.info("URL is opened");
		Page_001_Login loginPage = new Page_001_Login(driver);
		loginPage.setUserName(userName);
		logger.info("Enter username");
		loginPage.setPassword(password);
		logger.info("Enter password");
		
		loginPage.clickSubmit();
		//BaseClass.captureScreen(driver, "loginTest");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("login test passes");
		}else{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		

	}

}
