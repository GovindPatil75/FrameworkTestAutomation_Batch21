package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom_Nil {
	
	@FindBy(how=How.XPATH,using="//input[@name='uid']")
	private WebElement txt_UID;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	private WebElement txt_password;
	
	@FindBy(how=How.XPATH,using="//input[@name='btnLogin']")
	private WebElement Login_BTN;
	
	//getter

	public WebElement getTxt_UID() {
		return txt_UID;
	}

	
	public WebElement getTxt_password() {
		return txt_password;
	}


	public WebElement getBtn_Login() {
		return Login_BTN;
	}

}


