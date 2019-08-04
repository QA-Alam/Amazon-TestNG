package com.generic.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginValidation {


	static MasterPageFactory pf;
	static Actions action;
	
	
	 public static  String getLoginValidation(WebDriver driver){
	
	 pf = PageFactory.initElements(driver, MasterPageFactory.class);
		// a=10;
		  action = new Actions(driver);
		 action.moveToElement(pf.getSigninbtn()).perform();
		 
		 if(pf.getSignout().size()>0) {
			 //System.out.println("Login Passed");
		 }else {
			// System.out.println("Login Failed");
		 }
		
		Assert.assertTrue(pf.getSignout().size()>0);
		String status = "Login success";
		 
	return status ;
	}
	
}
