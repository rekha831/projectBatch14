package com.orghrm.qa.pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orghrm.qa.base.PageBase;

public class SpiceShuttlePage extends PageBase {

	public SpiceShuttlePage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[contains(text(),'SpiceShuttle')]")
	WebElement spiceshuttleTab;

	@FindBy(xpath = "//a[text()='DESTINATION EXPERIENCES']")
	WebElement spiceShuttleHomePage;

	public String spiceShuttle() {
		spiceshuttleTab.click();

		Set<String> handles = driver.getWindowHandles();

		String parentWindow = driver.getWindowHandle();
		System.out.println("parent" + parentWindow);

		Iterator<String> itr = handles.iterator();
		String parent = itr.next();
		String childWindow = itr.next();
		driver.switchTo().window(childWindow);
		System.out.println("child" + childWindow);
		System.out.println("switched to child window successfully");
		String spiceShuttleHomePageText = spiceShuttleHomePage.getText();
		driver.switchTo().window(parent);
		return spiceShuttleHomePageText;
	}

}
