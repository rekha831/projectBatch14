package com.orhrm.qa.test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.orghrm.qa.pages.SpiceShuttlePage;

public class SpiceShuttlePageTest extends TestBase{

	public SpiceShuttlePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void spiceShuttle() {
		SpiceShuttlePage spi=PageFactory.initElements(driver,SpiceShuttlePage.class);
		String shuttleHomeText=spi.spiceShuttle();
		Assert.assertEquals(shuttleHomeText, "DESTINATION EXPERIENCES","shuttleHomeText not matching");
		Reporter.log("shuttleHomeText verified succesfully");
	}

}
