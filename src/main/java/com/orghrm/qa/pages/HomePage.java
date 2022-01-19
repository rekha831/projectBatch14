package com.orghrm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orghrm.qa.base.PageBase;

public class HomePage extends PageBase {

	@FindBy(xpath="(//span[contains(text(),'rekha ram')])[2]")
	WebElement homePageText;
	
	public HomePage() throws IOException {
	PageFactory.initElements(driver, this);
	
	// TODO Auto-generated constructor stub
}
	
	public void homePageTitle() {
		String title=driver.getTitle();
		System.out.println("The title is"+title);
		String textOnHomePage=homePageText.getText();
		System.out.println("The text on HomePage"+textOnHomePage);
	}

}
