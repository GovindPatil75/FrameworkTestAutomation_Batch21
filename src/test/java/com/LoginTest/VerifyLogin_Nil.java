package com.LoginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.LoginPom_Nil;
import com.Utility.BaseClass;
import com.Utility.Library;

public class VerifyLogin_Nil extends BaseClass {

	@Test
	public void TC_LoginTest_001_For_Guru99() {
		
		LoginPom_Nil Login=PageFactory.initElements(driver, LoginPom_Nil.class);
		
		String UIDTestData=excel.getStringTestData_Excel("LoginTestData", 3, 0);
		String PasswordTestData=excel.getStringTestData_Excel("LoginTestData", 3, 1);

		Library.custom_Sendkeys(Login.getTxt_UID(), UIDTestData);
		Library.custom_Sendkeys(Login.getTxt_password(), PasswordTestData);
		Library.custom_click(Login.getBtn_Login());
		
		String ActualTitle =driver.getTitle();
		String ExpectedTitle="Guru99 Bank Manager HomePage";

		//Verify
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
	}
}


