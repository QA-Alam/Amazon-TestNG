package com.smarttech;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.excelFactory.Excelcreater;
import com.generic.code.BaseLogin;
import com.generic.code.LoginValidation;
import com.utility.SeleniumUtil;
import com.utility.TestConsoleResult;

public class AmazonIphone extends BaseLogin {
	Actions action;
	List<String> iphoneName;
	List<Double> iphonePrice;
	String path22 = "./Test cases/Amazon test cases22.xlsx";
	List<String> data;

	/*
	 * @BeforeSuite public void dbTabledelete() throws Throwable {
	 * 
	 * DatabaseList.delecteTable(); }
	 */
	@Test
// @Parameters("myName")
	public void setUp() throws Throwable {
		super.login();
		
		TestConsoleResult.getTestResult(0, driver.getTitle(), "Passed");
	}

	@Test(dependsOnMethods = { "setUp" })
	public void Test2() {
		TestConsoleResult.getTestResult(1, LoginValidation.getLoginValidation(driver), "Passed");
	}

	@Test(dependsOnMethods = { "Test2" })
	public void Test3() {
		new SeleniumUtil(driver).explicitClick(pf.getSearchBox());
		pf.getSearchBox().sendKeys("iphone");
		pf.getSearchBox().submit();
		TestConsoleResult.getTestResult(2, "Search iphone done", "Passed");
	}

	@Test(dependsOnMethods = { "Test3" })
	public void Test4() {
		pf.getApplecheckbox().click();
		TestConsoleResult.getTestResult(3, "Apple brand selected", "Passed");
	}

	@Test(dependsOnMethods = { "Test4" })
	public void Test5() {
		pf.getSorting().click();
		new SeleniumUtil(driver).explicitClick(pf.getSortingDropOptions().get(2));
		pf.getSortingDropOptions().get(2).click();
		TestConsoleResult.getTestResult(4, "sorting done", "Passed");
	}

	@Test(dependsOnMethods = { "Test5" })
	public void Test6() {
		iphoneName = new SeleniumUtil(driver).getListElementText(pf.getIphonename());
		TestConsoleResult.getTestResult(5, "Iphone Names::" + iphoneName, "Passed");
	}

	@Test(dependsOnMethods = { "Test6" })
	public void Test7() {
		iphonePrice = new SeleniumUtil(driver).getListElementValue(pf.getIphoneprice());
		TestConsoleResult.getTestResult(6, "Iphone price::" + iphonePrice, "Passed");
	}

	@Test(dependsOnMethods = { "Test7" })
	public void Test8() {
		// max price
		TestConsoleResult.getTestResult(7, "Max price::" + Collections.max(iphonePrice), "Passed");
	}

	@Test(dependsOnMethods = { "Test8" })
	public void Test9() {
		// 2nd max price
		iphonePrice.remove(Collections.max(iphonePrice));
		TestConsoleResult.getTestResult(8, "2nd max price::" + Collections.max(iphonePrice), "Passed");
	}

	@Test(dependsOnMethods = { "Test9" })
	public void Test10() {
		// min price
		TestConsoleResult.getTestResult(9, "Min price::" + Collections.min(iphonePrice), "Passed");
	}

	@Test(dependsOnMethods = { "Test10" })
	public void Test11() {
		// 2nd min price
		iphonePrice.remove(Collections.min(iphonePrice));
		TestConsoleResult.getTestResult(10, "2nd min price::" + Collections.min(iphonePrice), "Passed");
	}

