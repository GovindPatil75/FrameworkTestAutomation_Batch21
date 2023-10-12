package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom_Avanti {
	
	@FindBy (how=How.XPATH,using="//input[@id='email']") private WebElement email;
	@FindBy (how=How.XPATH,using="//input[@id='pass']") private WebElement pass;
	@FindBy (how=How.XPATH,using="//button[@name='login']") private WebElement loginbtn;
	
	//getter methods
	
	public WebElement getEmail() {
		return email;
	}
	
	public WebElement getPass() {
		return pass;
	}
	
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
	

}
