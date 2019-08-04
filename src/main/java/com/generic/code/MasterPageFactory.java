package com.generic.code;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MasterPageFactory {

	/**
	 * @author sarow
	 * 
	 *         Selenium usual code>> WebElement signinbutton; signinbutton =
	 *         driver.findElelment(By.xpath("//*[contains(text(),'Hello')]"));
	 *         here @FindBy=driver.findElelment WebElement means single object
	 *         List<WebElement> means multiple objects
	 */

	/*
	 * Css selector use like this
	 * 
	 * @FindBy(css= "#ap_password") private WebElement pass3;
	 */

	@FindBy(xpath = "//*[contains(text(),'Hello')]") // a=10
	private List<WebElement> signinbutton;// dec==> int a
	@FindBy(xpath = "//*[contains(@id,'add-to-cart-button')]")
	private List<WebElement> addToCart;
	@FindBy(xpath = "//*[contains(@value,'cart')]")
	private List<WebElement> tvAddToCart;
	@FindBy(xpath = "//*[@id='attachSiNoCoverage-announce']")
	private List<WebElement> addNoCoverage;
	@FindBy(xpath = "(//*[contains(text(),'View Cart' )])[2]")
	private List<WebElement> viewCart;
	@FindBy(xpath = "//*[@id='siNoCoverage-announce']")
	private List<WebElement> noThanks;
	@FindBy(xpath = "//*[@class='a-popover-header']//button")
	private List<WebElement> closeBtn;
	@FindBy(xpath = "//*[@class='a-button a-button-base attach-button-large']//*[contains(text(),'Cart')]")
	private List<WebElement> cart;
	@FindBy(xpath = "//*[@id='nav-cart']")
	private List<WebElement> mainCart;
	@FindBy(xpath = "//*[contains(@class,'close')]")
	private List<WebElement> clsoeBtn;
	@FindBy(xpath = "//*[@name='proceedToCheckout']")
	private List<WebElement> proceedBtn;
	@FindBy(xpath = "(//*[contains(text(),'Proceed')])[1]")
	private List<WebElement> tvProceedBtn;
	@FindBy(xpath = "//*[contains(text(),'All Buying')]")
	private List<WebElement> allBuyingOptions;
	@FindBy(xpath = "//*[contains(text(),'Hello')]")
	private WebElement signinbtn;
	@FindBy(xpath = "//*[@id='nav-al-your-account']//*[contains(text(),'Sign Out')]")
	private List<WebElement> signout;
	@FindBy(xpath = "//*[contains(@id,'twotabsearchtextbox')]")
	private WebElement searchBox;
	@FindBy(xpath = "//*[contains(@id,'a-autoid-0-announce')]")
	private WebElement sorting;
	@FindBy(xpath = "//*[contains(@id,'Apple')]//*[@class='a-icon a-icon-checkbox']")
	private WebElement Applecheckbox;
	@FindBy(xpath = "//*[contains(@id,'HP')]//*[@class='a-icon a-icon-checkbox']")
	private List<WebElement> HPcheckbox;
	@FindBy(xpath = "//*[contains(@id,'Samsung')]//*[@class='a-icon a-icon-checkbox']")
	private List<WebElement> SamsungTvcheckbox;
	@FindBy(xpath = "//*[contains(@id,'HP')]//*[contains(@class,'a-size-base a-color-base a-text-bold')]")
	private List<WebElement> HPcheckboxSelect;
	@FindBy(xpath = "//h2//a//span")
	private List<WebElement> iphonename;
	@FindBy(xpath = "//*[@class='a-section a-spacing-none']//h2")
	private List<WebElement> laptopename;
	@FindBy(xpath = "//*[@class='sg-row']//*[@class='a-price']//span[@class='a-offscreen']")
	private List<WebElement> iphoneprice;
	@FindBy(xpath = "//*[contains(@class,'s-include-content-margin s-border-bottom')]//*[@class='a-offscreen' or @class='a-color-base']")
	private List<WebElement> laptopprice;
	@FindBy(xpath = "//*[@class='a-button-inner']//*[contains(text(),'Deliver to this address')]")
	private List<WebElement> deliverAddressBtn;
	@FindBy(css = "input.a-button-text")
	private List<WebElement> continueBtn;
	@FindBy(xpath = "//*[contains(@class,'a-width-base')]")
	private List<WebElement> NameOnCard;
	@FindBy(xpath = "//*[contains(@name,'addCreditCardNumber')]")
	private List<WebElement> cardNumber;
	@FindBy(xpath = "//*[@role='button']")
	private List<WebElement> expireDateYear;
	@FindBy(xpath = "//*[@class='a-popover-inner']//a")
	private List<WebElement> expireYearDropDown;
	@FindBy(xpath = "(//*[contains(@type,'submit')])[2]")
	private List<WebElement> addCard;
	@FindBy(xpath = "(//*[contains(@class,'a-box a-alert a-alert-error')])[1]")
	private List<WebElement> failedPayementVaidation;
	@FindBy(xpath = "//*[@id='ap_email']")
	private WebElement email;
	@FindBy(xpath = "//*[@id='ap_password']")
	private WebElement pass;
	@FindBy(xpath = "//*[@class='a-popover-wrapper']//li")
	private List<WebElement> sortingDropOptions;

	// GCR page
	@FindBy(xpath = "//*[contains(text(),'My Account')]")
	private List<WebElement> myAccount;
	@FindBy(xpath = "//*[@name='email_address']")
	private List<WebElement> gcrEmail;
	@FindBy(xpath = "//*[@name='password']")
	private List<WebElement> gcrPassword;
	@FindBy(xpath = "//*[starts-with(text(),'Sign In')]")
	private List<WebElement> gcrSignin;
	@FindBy(xpath = "//*[contains(text(),'Log Off')]")
	private List<WebElement> gcrLogout;
	
	public List<WebElement> getSignout() {
		return signout;
	}

	public WebElement getSigninbtn() {

		return signinbtn;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSorting() {
		return sorting;
	}

	public WebElement getApplecheckbox() {
		return Applecheckbox;
	}

	public List<WebElement> getIphonename() {
		return iphonename;
	}

	public List<WebElement> getIphoneprice() {
		return iphoneprice;
	}

	public WebElement getEmail() {

		return email;
	}

	public WebElement getPass() {

		return pass;
	}

	public List<WebElement> getSigninbutton() {
		return signinbutton;
	}

	public List<WebElement> getSortingDropOptions() {
		return sortingDropOptions;
	}

	public List<WebElement> getAddToCart() {
		return addToCart;
	}

	public List<WebElement> getViewCart() {
		return viewCart;
	}

	public List<WebElement> getClsoeBtn() {
		return clsoeBtn;
	}

	public List<WebElement> getProceedBtn() {
		return proceedBtn;
	}

	public List<WebElement> getDeliverAddressBtn() {
		return deliverAddressBtn;
	}

	public List<WebElement> getContinueBtn() {
		return continueBtn;
	}

	public List<WebElement> getNameOnCard() {
		return NameOnCard;
	}

	public List<WebElement> getCardNumber() {
		return cardNumber;
	}

	public List<WebElement> getAddCard() {
		return addCard;
	}

	public List<WebElement> getFailedPayementVaidation() {
		return failedPayementVaidation;
	}

	public List<WebElement> getExpireDateYear() {
		return expireDateYear;
	}

	public List<WebElement> getExpireYearDropDown() {
		return expireYearDropDown;
	}

	public List<WebElement> getMainCart() {
		return mainCart;
	}

	public List<WebElement> getAddNoCoverage() {
		return addNoCoverage;
	}

	public List<WebElement> getCart() {
		return cart;
	}

	public List<WebElement> getHPcheckbox() {
		return HPcheckbox;
	}

	public List<WebElement> getLaptopename() {
		return laptopename;
	}

	public List<WebElement> getHPcheckboxSelect() {
		return HPcheckboxSelect;
	}

	public List<WebElement> getLaptopprice() {
		return laptopprice;
	}

	public List<WebElement> getSamsungTvcheckbox() {
		return SamsungTvcheckbox;
	}

	public List<WebElement> getNoThanks() {
		return noThanks;
	}

	public List<WebElement> getAllBuyingOptions() {
		return allBuyingOptions;
	}

	public List<WebElement> getTvAddToCart() {
		return tvAddToCart;
	}

	public List<WebElement> getCloseBtn() {
		return closeBtn;
	}

	public List<WebElement> getTvProceedBtn() {
		return tvProceedBtn;
	}

	public List<WebElement> getMyAccount() {
		return myAccount;
	}

	public List<WebElement> getGcrEmail() {
		return gcrEmail;
	}

	public List<WebElement> getGcrPassword() {
		return gcrPassword;
	}

	public List<WebElement> getGcrSignin() {
		return gcrSignin;
	}

	public List<WebElement> getGcrLogout() {
		return gcrLogout;
	}

}
