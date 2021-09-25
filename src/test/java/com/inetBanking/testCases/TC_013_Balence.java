package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.inetBanking.pageObjects.Page_010_BalenceMiniStatement;

/** @Author Ambika
*
*/
public class TC_013_Balence extends BaseClass {

	@BeforeMethod
	public void login() throws IOException {
		TC_001_LoginTest loginTest = new TC_001_LoginTest();
		loginTest.loginTest();
	}

	@Test
	public void balenceEnquiry() {

		Page_010_BalenceMiniStatement  balence = new Page_010_BalenceMiniStatement(driver);
		
		  balence.balenceLink(); 
		  balence.accountNumaber(); 
		  balence.resetBtn();
		  balence.accountNumaber();
		  balence.submitBtn();
		  balence.homeLink();
		 
	}
}
