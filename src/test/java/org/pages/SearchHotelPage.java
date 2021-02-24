package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass{

	public SearchHotelPage() {
		PageFactory.initElements(driver,this);	
	}
	
	@FindBy(id="location")
	private WebElement drpLoc;
	
	@FindBy(id="hotels")
	private WebElement drphotel;
	
	@FindBy(id="room_type")
	private WebElement drproomType;
	
	@FindBy(id="room_nos")
	private WebElement drproomNo;
	
	@FindBy(id="adult_room")
	private WebElement drpadtRoom;
	
	@FindBy(id="child_room")
	private WebElement drpChlRoom;
	
	@FindBy(id="Submit")
	private WebElement btnSearch;
	
	
	
	public WebElement getDrproomType() {
		return drproomType;
	}

	public WebElement getDrproomNo() {
		return drproomNo;
	}

	public WebElement getDrpadtRoom() {
		return drpadtRoom;
	}

	public WebElement getDrpChlRoom() {
		return drpChlRoom;
	}

	public WebElement getDrpLoc() {
		return drpLoc;
	}

	public WebElement getDrphotel() {
		return drphotel;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
}
	

