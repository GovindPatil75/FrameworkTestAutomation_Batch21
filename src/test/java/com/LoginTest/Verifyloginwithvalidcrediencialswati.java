package com.LoginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.PageObject.Login_swati;
import com.Utility.BaseClass.baseclassswati;
import com.Utility.Library;

	public class Verifyloginwithvalidcrediencialswati extends baseclassswati{

		
		@Test
		public void TC_LoginTest_1_VerifyLoginTestWithValidCrdentials() {
			
			 Login_swati Login=PageFactory.initElements(driver, Login_swati.class);
			
			String EmailTestData=excel.getStringTestData_Excel("W3LoginTest", 0, 0);
			String PasswordTestData=excel.getStringTestData_Excel("W3LoginTest", 0, 1);
			
			//String DataExample=excel.getNumericTestData_Excel("LoginTestData", 0, 0);
			
			//Library.custom_Sendkeys(Login.getTxt_email(), EmailTestData);
			//Library.custom_Sendkeys(Login.getTxt_password(), PasswordTestData);
			//Library.custom_click(Login.getBtn_Login());
			
			/*
			Library.handleAlert(driver).accept();
			Library.handleAlert(driver).dismiss();
			Library.handleAlert(driver).getText();
			Library.handle_DropDown(Login.getTxt_password(), "Text");
			*/
			
			String ActualTitle =driver.getTitle();
			String ExpectedTitle="Log in - W3Schools";
			
			//Verify
			Assert.assertEquals(ActualTitle, ExpectedTitle);
			
		}
	}


