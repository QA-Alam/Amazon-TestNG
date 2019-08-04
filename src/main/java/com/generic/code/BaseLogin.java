package com.generic.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.extentreportAmazon.ExtendsReport;

public class BaseLogin extends ExtendsReport{
	
	protected WebDriver driver;
	String workingDir;
	protected MasterPageFactory pf;
	 protected ObjectMap objmap;


	public void login() {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();// upcasting
		driver.manage().window().maximize(); //

		workingDir = System.getProperty("user.dir");
		try {
			objmap = new ObjectMap(workingDir + "./config");
		} catch (Throwable e) {

		}
		driver.get(objmap.getConfig("URL"));

		//MasterPageFactory obj =new MasterPageFactory();
		//MasterPageFactory obj=PageFactory.initElements(driver, MasterPageFactory.class);
		
		pf = PageFactory.initElements(driver, MasterPageFactory.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(pf.getSigninbtn()));
		pf.getSigninbtn().click();
		wait.until(ExpectedConditions.visibilityOf(pf.getEmail()));
		WebElement email = pf.getEmail();
		email.sendKeys(objmap.getConfig("email"));
		WebElement pass = pf.getPass();
		pass.sendKeys(objmap.getConfig("pass"));
		pass.submit();

		
	}
}
