package com.inetBanking.pageObjects;
/**
 * @author user: ambika
 */
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_003_EditCustomer {
	
	WebDriver localDriver;

	public Page_003_EditCustomer(WebDriver remoteDriver) {
		localDriver = remoteDriver;
		PageFactory.initElements(remoteDriver, this);
	}
	
	@FindBy(linkText = "Edit Customer")
	WebElement editCustomerLink;
	
	
	@FindBy(name="cusid")
	@CacheLookup
	WebElement customerId;
	
	@FindBy(name="AccSubmit")
	@CacheLookup
	WebElement submitBtn;
	
	@FindBy(name="res")
	@CacheLookup
	WebElement resetBtn;
	
	public void clickEditCustomer() {
		editCustomerLink.click();
	}
	
	public void enterCoustomerID(String custId) {
		customerId.sendKeys(custId);
	}
	public void submitCustomerId() {
		submitBtn.click();
	}
	public void resetCustomerId() {
		resetBtn.click();
	}
	
	
/***********************************Edit customer field**************************************/
	
	@FindBy(name="name")
	//@CacheLookup
	WebElement customerName;
	
	@FindBy(name="gender")
	@CacheLookup
	WebElement gender;
	
	@FindBy(name="dob")
	@CacheLookup
	WebElement dateOfBirth;
	
	@FindBy(name="addr")
	@CacheLookup
	WebElement address;

	@FindBy(name="city")
	@CacheLookup
	WebElement city;
	
	@FindBy(name="state")
	@CacheLookup
	WebElement state;
	
	@FindBy(name="pinno")
	@CacheLookup
	WebElement picode;
	
	@FindBy(name="telephoneno")
	@CacheLookup
	WebElement mobileNumber;
	
	
	@FindBy(name="emailid")
	@CacheLookup
	WebElement emailId;
	
	@FindBy(name="sub")
	@CacheLookup
	WebElement submitField;
	
	@FindBy(name="res")
	@CacheLookup
	WebElement resetFeild;
	
	
/***Action methods**********/
	
	public void customerNameEdit(String customerNewName) {
		//customerName.clear();
		customerName.sendKeys(customerNewName);
	}
	
	public void editGender(String newGender) {
		gender.clear();
		gender.sendKeys(newGender);
	}
	
	public void editDOB(String mm, String dd, String yyyy ) {
		dateOfBirth.clear();
		//DateOfBirth.sendKeys(editedDOB);
		dateOfBirth.sendKeys(mm);
		dateOfBirth.sendKeys(dd);
		dateOfBirth.sendKeys(yyyy);
	}
	public void editAddress(String editedAddress) {
		address.clear();
		address.sendKeys(editedAddress);

	}
	public void editCity(String editedCity) {
		city.clear();
		city.sendKeys(editedCity);

	}
	public void editstate(String editedState) {
		state.clear();
		state.sendKeys(editedState);
	}
	public void editPincode(String editedPincode) {
		picode.clear();
		picode.sendKeys(editedPincode);

	}
	public void editMobileNum(String editedMobileNum) {
		mobileNumber.clear();
		mobileNumber.sendKeys(editedMobileNum);

	}
	public void editEmailId(String editedEmail) {
		emailId.clear();

		emailId.sendKeys(editedEmail);
	}
	
	public void submitEditField() {

		submitField.click();
	}
	public void resetEditField() {

		resetFeild.click();
	}
	
	
	
	
}
