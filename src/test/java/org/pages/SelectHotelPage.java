package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass {

	public SelectHotelPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement btnradio;
	
	@FindBy(id="continue")
	private WebElement btnConti;

	public WebElement getBtnradio() {
		return btnradio;
	}

	public WebElement getBtnConti() {
		return btnConti;
	}
	
}
