package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_swati {
	
	@FindBy(how=How.XPATH,using="//input[@id='modalusername']")
	private WebElement txt_email;
	
	@FindBy(how=How.XPATH,using="//input[@id='current-password']")
	private WebElement txt_password;
	
	@FindBy(how=How.XPATH,using="//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']")
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
