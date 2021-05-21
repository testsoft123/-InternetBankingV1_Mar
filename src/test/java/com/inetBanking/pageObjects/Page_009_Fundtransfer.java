package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetBanking.utilities.ReadConfig;

/** @Author Ambika
*
*/
public class Page_009_Fundtransfer {
	
	

	WebDriver localDriver;

	public Page_009_Fundtransfer(WebDriver remoteDriver) {
		localDriver = remoteDriver;
		PageFactory.initElements(remoteDriver, this);
	}

	/*************** locating element *********************/
	@FindBy(linkText = "Fund Transfer")
	@CacheLookup
	WebElement transferEle;
	
	@FindBy(name = "payersaccount")
	@CacheLookup
	WebElement payersaccountEle;

	@FindBy(name = "payeeaccount")
	@CacheLookup
	WebElement payeeaccountEle;

	@FindBy(name = "ammount")
	@CacheLookup
	WebElement amountEle;

	@FindBy(name = "desc")
	@CacheLookup
	WebElement descriptionEle;

	@FindBy(name = "AccSubmit")
	@CacheLookup
	WebElement submitBtnEle;

	@FindBy(name = "res")
	@CacheLookup
	WebElement resetBtnEle;
	

	

	/************************** Action **************************/

	public void fundTransferLink() {
		transferEle.click();
	}
	
	

	public void payersAccount() {
		payersaccountEle.sendKeys(ReadConfig.readPropertyFileData("payersAccount", "config"));
	}
	public void payeeAccount() {
		payeeaccountEle.sendKeys(ReadConfig.readPropertyFileData("payeeAccount", "config"));
	}

	public void amount() {
		amountEle.sendKeys(ReadConfig.readPropertyFileData("amountTransfer", "config"));
	}

	public void description() {
		descriptionEle.sendKeys(ReadConfig.readPropertyFileData("descriptionTrans", "config"));
	}

	public void submitBtn() {
		submitBtnEle.click();
	}

	public void resetBtn() {
		resetBtnEle.click();
	}
	

	
	
	
	
	/************ main Action **************/
	public void details() {
		
		payersAccount();
		payeeAccount();
		amount();
		description();
	}
}