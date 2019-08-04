package com.runnerAmazon;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {"pretty", "html:target","json:target/cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/Extents_report.html"},
			
	    features = {"src/main/resources/AmazonTv.feature"},
	    glue = {"com.stepdef.amazon.tv"},
	    monochrome=true
	   // tags= {"@regression"}
	    
	)

public class AmazonRunner extends AbstractTestNGCucumberTests {
	
	  @AfterTest
	    public static void teardown() throws Throwable {
	        Reporter.loadXMLConfig(new File("./CucumberExtentReport.xml"));
	        Reporter.setSystemInfo("user", System.getProperty("user.name"));
	        Reporter.setSystemInfo("OS", "Window 10");
	        Reporter.setTestRunnerOutput("Sample test runner output message");

}
}
