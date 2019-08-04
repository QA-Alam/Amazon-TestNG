package com.generic.code;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class ValidationPage {

	
	static WebDriver driver ;
	
	public static WebDriver getValidation(WebDriver driver) {
	String pageTitle = "Amazon";
	if(driver.getTitle().contains(pageTitle)){
		System.out.println("=================================================");
		System.out.println("Test Passed>>>> Page Title:: " + driver.getTitle());
				}
	else {
		System.out.println("Test Failed>>>> Page Title:: " + driver.getTitle());
	}
	Assert.assertTrue(driver.getTitle().contains(pageTitle));
	Reporter.log("Page Title::"+driver.getTitle());
	
	return driver;
	
	}
}
