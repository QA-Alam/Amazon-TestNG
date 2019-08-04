package com.generic.code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	//public static void main(String[] args) {
	
	public static WebDriver login(){   
		
	

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting
		driver.manage().window().maximize(); //
		driver.get("https://www.amazon.com/");
		// implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()='Hello, Sign in']"))));

		driver.findElement(By.xpath("//*[text()='Hello, Sign in']")).click();

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='ap_email']"))));

		WebElement email = driver.findElement(By.xpath("//*[@id='ap_email']"));

		email.sendKeys("studentttech@gmail.com");
		
		//email.clear();


		WebElement pass = driver.findElement(By.xpath("//*[@id='ap_password']"));

		pass.sendKeys("student123");

		pass.submit();

		// driver.close();
		driver.quit();
		
		
		return driver;
	}
}	
		
		
		
		
		
		
		
		
		

		/*
		 * String workingDir = System.getProperty("user.dir"); ObjectMap objmap= new
		 * ObjectMap(workingDir + "./Configuration/config.property");
		 * 
		 * driver.get(objmap.getConfig("URL")); driver.manage().window().maximize();
		 */


