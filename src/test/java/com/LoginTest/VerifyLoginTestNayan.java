package com.LoginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.LoginPom_Nayan;
import com.Utility.BaseClass;
import com.Utility.Library;

public class VerifyLoginTestNayan extends BaseClass {

	@Test
	public void TC_LoginTest_1_VerifyLoginTestWithValidCrdentials() {
		
		LoginPom_Nayan Login=PageFactory.initElements(driver, LoginPom_Nayan.class);
		
		String EmailTestData=excel.getStringTestData_Excel("LoginTestData", 0, 0);
		String PasswordTestData=excel.getStringTestData_Excel("LoginTestData", 0, 1);
		
		//String DataExample=excel.getNumericTestData_Excel("LoginTestData", 3, 1);
		
		Library.custom_Sendkeys(Login.getTxt_username(), EmailTestData);
		Library.custom_Sendkeys(Login.getTxt_password(), PasswordTestData);
		Library.custom_click(Login.getBtn_submit());
		
		
		
		String ActualTitle =driver.getTitle();
		String ExpectedTitle="Logged In Successfully";
		
		//Verify
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
	}
}
