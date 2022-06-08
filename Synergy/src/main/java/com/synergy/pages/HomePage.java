package com.synergy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.synergy.genericlib.BaseTest;

public class HomePage {

	@FindBy(xpath = "//a[text()='Leads']") private WebElement leadsTab;
	@FindBy(xpath = "//a[text()='Accounts']") private WebElement accountsTab;
	@FindBy(xpath = "//a[text()='Campaigns']") private WebElement campaignTab;
	
	public HomePage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	
	public WebElement getAccountsTab()
	{
		return accountsTab;
	}
	
	public void clickAccountsTab()
	{
		accountsTab.click();
	}
	
	
	public WebElement getLeadsTab()
	{
		return leadsTab;
	}
	
	public void clickLeadsTab()
	{
		leadsTab.click();
	}
	
	
	public WebElement getCampaignTab()
	{
		return campaignTab;
	}
	
	public void clickCampaignTab()
	{
		campaignTab.click();
	}
	
	
	
	
	
	
	
}
