package com.inetBanking.testCases;
/** @Author Ambika
*
*/

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.Page_007_EditAccount;

public class TC_008_EditAccount extends BaseClass {
	
	@BeforeMethod
	public void login() throws IOException {
		TC_001_LoginTest loginTest = new TC_001_LoginTest();
		loginTest.loginTest();
	}
	
	@Test
	
	public void editAccount() {
		Page_007_EditAccount account= new Page_007_EditAccount(driver);
		account.editAccountLink();
		account.accountNumber();
		account.submitAccountBtn();
		account.selectAccountType();
		account.editSubmitBtn();
	}
	

}
