package com.extentreportAmazon;

import java.io.File;
import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendsReport {
	
	int a;//decla
	private ExtentHtmlReporter htmlreporter;

	protected ExtentReports extent;
	protected ExtentTest test;

	@BeforeTest
	public void beforesuit() {
		a=10;
		htmlreporter = new ExtentHtmlReporter(new File(System.getProperty("user.dir") + "./target/ExtendsTestNGReport.html"));
		htmlreporter.loadXMLConfig(new File(System.getProperty("user.dir") + "./extent-config.xml"),true);

		extent = new ExtentReports();
		extent.setSystemInfo("Testing environment ", "QA");
		extent.attachReporter(htmlreporter);

	}

	@BeforeMethod
	public void beforemethod(Method method) {

		String testName = method.getName();
		test = extent.createTest(testName);

	}

	@AfterMethod
	public void aftermethod(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {
			test.fail(MarkupHelper.createLabel(result.getName() + "Test Failed", ExtentColor.RED));
			test.log(Status.FAIL, "The test status::" + result.getStatus() + ":: Test FAIL");
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.pass(MarkupHelper.createLabel(result.getName() + "Test Failed", ExtentColor.GREEN));
			test.log(Status.PASS, "The test status::" + result.getStatus() + ":: Test Passed");

		} else {
			test.skip(MarkupHelper.createLabel(result.getName() + "Test Failed", ExtentColor.YELLOW));
			test.skip(result.getThrowable());
			test.log(Status.SKIP, "The test status::" + result.getStatus() + ":: Test SKIP");

		}

	}

	@AfterTest
	public void sfterSuite() {
		extent.flush();

	}

}