	/*
	 * @Test(dependsOnMethods = { "Test11" }) public void Test12() {
	 * pf.getIphonename().get(0).click(); new
	 * SeleniumUtil(driver).explicitClick(pf.getAddToCart().get(0));
	 * pf.getAddToCart().get(0).click();
	 * 
	 * try { Thread.sleep(3000); System.out.println(pf.getAddNoCoverage().size());
	 * //new SeleniumUtil(driver).conditionActionClick(pf.getAddNoCoverage().get(0),
	 * pf.getCart()); new
	 * SeleniumUtil(driver).javScriptClick(pf.getAddNoCoverage().get(0));
	 * Thread.sleep(3000); new
	 * SeleniumUtil(driver).javScriptClick(pf.getCart().get(0)); Thread.sleep(3000);
	 * TestConsoleResult.getTestResult(11, "Add items to my cart", "Passed"); }
	 * catch (Exception e) {
	 * 
	 * }
	 * 
	 * 
	 * try { new SeleniumUtil(driver).explicitClick(pf.getNoThanks().get(0));
	 * pf.getNoThanks().get(0).click(); } catch (Exception e1) {
	 * 
	 * }
	 * 
	 * try { new SeleniumUtil(driver).explicitClick(pf.getViewCart().get(0));
	 * pf.getViewCart().get(0).click(); TestConsoleResult.getTestResult(11,
	 * "Add items to my cart", "Passed"); } catch (Exception e) {
	 * 
	 * } }
	 * 
	 * @Test(dependsOnMethods = { "Test12" }) public void Test13() {
	 * 
	 * 
	 * if(pf.getProceedBtn().size()>0) { new
	 * SeleniumUtil(driver).explicitClick(pf.getProceedBtn().get(0));
	 * pf.getProceedBtn().get(0).click(); }else { new
	 * SeleniumUtil(driver).explicitClick(pf.getMainCart().get(0));
	 * pf.getMainCart().get(0).click(); try { Thread.sleep(3000); new
	 * SeleniumUtil(driver).explicitClick(pf.getProceedBtn().get(0));
	 * pf.getProceedBtn().get(0).click(); } catch (InterruptedException e) { } }
	 * 
	 * new SeleniumUtil(driver).explicitClick(pf.getDeliverAddressBtn().get(0));
	 * pf.getDeliverAddressBtn().get(0).click(); new SeleniumUtil(driver).loader();
	 * try { new SeleniumUtil(driver).explicitClick(pf.getPass());
	 * pf.getPass().sendKeys(objmap.getConfig("pass")); pf.getPass().submit(); }
	 * catch (Exception e) { }
	 * 
	 * new SeleniumUtil(driver).conditionActionClick(pf.getContinueBtn().get(0),
	 * pf.getNameOnCard()); TestConsoleResult.getTestResult(12,
	 * "user able to Procedd for payment", "Passed"); }
	 * 
	 * @Test(dependsOnMethods = { "Test13" }) public void Test14() { new
	 * SeleniumUtil(driver).actionClick(pf.getNameOnCard());
	 * pf.getNameOnCard().get(0).sendKeys("Student"); new
	 * SeleniumUtil(driver).actionClick(pf.getCardNumber());
	 * pf.getCardNumber().get(0).sendKeys("90876543212"); try { new
	 * SeleniumUtil(driver).explicitClick(pf.getExpireDateYear().get(1)); } catch
	 * (Exception e) { } pf.getExpireDateYear().get(1).click(); try { new
	 * SeleniumUtil(driver).explicitClick(pf.getExpireYearDropDown().get(0)); }
	 * catch (Exception e) { } pf.getExpireYearDropDown().get(3).click(); new
	 * SeleniumUtil(driver).actionClick(pf.getAddCard());
	 * TestConsoleResult.getTestResult(13, "Used invalide card", "Passed"); }
	 * 
	 * @Test(dependsOnMethods = { "Test14" }) public void Test15() { try { new
	 * SeleniumUtil(driver).loader(); new
	 * SeleniumUtil(driver).explicitClick(pf.getFailedPayementVaidation().get(0)); }
	 * catch (Exception e) { } if
	 * (pf.getFailedPayementVaidation().get(0).getAttribute("innerText").
	 * contains("Card number is not correct")) { data =
	 * TestConsoleResult.getTestResult(14, "Payement failed", "Passed"); } else {
	 * data = TestConsoleResult.getTestResult(14, "Payement success", "Failed"); } }
	 * 
	 * @AfterTest() public void teardown() throws Throwable {
	 * Excelcreater.wtireContecnt(path22, data); driver.quit(); }
	 */
}
