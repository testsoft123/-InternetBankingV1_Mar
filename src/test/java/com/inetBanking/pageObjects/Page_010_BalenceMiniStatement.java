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
public class Page_010_BalenceMiniStatement {
	
	WebDriver localDriver;

	public Page_010_BalenceMiniStatement(WebDriver remoteDriver) {
		localDriver = remoteDriver;
		PageFactory.initElements(remoteDriver, this);
	}

	/*************** locating element *********************/
	@FindBy(linkText = "Balance Enquiry")
	@CacheLookup
	WebElement balanceEnquiryEle;
	
	@FindBy(linkText = "Mini Statement")
	@CacheLookup
	WebElement miniStatementEle;
	
	@FindBy(name = "accountno")
	@CacheLookup
	WebElement accountnoEle;
	
	@FindBy(name = "AccSubmit")
	@CacheLookup
	WebElement submitBtnEle;

	@FindBy(name = "res")
	@CacheLookup
	WebElement resetBtnEle;
	
	@FindBy(linkText = "Home")
	@CacheLookup
	WebElement homeEle;
	
	/************************** Action **************************/	
	
	public void balenceLink() {
		balanceEnquiryEle.click();
	}
	public void miniStatmentLink() {
		miniStatementEle.click();
		
	}
	

	public void accountNumaber() {
		String acc =ReadConfig.readPropertyFileData("payersAccount", "config");
	accountnoEle.sendKeys(acc);
	}
	
	public void submitBtn() {
		submitBtnEle.click();
	}

	public void resetBtn() {
		resetBtnEle.click();
	}
	public void homeLink() {
		homeEle.click();
	}
}
