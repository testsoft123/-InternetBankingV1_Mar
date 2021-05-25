package com.inetBanking.pageObjects;
/** @Author Ambika
*
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_011_LogOut {
	
	WebDriver localDriver;
	public Page_011_LogOut(WebDriver remoteDriver) {
		localDriver = remoteDriver;
		PageFactory.initElements(remoteDriver, this);
	}

	/*************** locating element *********************/
	@FindBy(linkText = "Log out")
	@CacheLookup
	WebElement logOutEle;
	
	

	/************************** Action **************************/

	public void logOutLink() {
		logOutEle.click();
	}
}
