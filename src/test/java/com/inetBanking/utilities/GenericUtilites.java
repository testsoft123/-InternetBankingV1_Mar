package com.inetBanking.utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;

/** @Author Ambika
*
*/
public class GenericUtilites {
	public static WebDriver driver;
	public static Logger logger;
	
	/*********************** Data and Time ***********************/
	public static String dateTime() {

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH.mm.ss");
		LocalDateTime currentDate = LocalDateTime.now();
		String currentTime = dateTimeFormatter.format(currentDate);
		return currentTime;

	}

	
	/**************** Random string Method *********************/
	public static String randomString() {
		String generatedString = RandomStringUtils.randomAlphabetic(8);
		return generatedString;
	}

	/**************** Random INETGER Method *********************/
	public  static String randomNumber() {
		String generatedString = RandomStringUtils.randomNumeric(8);
		return generatedString;
	}
	
	
	/********Copy the Screenshot Folder Content*********/
	public static void copyBackScreenShot() throws IOException {
		FileUtils.copyDirectory(new File("./ScreenShots"), new File("D://Guru99Project_V1//Backup//V1_"+dateTime()+""));
		
		
	}
	/********clear the Screenshot Folder Content*********/
	public static void clearSSFolder() throws IOException {
		FileUtils.cleanDirectory(new File("./ScreenShots"));
	}
	/********Copy the ExtentReport Folder Content*********/	
	public static void copyExtentReportFolder() throws IOException {
		FileUtils.copyDirectory(new File("./test-output/Extent-Report"), new File("D://Guru99Project_V1//Backup//ExtentReport//V1_"+dateTime()+""));
		
	}
	/********clear the clearExtentReportFolder Content*********/
	public static void clearExtentReportFolder() throws IOException {
		FileUtils.cleanDirectory(new File("./test-output/Extent-Report"));
	}
	
}
