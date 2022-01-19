package com.orghrm.qa.util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotUtil{
	
	 public static WebDriver driver;
	 
	 public void screenshotOnFailere(String methName) {
		 // Create refernce of TakesScreenshot
			TakesScreenshot ts=(TakesScreenshot)driver;
			 
			// Call method to capture screenshot
			File source=ts.getScreenshotAs(OutputType.FILE);
			try {
				FileHandler.copy(source, new File("./screenshots/"+"failure_"+methName+""+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
	
	

}
