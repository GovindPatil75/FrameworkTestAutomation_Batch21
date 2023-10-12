package com.LoginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom_Avanti;
import com.Utility.BaseClass;
import com.Utility.Library;

public class VerifyLogin_Avanti extends BaseClass{
	
	@Test
	public void verifyLogin() {

	LoginPom_Avanti login = PageFactory.initElements(driver,LoginPom_Avanti.class);
	
	String email_testData = excel.getStringTestData_Excel("LoginTestData", 1, 0);
	String pass_testData = excel.getStringTestData_Excel("LoginTestData", 1, 1);
	
	Library.custom_Sendkeys(login.getEmail(),email_testData );
	Library.custom_Sendkeys(login.getPass(), pass_testData);
	Library.custom_click(login.getLoginbtn());
	
  }
}
