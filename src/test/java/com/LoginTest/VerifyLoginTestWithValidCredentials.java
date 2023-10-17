package com.LoginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class VerifyLoginTestWithValidCredentials extends BaseClass{

	
	@Test
	public void TC_LoginTest_1_VerifyLoginTestWithValidCrdentials() {
		
		LoginPom Login=PageFactory.initElements(driver, LoginPom.class);
		
		String EmailTestData=excel.getStringTestData_Excel("W3LoginTest", 0, 0);
		String PasswordTestData=excel.getStringTestData_Excel("W3LoginTest", 0, 1);
		
		//String DataExample=excel.getNumericTestData_Excel("LoginTestData", 0, 0);
		
		Library.custom_Sendkeys(Login.getTxt_email(), EmailTestData, "Email");
		Library.custom_Sendkeys(Login.getTxt_password(), PasswordTestData,"Password");
		Library.custom_click(Login.getBtn_Login(),"Login Button");
		
		/*
		Library.handleAlert(driver).accept();
		Library.handleAlert(driver).dismiss();
		Library.handleAlert(driver).getText();
		Library.handle_DropDown(Login.getTxt_password(), "Text");
		*/
		
		String ActualTitle =driver.getTitle();
		String ExpectedTitle="FaceBook Homepage";
		
		Library.VerifyWithAssert(ActualTitle, ExpectedTitle);
		//Verify
		//Assert.assertEquals(ActualTitle, ExpectedTitle);
		
	}
	
	@Test
	public void m1() {
		System.out.println("Test M1");
	}
}
