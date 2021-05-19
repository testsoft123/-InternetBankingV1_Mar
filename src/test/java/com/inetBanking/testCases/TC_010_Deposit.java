package com.inetBanking.testCases;

/** @Author Ambika
*
*/

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.Page_008_Deposite;

public class TC_010_Deposit extends BaseClass {

	@BeforeMethod
	public void login() throws IOException {
		TC_001_LoginTest loginTest = new TC_001_LoginTest();
		loginTest.loginTest();
	}

	@Test
	public void deposit() {

		Page_008_Deposite deposite = new Page_008_Deposite(driver);
		deposite.depositLink();
		deposite.depositDetails();
		deposite.resetBtn();
		deposite.depositDetails();
		deposite.submitBtn();
	}

}
