package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedBussLogin extends BaseClass {
 
	public RedBussLogin() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="i-icon-profile")
	private WebElement btnsignin;
	
	@FindBy(id="signInLink")
	private WebElement clkSignup;
	
	@FindBy(xpath="(//span[text()='Sign in with Google'])[1]")
	private WebElement clkGoogle;

	public WebElement getClkGoogle() {
		return clkGoogle;
	}

	public WebElement getBtnsignin() {
		return btnsignin;
	}

	public WebElement getClkSignup() {
		return clkSignup;
	}
	
	
	
	
}
