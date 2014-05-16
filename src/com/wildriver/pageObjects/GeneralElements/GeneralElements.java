package com.wildriver.pageObjects.GeneralElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.wildriver.Libraries.SuperTestNG;

public class GeneralElements extends SuperTestNG
{
	public static WebElement btn_AdminMGR()
	{
		WebElement element = driver.findElement(By.linkText("ADMIN MGR"));
		return element;
	}
	public static WebElement btn_StockMGR()
	{
		WebElement element = driver.findElement(By.linkText("STOCK MGR"));
		return element;
	}
	public static WebElement btn_POMGR()
	{
		WebElement element = driver.findElement(By.linkText("P/O MGR"));
		return element;
	}
	public static WebElement btn_DealerMGR()
	{
		WebElement element = driver.findElement(By.linkText("DEALER MGR"));
		return element;
	}
	public static WebElement btn_DealerOrder()
	{
		WebElement element = driver.findElement(By.linkText("DEALER ORDERS"));
		return element;
	}
}
