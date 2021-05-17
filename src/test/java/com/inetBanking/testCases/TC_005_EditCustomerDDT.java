package com.inetBanking.testCases;

import java.io.IOException;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.Page_002_AddNewCustomer;
import com.inetBanking.pageObjects.Page_003_EditCustomer;
import com.inetBanking.pageObjects.Page_001_Login;
import com.inetBanking.utilities.XLUtils;

public class TC_005_EditCustomerDDT extends BaseClass{
	
	@BeforeMethod
	public void test() throws IOException {
		TC_004_EditCustomerTest editCustomerTest = new TC_004_EditCustomerTest();
		editCustomerTest.editCustomer();
		
	}
	
	/*
	 * @Test public void edit() { System.out.println("hhhhhhhhhhhhhhhhhhhhhh");
	 * EditCustomerPage customerPage = new EditCustomerPage(driver);
	 * customerPage.customerNameEdit(userName); //customerPage.resetEditField();
	 * 
	 * }
	 */
	 
	
	
	/*
	 * @Test(dataProvider = "loginData") public void editCustomerDDT(String
	 * userName, String gender,String dob,String address,String city,String
	 * state,String pin,String mobileNum, String emailID) throws IOException {
	 * 
	 * 
	 * EditCustomerPage customerPage = new EditCustomerPage(driver);
	 * //customerPage.resetEditField(); customerPage.customerNameEdit(userName);
	 * customerPage.editGender(gender); // customerPage.editDOB(dob);
	 * customerPage.editAddress(address); customerPage.editCity(city);
	 * customerPage.editstate(state); customerPage.editPincode(pin);
	 * customerPage.editMobileNum(mobileNum); customerPage.editEmailId(emailID);
	 * customerPage.submitEditField();
	 * 
	 * 
	 * }
	 */
	  @Test
	 public void editCustomer() {
		  Page_003_EditCustomer addCustomerPage = new Page_003_EditCustomer(driver);
			//addCustomerPage.clickAddNewCustomer();
			//addCustomerPage.customerNameEdit("neema123");
			//addCustomerPage.editGender("male787");
			//addCustomerPage.editDOB("07", "09", "1987");
			addCustomerPage.editAddress("india");
			addCustomerPage.editCity("banglore");
			addCustomerPage.editstate("karnataka");
			addCustomerPage.editPincode("9898988");
			addCustomerPage.editMobileNum("99999999");
			addCustomerPage.editEmailId("kahjkdh@gamil.com");
			//addCustomerPage.custPassword("kkkkk");
			addCustomerPage.submitEditField();
	  }
	@DataProvider(name = "loginData")
	String[][] getData() throws IOException {

		String path = System.getProperty("user.dir") + "/src/test/java/com/inetBanking/testData/LoginData.xlsx";
		int rowNum = XLUtils.getRowCount(path, "Sheet3");
		int colCount = XLUtils.getCellCount(path, "Sheet3", 1);

		String loginData[][] = new String[rowNum][colCount];

		for (int i = 1; i <= rowNum; i++) {

			for (int j = 0; j < colCount; j++) {

				loginData[i - 1][j] = XLUtils.getCellData(path, "Login", i, j);
				System.out.println(loginData[i - 1][j]);
			}
		}
		return loginData;
	}

}
