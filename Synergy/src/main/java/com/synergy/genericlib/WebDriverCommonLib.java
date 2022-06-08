package com.synergy.genericlib;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.io.Files;

public class WebDriverCommonLib {

	public String getPageTitle()
	{
		return BaseTest.driver.getTitle();
	}
	
	public void verify(String actual, String expected, String pageName)
	{
		Assert.assertEquals(actual, expected);
		Reporter.log(pageName+" is Displayed, PASS",true);
	}
	
	
	public void mouseHover(WebElement element)
	{
		Actions ac=new Actions(BaseTest.driver);
		ac.moveToElement(element).perform();
	}
	
	public void dragDrop(WebElement srcElement, WebElement destElement)
	{
		Actions ac=new Actions(BaseTest.driver);
		ac.dragAndDrop(srcElement, destElement).perform();
	}
	
	public void doubleClick(WebElement element)
	{
		Actions ac=new Actions(BaseTest.driver);
		ac.doubleClick(element).perform();
	}
	
	public void rightClick(WebElement element)
	{
		Actions ac=new Actions(BaseTest.driver);
		ac.contextClick(element).perform();
	}
	
	public void selectOption(WebElement element, int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	public void selectOption(WebElement element, String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public void selectOption(String text, WebElement element)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
	
	public void switchToFrame(int index)
	{
		BaseTest.driver.switchTo().frame(index);
	}
	
	public void switchToFrame(String value)
	{
		BaseTest.driver.switchTo().frame(value);
	}
	
	public void switchToFrame(WebElement element)
	{
		BaseTest.driver.switchTo().frame(element);
	}
	
	public void elementDisplayed(WebElement element, String elementName)
	{
		if(element.isDisplayed())
		{
			Assert.assertTrue(true);
			Reporter.log(elementName+" is Displayed,PASS",true);
		}
		else
		{
			Reporter.log(elementName+" is not Displayed,FAIL",true);
			Assert.assertTrue(false);
		}
	}
	
	
	
	public void waitForPageTitle(String title)
	{
		WebDriverWait wait=new WebDriverWait(BaseTest.driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	
	
	
	public void getFullScreenshot(String path)
	{
		TakesScreenshot ts = (TakesScreenshot)BaseTest.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
