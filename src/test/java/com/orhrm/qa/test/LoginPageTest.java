package com.orhrm.qa.test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orghrm.qa.base.PageBase;
import com.orghrm.qa.pages.LoGinLogOut;

public class LoginPageTest extends PageBase {

	LoGinLogOut loglog;

	public LoginPageTest() throws IOException {
		super();
		
	}
	
	@BeforeClass
	public void setUp() throws IOException, InterruptedException{
		String browserName=prop.getProperty("browser");
	
		System.out.println("the browser is"+browserName);
		String url=prop.getProperty("url");
		initialiZation(browserName,url);
		loglog = new LoGinLogOut();
		String userid=prop.getProperty("userid");
		String password=prop.getProperty("pwd");
		loglog.Login(userid,password);

		
		Thread.sleep(1000);
		//("Admin", "admin123");
		
		
	}
	@Test()
	public void Test1() {
		
		LoGinLogOut loginPage=PageFactory.initElements(driver, LoGinLogOut.class);
		loginPage.Login("rekhakathayat94@gmail.com", "Rekha@2407");
		
		System.out.println("..........this is first Test........");
	}
	
	@AfterClass
	public void tearDown() throws IOException{
		loglog = new LoGinLogOut();
		loglog.LogOut();
		driver.quit();
	}
}
