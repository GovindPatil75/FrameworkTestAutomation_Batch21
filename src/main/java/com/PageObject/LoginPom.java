package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement txt_email;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement txt_password;
	
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement Btn_Login;
	
	//getter

	public WebElement getTxt_email() {
		return txt_email;
	}

	
	public WebElement getTxt_password() {
		return txt_password;
	}


	public WebElement getBtn_Login() {
		return Btn_Login;
	}

}
