package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.inetBanking.utilities.ReadConfig;

/** @Author Ambika
*
*/
public class Page_007_EditAccount {
	
	WebDriver localdriver;
	public Page_007_EditAccount(WebDriver remoteDriver) {
		
		localdriver= remoteDriver;
		PageFactory.initElements(remoteDriver, this);
	}
	 
/****************locating elements***********************/
	
	@FindBy(linkText = "Edit Account")
	@CacheLookup
	WebElement editAccountLinkEle;
	
	@FindBy(name = "accountno")
	@CacheLookup
	WebElement accountNumberEle;
	
	@FindBy(name = "AccSubmit")
	@CacheLookup
	WebElement submitBtnEle;
	
	@FindBy(name = "res")
	@CacheLookup
	WebElement restBtnEle;
	
	@FindBy(name = "a_type")
	@CacheLookup
	WebElement typeOfAccountEle;
	
/********************************Action******************************/
	
	public void editAccountLink() {
		editAccountLinkEle.click();
	}
   
	public void accountNumber() {
		accountNumberEle.sendKeys(ReadConfig.readPropertyFileData("accountNumber", "config"));
	}
	
	public void submitAccount() {
		submitBtnEle.click();
	}
	
	public void selectAccountType() {
		Select select_account = new Select(typeOfAccountEle);
		select_account.selectByVisibleText(ReadConfig.readPropertyFileData("accountType", "config"));
		
	}
}
