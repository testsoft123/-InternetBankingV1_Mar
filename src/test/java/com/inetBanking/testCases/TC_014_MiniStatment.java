package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.Page_010_BalenceMiniStatement;

/** @Author Ambika
*
*/
public class TC_014_MiniStatment extends BaseClass {

	@BeforeMethod
	public void login() throws IOException {
		TC_001_LoginTest loginTest = new TC_001_LoginTest();
		loginTest.loginTest();
	}

	@Test
	public void balenceEnquiry() {

		Page_010_BalenceMiniStatement  miniStatment = new Page_010_BalenceMiniStatement(driver);
		
		  
		miniStatment.miniStatmentLink();
		miniStatment.accountNumaber();
		miniStatment.resetBtn();
		miniStatment.accountNumaber();
		miniStatment.submitBtn();
	}
	
}
