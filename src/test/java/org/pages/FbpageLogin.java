package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbpageLogin extends BaseClass{
	public FbpageLogin() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="email")
	private WebElement txtuserName;
	@FindBy(id="pass")
	private WebElement txtpassWord;
	public WebElement getTxtuserName() {
		return txtuserName;
	}
	public WebElement getTxtpassWord() {
		return txtpassWord;
	}
	
	
	
}
