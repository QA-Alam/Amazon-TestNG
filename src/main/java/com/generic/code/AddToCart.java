package com.generic.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.Highlighter;

public class AddToCart {

	static WebDriver driver;
	static Highlighter color;
	static MasterPageFactory pf;

	public static WebDriver getcart(WebDriver driver) {
		pf = PageFactory.initElements(driver, MasterPageFactory.class);

		color = new Highlighter(driver);

		color.drawBorder(pf.getSearchBox(), "red");
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(pf.getSearchBox()));
		pf.getSearchBox().sendKeys("iphone");
		pf.getSearchBox().submit();
		return driver;
	}
}
