package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.Page_008_Deposite;

/** @Author Ambika
*
*/
public class TC_011_Withdrwal extends BaseClass {

	@BeforeMethod
	public void login() throws IOException {
		TC_001_LoginTest loginTest = new TC_001_LoginTest();
		loginTest.loginTest();
	}

	@Test
	public void deposit() {

		Page_008_Deposite deposite = new Page_008_Deposite(driver);
		deposite.withdrawalLink();
		deposite.details();
		deposite.resetBtn();
		deposite.details();
		deposite.submitBtn();
	}

}