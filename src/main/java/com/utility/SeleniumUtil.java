package com.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtil {

	WebDriver driver;

	public SeleniumUtil(WebDriver driver) {
		this.driver = driver;

	}

	public void loader() {

		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.attributeContains(
					By.xpath("//*[@class='template loading-spinner-spp']"), "style", "display:none"));
		} catch (Exception e) {

		}

	}

	public void javScriptClick(WebElement element) {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}

	public void actionClick(List<WebElement> element) {

		while (element.size() > 0) {
			Actions action = new Actions(driver);
			new Highlighter(driver).drawBorder(element.get(0), "red");
			action.moveToElement(element.get(0)).click(element.get(0)).build().perform();
			new SeleniumUtil(driver).loader();
			break;
		}
	}

	public void conditionActionClick(WebElement element, List<WebElement> list) {
		while (list.size() == 0) {
			System.out.println("list not found");
			Actions action = new Actions(driver);
			new Highlighter(driver).drawBorder(element, "red");
			action.moveToElement(element).click(element).build().perform();
			try {
				Thread.sleep(3000);
				new SeleniumUtil(driver).explicitClick(list.get(0));
			} catch (InterruptedException e) {
			}
			if (list.size() > 0) {
				System.out.println("Got my list element");
				break;
			}
		}
	}

	public void explicitClick(WebElement element) {

		try {
			Thread.sleep(3000);
			new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {

		}
	}

	public void explicitVisible(WebElement element) {
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
		}
	}
	public List<String> getListElementText(List<WebElement> element) {
		List<String> list = new ArrayList<>();
		element.forEach(name -> {
			list.add(name.getAttribute("innerText"));
		});
		return list;
	}

	public List<Double> getListElementValue(List<WebElement> element) {
		List<Double> list = new ArrayList<>();
		list = element.stream().map(e -> e.getAttribute("innerText")).map(e -> e.replaceAll("[^0-9.]", ""))
				.map(e -> Double.parseDouble(e)).collect(Collectors.toList());
		return list;
	}
}
