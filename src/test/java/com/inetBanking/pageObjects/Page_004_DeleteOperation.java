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
public class Page_004_DeleteOperation {
	WebDriver localDriver;
	public Page_004_DeleteOperation(WebDriver remoteDriver) {
		localDriver = remoteDriver;
		PageFactory.initElements(remoteDriver, this);
	}
//Deleting customer
	
	@FindBy(linkText="Delete Customer")
	WebElement deleteCustomerLink;
	
	
	@FindBy(name="cusid")
	WebElement deleteCustomerId;
	
	@FindBy(name="AccSubmit")
	WebElement deleteCussubmit;
	
//delete account
	@FindBy(linkText = "Delete Account")
	@CacheLookup
	WebElement deleteAccountEle;
	
	@FindBy(name = "accountno")
	@CacheLookup
	WebElement accountNumberEle;
	
	@FindBy(name = "AccSubmit")
	@CacheLookup
	WebElement accountSubmitEle;
	
	@FindBy(name = "res")
	@CacheLookup
	WebElement accountResetEle;
	
//Action
	
public void deleteCustomerLinkBtn() {
	deleteCustomerLink.click();
}
	
public void deleteCustomer(String customerId) {
	deleteCustomerId.sendKeys(customerId);
	
}
public void deleteCustomerBtn() {
	deleteCussubmit.click();
}
	
//Action delete account

public void deleteAccountLink() {
	deleteAccountEle.click();
	
 }
public void accountNumber() {
	accountNumberEle.sendKeys(ReadConfig.readPropertyFileData("accountNumber", "deleteOperation"));
}
public void submitDeleteBtn() {
	accountSubmitEle.click();
}
public void resetdelteBtn() {
	accountResetEle.click(); 
}

public void accountDelete() {
	deleteAccountLink();
	accountNumber();
	resetdelteBtn();
	accountNumber();
	submitDeleteBtn();
}
}






