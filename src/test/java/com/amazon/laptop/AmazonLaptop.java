package com.amazon.laptop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.code.BaseLogin;
import com.generic.code.LoginValidation;
import com.utility.Highlighter;
import com.utility.SeleniumUtil;

public class AmazonLaptop extends BaseLogin {

	List<Double> price = new ArrayList<>();

	@BeforeTest
	public void setup() {
		super.login();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void loginValidation() {

		LoginValidation.getLoginValidation(driver);

	}

	@Test(dependsOnMethods = { "loginValidation" })
	public void search() {

		pf.getSearchBox().sendKeys("Laptop");
		pf.getSearchBox().submit();

	
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		
	}

	@Test(dependsOnMethods = { "search" })
	public void brandCheakBox() {

		// selenium
		pf.getHPcheckbox().get(0).click();

	}

	@Test(dependsOnMethods = { "brandCheakBox" })
	public void sorting() {

		pf.getSorting().click();
		pf.getSortingDropOptions().get(1).click();

	}

	@Test(dependsOnMethods = { "sorting" })
	public void allName() {

		pf.getLaptopename().size();// 19

		for (int i = 0; i < pf.getLaptopename().size(); i++) {

			
			new Highlighter(driver).drawBorder(pf.getLaptopename().get(i), "green");

			System.out.println(pf.getLaptopename().get(i).getText());

		}

	}

	@Test(dependsOnMethods = { "allName" })
	public void allPrive() {

		pf.getLaptopprice().size();// 19

		for (int i = 0; i < pf.getLaptopprice().size(); i++) {

			new Highlighter(driver).drawBorder(pf.getLaptopprice().get(i), "red");

			String eachPrice = pf.getLaptopprice().get(i).getAttribute("innerText");// gettext()
			System.out.println(eachPrice.replace("$", ""));
			double doublePrice = Double.parseDouble(eachPrice.replace("$", "").replace(",", ""));
			price.add(doublePrice);// double
		}
	}
	@Test(dependsOnMethods = { "allPrive" })
	public void maxPrice() {
		System.out.println("max no::" + Collections.max(price));
	}
	@Test(dependsOnMethods = { "maxPrice" })
	public void minPrice() {
		System.out.println("min no::" + Collections.min(price));
	}

	@Test(dependsOnMethods = { "minPrice" })
	public void selctLaptop() {

		pf.getLaptopename().get(0).click();

		new SeleniumUtil(driver).explicitClick(pf.getAddToCart().get(0));
		pf.getAddToCart().get(0).click();
		
		try {
			Thread.sleep(3000);
			System.out.println(pf.getAddNoCoverage().size());
			//new SeleniumUtil(driver).conditionActionClick(pf.getAddNoCoverage().get(0), pf.getCart());
			new SeleniumUtil(driver).javScriptClick(pf.getAddNoCoverage().get(0));
			Thread.sleep(3000);
			new SeleniumUtil(driver).javScriptClick(pf.getCart().get(0));
			Thread.sleep(3000);
			
		} catch (Exception e) {
			new SeleniumUtil(driver).explicitClick(pf.getViewCart().get(0));
			pf.getViewCart().get(0).click();
			
		}
	

		
	}

	@Test(dependsOnMethods = { "selctLaptop" })
	public void Test13() {
		
		
		if(pf.getProceedBtn().size()>0) {
			new SeleniumUtil(driver).explicitClick(pf.getProceedBtn().get(0));
			pf.getProceedBtn().get(0).click();
		}else {
			new SeleniumUtil(driver).explicitClick(pf.getMainCart().get(0));
			pf.getMainCart().get(0).click();
			try {
				Thread.sleep(3000);
				new SeleniumUtil(driver).explicitClick(pf.getProceedBtn().get(0));
				pf.getProceedBtn().get(0).click();
			} catch (InterruptedException e) {
			}
		}
	
		new SeleniumUtil(driver).explicitClick(pf.getDeliverAddressBtn().get(0));
		pf.getDeliverAddressBtn().get(0).click();
		new SeleniumUtil(driver).loader();
		try {
			new SeleniumUtil(driver).explicitClick(pf.getPass());
			pf.getPass().sendKeys(objmap.getConfig("pass"));
			pf.getPass().submit();
		} catch (Exception e) {
		}

		new SeleniumUtil(driver).conditionActionClick(pf.getContinueBtn().get(0), pf.getNameOnCard());
	
	}

	@Test(dependsOnMethods = { "Test13" })
	public void Test14() {
		new SeleniumUtil(driver).actionClick(pf.getNameOnCard());
		pf.getNameOnCard().get(0).sendKeys("Student");
		new SeleniumUtil(driver).actionClick(pf.getCardNumber());
		pf.getCardNumber().get(0).sendKeys("90876543212");
		try {
			new SeleniumUtil(driver).explicitClick(pf.getExpireDateYear().get(1));
		} catch (Exception e) {
		}
		pf.getExpireDateYear().get(1).click();
		try {
			new SeleniumUtil(driver).explicitClick(pf.getExpireYearDropDown().get(0));
		} catch (Exception e) {
		}
		pf.getExpireYearDropDown().get(3).click();
		new SeleniumUtil(driver).actionClick(pf.getAddCard());
		
	}

	@Test(dependsOnMethods = { "Test14" })
	public void Test15() {
		try {
			new SeleniumUtil(driver).loader();
			new SeleniumUtil(driver).explicitClick(pf.getFailedPayementVaidation().get(0));
		} catch (Exception e) {
		}
		if (pf.getFailedPayementVaidation().get(0).getAttribute("innerText").contains("Card number is not correct")) {
			
		} else {
			
		}
	}
	@AfterTest
	public void teardown() {
		// driver.quit();

	}

}
