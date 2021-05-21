package com.inetBanking.testCases;

/** @Author Ambika
*
*/

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.Page_008_DepositeWithdrawal;

public class TC_010_Deposit extends BaseClass {

	@BeforeMethod
	public void login() throws IOException {
		TC_001_LoginTest loginTest = new TC_001_LoginTest();
		loginTest.loginTest();
	}

	@Test
	public void deposit() {

		Page_008_DepositeWithdrawal deposite = new Page_008_DepositeWithdrawal(driver);
		deposite.depositLink();
		deposite.details();
		deposite.resetBtn();
		deposite.details();
		deposite.submitBtn();
	}

}
