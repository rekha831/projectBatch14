package com.orghrm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orghrm.qa.base.PageBase;
import com.orghrm.qa.generic.GenericMethods;

public class SpiceShuttle extends PageBase {

	public SpiceShuttle() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[contains(text(),'SpiceShuttle')]")
	WebElement spiceSutTab;
	
	@FindBy(xpath="//a[contains(text(),'DESTINATION EXPERIENCES')]")
	WebElement spiceSutTabText;
	
	public void spiceShuttleTab() {
		spiceSutTab.click();
		GenericMethods genMethods=PageFactory.initElements(driver, GenericMethods.class);
	}

	

}
