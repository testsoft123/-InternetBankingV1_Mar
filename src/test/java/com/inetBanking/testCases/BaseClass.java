package com.inetBanking.testCases;

/**
 * Interface   :  TakesScreenshot
 * Final Class : DateTimeFormatter ,System ,LocalDateTime
 *  Class      : File ,FileUtils
 *  
 *  NOTE :The final modifier for finalizing the implementations of classes, methods, and variables. 
 *        The main purpose of using a class being declared as final is to prevent the class from being subclasses.
 *        If a class is marked as final then no class can inherit any feature from the final class.
 *  
 * 
 */

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.inetBanking.utilities.GenericUtilites;
import com.inetBanking.utilities.ReadConfig;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	// common variable
	public String baseURL = ReadConfig.readPropertyFileData("baseURL", "config");
	public String userName = ReadConfig.readPropertyFileData("userName", "config");
	public String password = ReadConfig.readPropertyFileData("password", "config");
	public static WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeClass

	public void setUp(String browserName) throws IOException {

		logger = Logger.getLogger("eBanking");
		PropertyConfigurator.configure("log4j.properties");
		// copy the backup of screenShot Folder
		logger.info("copy the backup of screenShot Folder");
		GenericUtilites.copyBackScreenShot();
		// Clearing the Screenshot Folder Content
		logger.info("Clearing the Screenshot Folder Content");
		GenericUtilites.clearSSFolder();
		
		logger.info("copy the backup of ExtentReport Folder");
		GenericUtilites.copyExtentReportFolder();
		logger.info("Clearing the ExtentReport Folder Content");
		GenericUtilites.clearExtentReportFolder();
		
		
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", ReadConfig.readPropertyFileData("chromePath", "config"));
			driver = new ChromeDriver();
		} else if (browserName.equals("firFox")) {
			System.setProperty("webdriver.gecko.driver", ReadConfig.readPropertyFileData("fireFoxPath", "config"));
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown() {
		// driver.quit();
	}

	/***********user defined method  created to check alert is present or not ************/
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			
			return true;
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
			return false;
	   }
   }
	public static void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	/********* Take ScreenShot *****************/
	public static void captureScreen(WebDriver driver, String sheet) throws IOException {
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "/ScreenShots/";
		FileUtils.copyFile(scr, new File(path + sheet + "_" + GenericUtilites.dateTime() + ".png"));
		logger.info("screen shot taken");

	}

	/*
	 * /*********************** Data and Time ********************** public static
	 * String dateTime() {
	 * 
	 * DateTimeFormatter dateTimeFormatter =
	 * DateTimeFormatter.ofPattern("yyyy_MM_dd_HH.mm.ss"); LocalDateTime currentDate
	 * = LocalDateTime.now(); String currentTime =
	 * dateTimeFormatter.format(currentDate); return currentTime;
	 * 
	 * }
	 * 
	 *//********* Take ScreenShot *****************/
	/*
	 * public static void captureScreen(WebDriver driver, String sheet) throws
	 * IOException { File scr = ((TakesScreenshot)
	 * driver).getScreenshotAs(OutputType.FILE); String path =
	 * System.getProperty("user.dir") + "/ScreenShots/"; FileUtils.copyFile(scr, new
	 * File(path + sheet + "_" + dateTime() + ".png"));
	 * logger.info("screen shot taken");
	 * 
	 * }
	 * 
	 *//**************** Random string Method *********************/
	/*
	 * public static String randomString() { String generatedString =
	 * RandomStringUtils.randomAlphabetic(8); return generatedString; }
	 * 
	 *//**************** Random INETGER Method *********************/
	/*
	 * public static String randomNumber() { String generatedString =
	 * RandomStringUtils.randomNumeric(8); return generatedString; }
	 * 
	 * public static void acceptAlert() { driver.switchTo().alert().accept(); }
	 *//***********
		 * user defined method created to check alert is present or not
		 ************/
	/*
	 * public boolean isAlertPresent() { try { driver.switchTo().alert();
	 * 
	 * return true; } catch (NoAlertPresentException e) { // TODO: handle exception
	 * return false; } }
	 * 
	 *//******** Copy the Screenshot Folder Content *********//*
																 * public static void copyBackScreenShot() throws
																 * IOException { FileUtils.copyDirectory(new
																 * File("./ScreenShots"), new
																 * File("D://Guru99Project_V1//Backup//V1_"+dateTime()+
																 * ""));
																 * 
																 * 
																 * } public static void clearSSFolder() throws
																 * IOException { FileUtils.cleanDirectory(new
																 * File("./ScreenShots")); }
																 */
}
