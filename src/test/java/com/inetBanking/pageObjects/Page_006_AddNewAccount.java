package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.inetBanking.utilities.ReadConfig;

/**
 * @Author Ambika
 *
 */
public class Page_006_AddNewAccount {

	WebDriver localDriver;

	public Page_006_AddNewAccount(WebDriver remoteDriver) {
		localDriver = remoteDriver;
		PageFactory.initElements(remoteDriver, this);

	}

	/******************* locating element ********************/
	@FindBy(xpath = "//a[normalize-space()='New Account']")
	WebElement newAccountLink;
	
	@FindBy(name ="cusid")
	WebElement customerIdEle;

	@FindBy(name ="selaccount")
	WebElement selectAccount;

	@FindBy(name ="inideposit")
	WebElement initialDepositEle;

	@FindBy(name ="button2")
	WebElement submit;

	@FindBy(name = "reset")
	WebElement reset;

	/********************** 8Action *******************************/
	public void newAccountLinkClick() {
		newAccountLink.click();
	}

	public void customerId(String customer_id) {
		customerIdEle.clear();
		customerIdEle.sendKeys(customer_id);

	}

	public void accountType(String accountTypeSelect) {
		Select select_account = new Select(selectAccount);
		select_account.selectByVisibleText(accountTypeSelect);
	}

	public void initialDeposit(String initial_Deposit) {
		initialDepositEle.sendKeys(initial_Deposit);
	}
	
	public void newAccountDetails() {
		
		customerId(ReadConfig.readPropertyFileData("customerID","config"));
		accountType(ReadConfig.readPropertyFileData("accountType","config"));
		initialDeposit(ReadConfig.readPropertyFileData("initialdeposit","config"));
		
	}

	public void submitAccount() {
		submit.click();
	}

	public void resetAccount() {
		reset.click();
	}

}
