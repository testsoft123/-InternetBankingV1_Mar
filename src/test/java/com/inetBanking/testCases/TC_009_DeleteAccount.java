package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.Page_004_DeleteOperation;

/** @Author Ambika
*
*/
public class TC_009_DeleteAccount extends BaseClass{

	
	@BeforeMethod
	public void login() throws IOException {
		TC_001_LoginTest loginTest = new TC_001_LoginTest();
		loginTest.loginTest();
	}
	
	@Test
	public void deleteAccount() {
		
		Page_004_DeleteOperation deleteOperation = new Page_004_DeleteOperation(driver);
		deleteOperation.accountDelete();
		acceptAlert();
		acceptAlert();
	}
}
