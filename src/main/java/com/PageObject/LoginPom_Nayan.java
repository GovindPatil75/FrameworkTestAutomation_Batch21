package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom_Nayan {
	
	@FindBy(how=How.XPATH,using="//input[@type='text']")
	private WebElement txt_username;
	
	@FindBy(how=How.XPATH,using="//input[@type='password']")
	private WebElement txt_password;
	
	@FindBy(how=How.XPATH,using="//button[@id='submit']")
	private WebElement Btn_submit;
	
	//getter

	public WebElement getTxt_username() {
		return txt_username;
	}

	
	public WebElement getTxt_password() {
		return txt_password;
	}


	public WebElement getBtn_submit() {
		return Btn_submit;
	}


}
