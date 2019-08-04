
package com.stepdef.amazon.tv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.generic.code.BaseLogin;
import com.generic.code.LoginValidation;
import com.utility.Highlighter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefTV extends BaseLogin {

	List<Double> allprice = new ArrayList<>();

	@Given("^Login$")
	public void login() {

		super.login();

	}

	@Then("^Validate login$")
	public void validate_login() {

		LoginValidation.getLoginValidation(driver);

	}

	@When("^search tv$")
	public void search_tv() {

		pf.getSearchBox().sendKeys("tv");
		pf.getSearchBox().submit();
	}

	@When("^Click tv checkbox$")
	public void click_tv_checkbox() {
		pf.getSamsungTvcheckbox().get(0).click();

	}

	@When("^Sort high to low price$")
	public void sort_high_to_low_price() {
		pf.getSorting().click();
		pf.getSortingDropOptions().get(2).click();

	}

	@When("^All tv name$")
	public void all_tv_name() {
		pf.getLaptopename().size();// 22

		for (int i = 0; i < pf.getLaptopename().size(); i++) {

			Highlighter obj = new Highlighter(driver);
			obj.drawBorder(pf.getLaptopename().get(i), "red");
			System.out.println(pf.getLaptopename().get(i).getText());
			

		}

	}

	@When("^All tv price$")
	public void all_tv_price() {

		pf.getLaptopprice().size();// 22

		for (int i = 0; i < pf.getLaptopprice().size(); i++) {

			Highlighter obj = new Highlighter(driver);
			obj.drawBorder(pf.getLaptopprice().get(i), "green");
			String tvprice = pf.getLaptopprice().get(i).getAttribute("innerText");
			System.out.println(tvprice);
			String removeLetter= tvprice.replaceAll("\\D", "");

			double alltvprice = Double.parseDouble(removeLetter);

			allprice.add(alltvprice);
		}
		System.out.println(allprice);

	}

	@When("^Find the highest  price$")
	public void find_the_highest_price() {

		System.out.println(Collections.max(allprice));

	}

	@When("^find out (\\d+)nd highest price$")
	public void find_out_nd_highest_price(int arg1) {

		allprice.remove(Collections.max(allprice));
		System.out.println(Collections.max(allprice));

	}

	@When("^Find the lowest price$")
	public void find_the_lowest_price() {

		System.out.println(Collections.min(allprice));
	}

	@When("^find out (\\d+)nd lowest price$")
	public void find_out_nd_lowest_price(int arg1) {
		allprice.remove(Collections.min(allprice));
		System.out.println(Collections.min(allprice));
	}

	@When("^Add one tv to cart$")
	public void add_one_tv_to_cart() {

		pf.getLaptopename().get(0).click();

	}

	@When("^Procedd for payment$")
	public void procedd_for_payment() throws InterruptedException {

		pf.getAllBuyingOptions().get(0).click();
		pf.getTvAddToCart().get(0).click();
		Thread.sleep(3000);
		pf.getCloseBtn().get(0).click();
		pf.getTvProceedBtn().get(0).click();
		pf.getDeliverAddressBtn().get(0).click();
		pf.getContinueBtn().get(0).click();

	}

	@When("^use invalide card$")
	public void use_invalide_card() throws Throwable {
		
		
		try {
			new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(pf.getNameOnCard().get(0)));
			
		} catch (Exception e) {
		
		}
		Thread.sleep(3000);
		System.out.println(pf.getNameOnCard().size());
		
		pf.getNameOnCard().get(0).click();
		pf.getNameOnCard().get(0).sendKeys("Student");
		pf.getCardNumber().get(0).click();
		pf.getCardNumber().get(0).sendKeys("32343243532432");
		pf.getExpireDateYear().get(1).click();
		pf.getExpireYearDropDown().get(3).click();
		
		pf.getAddCard().get(0).click();

	}

	@Then("^validate payement was failed$")
	public void validate_payement_was_failed() {
		
		String failPayment = pf.getFailedPayementVaidation().get(0).getText();
		
		if(failPayment.contains("There was a problem")) {
			
			System.out.println("Payment failed");
		}else {
			System.out.println("payment Passed");
		}

	}

}
