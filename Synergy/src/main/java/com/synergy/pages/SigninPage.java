package com.synergy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.synergy.genericlib.BaseTest;

public class SigninPage {

	@FindBy(id="userName") private WebElement usernameTextbox;
	
	@FindBy(id="passWord") private WebElement passwordTextbox;
	
	@FindBy(xpath = "//input[@title='Sign In']") private WebElement signinButton;
	
	
	public SigninPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	//Return Address
	public WebElement getUsernameTextbox() {
		return usernameTextbox;
	}


	public WebElement getPasswordTextbox() {
		return passwordTextbox;
	}


	public WebElement getSigninButton() {
		return signinButton;
	}
	
	
	//Perform Actions
	public void typeUsername(String un)
	{
		usernameTextbox.sendKeys(un);
	}

	public void typePassword(String pwd)
	{
		passwordTextbox.sendKeys(pwd);
	}

	public void clickSigninButton()
	{
		signinButton.click();
	}

	
	
	
	public void signIn(String un, String pwd)
	{
		
		usernameTextbox.sendKeys(un);
		passwordTextbox.sendKeys(pwd);
		signinButton.click();
	}
	
	
}










