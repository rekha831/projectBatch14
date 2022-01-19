package com.orghrm.qa.generic;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.orghrm.qa.base.PageBase;

public class GenericMethods extends PageBase{
	public static WebDriver driver;

	public GenericMethods() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Explicit wait
	
	 public static void WaitForElementPresent1(WebElement element, int time) throws Exception {
			
			
			WebDriverWait newWait = new WebDriverWait(driver, time);
			newWait.until(ExpectedConditions.visibilityOf(element));
			
			
		}
	//Verify Title
	public void verifyTitle(String etitle,int time)
    {
           try{
                 WebDriverWait Wait = new WebDriverWait(driver,200);
         Wait.until(ExpectedConditions.titleIs(etitle));
         Reporter.log("title is matching: "+etitle,true);
           
              }
           catch(Exception e){
                 Reporter.log("title is not matching; Expected title is  "+etitle,true);
                 Assert.fail();
    
           }
    }

    
    public void selectByText(WebElement element,String text)
    {
    	Select sel=new Select(element);
    	sel.selectByVisibleText(text);
    }
    
   


}
