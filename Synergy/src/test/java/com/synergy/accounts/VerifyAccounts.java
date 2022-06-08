package com.synergy.accounts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.synergy.genericlib.BaseTest;
import com.synergy.genericlib.WebDriverCommonLib;
import com.synergy.home.LoginTest;
import com.synergy.pages.AccountsPage;
import com.synergy.pages.HomePage;

@Listeners(com.synergy.genericlib.MyListeners.class)
public class VerifyAccounts extends BaseTest{

	@Test
	public void verifyAccountsTest() throws Throwable
	{
		LoginTest lt=new LoginTest();
		lt.login();
		
		HomePage hp=new HomePage();
		hp.clickAccountsTab();
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		AccountsPage ap=new AccountsPage();
		wlib.elementDisplayed(ap.getAccountsAddress(), "ACCOUNTS TEXT");
				
	}
}
