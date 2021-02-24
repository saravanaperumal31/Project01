package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass {

	public BookHotelPage() {
		PageFactory.initElements(driver,this);
	}
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCcNum() {
		return txtCcNum;
	}

	public WebElement getDrpCctype() {
		return drpCctype;
	}

	public WebElement getDrpExpMnth() {
		return drpExpMnth;
	}

	public WebElement getDrpExpYr() {
		return drpExpYr;
		
	}
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCcNum;
	
	@FindBy(id="cc_type")
	private WebElement drpCctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement drpExpMnth;
	
	@FindBy(id="cc_exp_year")
	private WebElement drpExpYr;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCvv;
	
	@FindBy(id="book_now")
	private WebElement btnBook;
	
	public WebElement getBtnBook() {
		return btnBook;
	}
	public WebElement getTxtCvv() {
		return txtCvv;
	}
	
	
}
