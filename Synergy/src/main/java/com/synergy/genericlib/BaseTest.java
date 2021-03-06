package com.synergy.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


//I am present in local are you able to see me in global???
public class BaseTest implements IAutoConsts{

	public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws Throwable
	{
		FileLib flib=new FileLib();
		String browserName = flib.readPropertyData(PROP_PATH, "browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
		}
		else
		{
			Reporter.log("PLease enter correct browser name",true);
		}
		
		driver.manage().window().maximize();
		String appUrl = flib.readPropertyData(PROP_PATH, "url");
		driver.get(appUrl);
		
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verify(wlib.getPageTitle(),
				flib.readPropertyData(PROP_PATH, "loginTitle"),
				"SIGNIN PAGE");
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
