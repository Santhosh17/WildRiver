package com.wildriver.pageObjects.AdminMGR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.wildriver.Libraries.SuperTestNG;
import com.wildriver.pageObjects.GeneralElements.GeneralElements;


public class AdminMGRPage extends SuperTestNG
{
	public static WebElement txtbx_Name()
	{
		WebElement element = driver.findElement(By.id("UserUserName"));
		return element;
	}
	public static WebElement txtbx_EmailAddress()
	{
		WebElement element = driver.findElement(By.id("UserEmailAddress"));
		return element;
	}
	public static WebElement txtbx_Password()
	{
		WebElement element = driver.findElement(By.id("password"));
		return element;
	}
	public static WebElement txtbx_PasswordAgain()
	{
		WebElement element = driver.findElement(By.id("UserPasswordAgain"));
		return element;
	}
	public static WebElement chkbx_FullUsage()
	{
		WebElement element = driver.findElement(By.id("UserAccessLevels1"));
		return element;
	}
	public static WebElement chkbx_DealerManager()
	{
		WebElement element = driver.findElement(By.id("UserAccessLevels2"));
		return element;
	}
	public static WebElement chkbx_POManager()
	{
		WebElement element = driver.findElement(By.id("UserAccessLevels3"));
		return element;
	}
	public static WebElement chkbx_StockManager()
	{
		WebElement element = driver.findElement(By.id("UserAccessLevels4"));
		return element;
	}
	public static WebElement chkbx_AdminRights()
	{
		WebElement element = driver.findElement(By.id("UserAccessLevels5"));
		return element;
	}
	

	
}
