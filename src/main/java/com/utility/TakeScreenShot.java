package com.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShot {
	
public static String captureScreenShot(WebDriver driver, String ScreenShotName) {
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		Date date = new Date();
	  String dateTime = dateFormat.format(date.getTime());
		//String destination=".//RCO_Regression/Screenshot"+ScreenShotName+"-"+dateTime+".png";
		String destination=currentDir +"//Screen Shot//"+dateTime+"//" +ScreenShotName + ".png";
		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Screen shot taken");
		
		return destination;
	
	      }
}