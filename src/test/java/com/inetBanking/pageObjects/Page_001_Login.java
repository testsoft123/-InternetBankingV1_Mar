package com.inetBanking.pageObjects;
/** @Author Ambika
 * 
 *Note:  @CacheLookup
	This annotation, when applied over a WebElement, 
	instructs Selenium to keep a cache of the WebElement instead of searching for the
	WebElement every time from the WebPage.
*
*/


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_001_Login {
	// create driver
	WebDriver localDriver;

	// create constructor and initiate web elements

	public Page_001_Login(WebDriver remoteDriver) {
		// TODO Auto-generated constructor stub

		localDriver = remoteDriver;// 

		PageFactory.initElements(remoteDriver, this);//initiation web elements
	}
	// to locate the web element instead of findByElement we use @FindBy annotation
	@FindBy(name = "uid")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(name = "password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(name = "btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath = "/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement btnLogOut;

	// Action method

	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}

	public void setPassword(String password) {

		txtPassword.sendKeys(password);

	}

	public void clickSubmit() {
		btnLogin.click();

	}
	public void clickLogOut() {
		btnLogOut.click();

	}
}
