package com.wildriver.pageObjects.StockMGR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.wildriver.Libraries.SuperTestNG;

public class StockMGRPage extends SuperTestNG
{
	public static WebElement txtbx_Category()
	{
		WebElement element = driver.findElement(By.id("ProductCategory"));
		return element;
	}
	public static WebElement txtbx_ProductGroup()
	{
		WebElement element = driver.findElement(By.id("ProductProductGroup"));
		return element;
	}
	public static WebElement txtbx_StockCode()
	{
		WebElement element = driver.findElement(By.id("ProductStockCode"));
		return element;
	}
	public static WebElement txtbx_ProductName()
	{
		WebElement element = driver.findElement(By.id("ProductProductName"));
		return element;
	}
	public static WebElement txtbx_Grade()
	{
		WebElement element = driver.findElement(By.id("ProductGrade"));
		return element;
	}
	public static WebElement txtbx_Fill()
	{
		WebElement element = driver.findElement(By.id("ProductFill"));
		return element;
	}
	public static WebElement txtbx_PackWeight()
	{
		WebElement element = driver.findElement(By.id("ProductPackWeight"));
		return element;
	}
	public static WebElement txtbx_MinimumStockLevel()
	{
		WebElement element = driver.findElement(By.id("ProductMinStockLevel"));
		return element;
	}
	public static WebElement txtbx_QuantityPerPallet()
	{
		WebElement element = driver.findElement(By.id("ProductPalletQty"));
		return element;
	}
	public static WebElement txtbx_UnitOfMeasure()
	{
		WebElement element = driver.findElement(By.id("ProductUnitOfMeasure"));
		return element;
	}
	public static WebElement txtbx_OrderWindow()
	{
		WebElement element = driver.findElement(By.id("ProductOrderWindow"));
		return element;
	}
}

