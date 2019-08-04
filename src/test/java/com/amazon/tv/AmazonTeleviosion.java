package com.amazon.tv;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.code.BaseLogin;
import com.generic.code.LoginValidation;

public class AmazonTeleviosion extends BaseLogin {

	@BeforeTest
	public void setup() {

		super.login();

	}

	@Test
	public void loginvalidation() {

		LoginValidation.getLoginValidation(driver);

	}

	@Test(dependsOnMethods = { "loginvalidation" })
	public void searchTV() {

		pf.getSearchBox().sendKeys("tv");
		pf.getSearchBox().submit();

	}

	@Test(dependsOnMethods = { "searchTV" })
	public void brandCheckBox() {

		pf.getSamsungTvcheckbox().get(0).click();

	}

	@Test(dependsOnMethods = { "brandCheckBox" })
	public void sorting() {

		pf.getSorting().click();
		pf.getSortingDropOptions().get(2).click();

	}

	@Test(dependsOnMethods = { "sorting" })
	public void AllTvName() {

		pf.getLaptopename().size();// 22

		for (int i = 0; i < pf.getLaptopename().size(); i++) {

			System.out.println(pf.getLaptopename().get(i).getText());

		}
	}

	@Test(dependsOnMethods = { "AllTvName" })
	public void AllTvPrice() {

		pf.getLaptopprice().size();// 22

		List<String> allprice = new ArrayList<>();

		for (int i = 0; i < pf.getLaptopprice().size(); i++) {

			allprice.add(pf.getLaptopprice().get(i).getAttribute("innerText"));
		}

		System.out.println(allprice);

		
		List<String> allpriceNoduplicate =new ArrayList<>();

	 allpriceNoduplicate = allprice.stream().distinct().collect(Collectors.toList());

		System.out.println(allpriceNoduplicate);

	}

}
