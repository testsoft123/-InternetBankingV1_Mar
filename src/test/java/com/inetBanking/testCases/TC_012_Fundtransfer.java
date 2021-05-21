package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.inetBanking.pageObjects.Page_009_Fundtransfer;

/** @Author Ambika
*
*/
public class TC_012_Fundtransfer extends BaseClass {

	@BeforeMethod
	public void login() throws IOException {
		TC_001_LoginTest loginTest = new TC_001_LoginTest();
		loginTest.loginTest();
	}

	@Test
	public void fundTransfer() {

		Page_009_Fundtransfer transfer = new Page_009_Fundtransfer(driver);
		transfer.fundTransferLink();
		transfer.details();
		transfer.resetBtn();
		transfer.details();
		transfer.submitBtn();
	}

}