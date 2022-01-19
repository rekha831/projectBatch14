package com.orghrm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orghrm.qa.base.PageBase;

public class LoGinLogOut extends PageBase {


	
	//Pagefactory
	
	@FindBy(id="ControlGroupLoginView_MemberLoginView2LoginView_TextBoxUserID")
	WebElement userid;

	
	@FindBy(id="ControlGroupLoginView_MemberLoginView2LoginView_PasswordFieldPassword")
	WebElement pwd;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submitButton;
	
	@FindBy(id="Login")
	WebElement logoutBtn;
	
	public LoGinLogOut() throws IOException {
		PageFactory.initElements(driver, this);
		//super();
		// TODO Auto-generated constructor stub
	}
	
	public void Login(String useridIs,String password) {
		userid.sendKeys(useridIs);
		pwd.sendKeys(password);
		submitButton.click();
		
	}
	public void LogOut() {
		logoutBtn.click();
		
	}

}
