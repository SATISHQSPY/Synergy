package com.synergy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.synergy.genericlib.BaseTest;

public class AccountsPage {
@FindBy(xpath = "//td[contains(text(),'Accounts: ')]") private WebElement accountsText;
	
	public AccountsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getAccountsAddress()
	{
		return accountsText;
	}
	
	
	public String getAccountsText()
	{
		return accountsText.getText();
	}
	
}
