package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.Page_008_DepositeWithdrawal;

/** @Author Ambika
*
*/
public class TC_011_Withdrawal extends BaseClass {

	@BeforeMethod
	public void login() throws IOException {
		TC_001_LoginTest loginTest = new TC_001_LoginTest();
		loginTest.loginTest();
	}

	@Test
	public void deposit() {

		Page_008_DepositeWithdrawal deposite = new Page_008_DepositeWithdrawal(driver);
		deposite.withdrawalLink();
		deposite.details();
		deposite.resetBtn();
		deposite.details();
		deposite.submitBtn();
	}

}