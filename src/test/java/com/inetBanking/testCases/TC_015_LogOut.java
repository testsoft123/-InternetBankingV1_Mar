package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.Page_009_Fundtransfer;
import com.inetBanking.pageObjects.Page_011_LogOut;

/** @Author Ambika
*
*/
public class TC_015_LogOut extends BaseClass {

	@BeforeMethod
	public void login() throws IOException {
		TC_001_LoginTest loginTest = new TC_001_LoginTest();
		loginTest.loginTest();
	}

	@Test
	public void logOut() {

		Page_011_LogOut logOut = new Page_011_LogOut(driver);
		logOut.logOutLink();
		acceptAlert();
	}
}