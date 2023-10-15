package com.Utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

public class Library {
	
	public static ExtentTest test;

	 //SendKeys
	public static void custom_Sendkeys(WebElement element,String Value) {
		try {
		   element.sendKeys(Value);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//Click
	public static void custom_click(WebElement element) {
		try {
		   element.click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//DropDown
	public static void handle_DropDown(WebElement element,String text) {
		try {
		  Select select=new Select(element);
		  select.selectByVisibleText(text);
		 }catch(Exception e) {
			 System.out.println(e.getMessage());
		 }		
	}
	
	// Alert Handle
	public static Alert handleAlert(WebDriver driver) {
		
		return driver.switchTo().alert();
	}
}
