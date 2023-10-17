package com.Utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	public static ExtentTest test;

	 //SendKeys
	public static void custom_Sendkeys(WebElement element,String Value,String FieldName) {
		try {
		   element.sendKeys(Value);
		   test.log(Status.PASS, FieldName+"==Value Succefully Send =="+Value);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
		
		}
	}
	
	//Click
	public static void custom_click(WebElement element,String filedname) {
		try {
		   element.click();
		   test.log(Status.PASS, "Clicked Succefully !!!!"+filedname);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
			
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
	
	public static void VerifyWithAssert(String Actual,String Expected) {
		try {
		   Assert.assertEquals(Actual, Expected);
		   test.log(Status.PASS, Actual+"==is match with =="+Expected);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
		}
	}
}
