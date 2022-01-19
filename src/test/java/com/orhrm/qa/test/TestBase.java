package com.orhrm.qa.test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.orghrm.qa.base.PageBase;
import com.orghrm.qa.pages.LoGinLogOut;

public class TestBase extends PageBase {
	LoGinLogOut loglog;
	public TestBase() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setUp() throws IOException, InterruptedException{
		String browserName=prop.getProperty("browser");
	
		System.out.println("the browser is"+browserName);
		String url=prop.getProperty("url");
		initialiZation(browserName,url);
		LoGinLogOut login=PageFactory.initElements(driver, LoGinLogOut.class);
		//loglog = new LoGinLogOut();
		String userid=prop.getProperty("userid");
		String password=prop.getProperty("pwd");
		login.Login(userid,password);
		
		

		
		Thread.sleep(1000);
		//("Admin", "admin123");
		
		
	}
	@AfterMethod
	public void tearDown() throws IOException{
		LoGinLogOut login=PageFactory.initElements(driver, LoGinLogOut.class);
		login.LogOut();
		driver.quit();
	}
}
