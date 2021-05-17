package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	

}
