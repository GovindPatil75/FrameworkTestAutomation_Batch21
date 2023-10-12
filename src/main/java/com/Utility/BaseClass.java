package com.Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static ExcelDataProvider excel;
	
	@BeforeSuite
	public void ObjectInit() throws IOException {
		 excel=new ExcelDataProvider();
	}
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit(); // close All Open Windows 
	}
}
