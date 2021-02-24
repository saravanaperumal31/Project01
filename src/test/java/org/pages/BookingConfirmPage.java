package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmPage extends BaseClass {

	public BookingConfirmPage() {
	  PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@class='disable_text'])[15]")
	private WebElement txtvalue;

	public WebElement getTxtvalue() {
		return txtvalue;
	}
}
