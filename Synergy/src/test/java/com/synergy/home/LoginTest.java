package com.synergy.home;

import com.synergy.genericlib.BaseTest;
import com.synergy.genericlib.FileLib;
import com.synergy.genericlib.WebDriverCommonLib;
import com.synergy.pages.SigninPage;

public class LoginTest extends BaseTest{

	public void login() throws Throwable {
		SigninPage sp=new SigninPage();
		FileLib flib=new FileLib();
		String un = flib.readPropertyData(PROP_PATH, "username");
		String pwd = flib.readPropertyData(PROP_PATH, "password");
		sp.signIn(un, pwd);
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verify(wlib.getPageTitle(),
				flib.readPropertyData(PROP_PATH, "homeTitle"),
				"HOME PAGE");
	}
}
