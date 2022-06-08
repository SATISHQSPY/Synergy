package com.synergy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.synergy.genericlib.BaseTest;

public class CampaginPage {
		@FindBy(xpath = "[id='Campaignstab']") private WebElement CampaignText;
			
			public CampaginPage()
			{
				PageFactory.initElements(BaseTest.driver, this);
			}
			
			public WebElement getCampaignAddress()
			{
				return CampaignText;
			}
			
			
			public String getCampaginText()
			{
				return CampaignText.getText();
			}
			
		}



