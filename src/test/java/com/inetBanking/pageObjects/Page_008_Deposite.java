package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetBanking.utilities.ReadConfig;

/**
 * @Author Ambika
 *
 */
public class Page_008_Deposite {

	WebDriver localDriver;

	public Page_008_Deposite(WebDriver remoteDriver) {
		localDriver = remoteDriver;
		PageFactory.initElements(remoteDriver, this);
	}

	/*************** locating element *********************/
	@FindBy(linkText = "Deposit")
	@CacheLookup
	WebElement depositLinkEle;

	@FindBy(name = "accountno")
	@CacheLookup
	WebElement accountNumberEle;

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

	public void depositLink() {
		depositLinkEle.click();
	}

	public void accountNumber() {
		accountNumberEle.sendKeys(ReadConfig.readPropertyFileData("accountNumber", "config"));
	}

	public void amount() {
		amountEle.sendKeys(ReadConfig.readPropertyFileData("amount", "config"));
	}

	public void description() {
		descriptionEle.sendKeys(ReadConfig.readPropertyFileData("description", "config"));
	}

	public void submitBtn() {
		submitBtnEle.click();
	}

	public void resetBtn() {
		resetBtnEle.click();
	}

	/************ main Action **************/
	public void depositDetails() {
		
		accountNumber();
		amount();
		description();
	}
}
