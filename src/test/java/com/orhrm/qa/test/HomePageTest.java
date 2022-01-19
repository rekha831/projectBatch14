package com.orhrm.qa.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.orghrm.qa.pages.HomePage;
import com.orghrm.qa.pages.SpiceShuttle;
import com.orghrm.qa.pages.SpiceShuttlePage;

public class HomePageTest extends TestBase {


	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void homePageTest() throws IOException {
		HomePage hme = PageFactory.initElements(driver, HomePage.class);
		hme.homePageTitle();
		System.out.println();
	}	
	@Test
	public void spiceShuttle() {
		SpiceShuttlePage spi=PageFactory.initElements(driver,SpiceShuttlePage.class);
		String shuttleHomeText=spi.spiceShuttle();
		Assert.assertEquals(shuttleHomeText, "DESTINATION EXPERIENCES","shuttleHomeText not matching");
		Reporter.log("shuttleHomeText verified succesfully");
	}



}
