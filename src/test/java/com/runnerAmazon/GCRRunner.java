package com.runnerAmazon;

import java.io.File;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;



	
	@CucumberOptions(
			plugin= {"pretty","html:target/cucumber-reports", "json:target/cucumber.json"},

			snippets=SnippetType.CAMELCASE,
			
	       features = "src/main/resources/GCRLoginOutLine.feature",
	        glue={"com.stepdef.amazon.tv"},// stepdef code location package name
	        	tags= {"@TC_002"},
					monochrome=true
				,strict=true
					,dryRun=false
					)

	 
	public class GCRRunner  extends AbstractTestNGCucumberTests { 
		
	}
