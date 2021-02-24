package org.crossbrowsertesting;
import java.io.IOException;
import java.util.Date;
import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.pages.BookHotelPage;
import org.pages.BookingConfirmPage;
import org.pages.LoginPage;
import org.pages.SearchHotelPage;
import org.pages.SelectHotelPage;
import org.testng.annotations.*;
public class SampleTask212 extends BaseClass {
BaseClass b=new BaseClass();	
	@BeforeClass
	private void beforeClass() {
		System.out.println("before class");
	}		
	@AfterClass
	private void afterClass(){
		System.out.println("afterclass");
		quitwindow();}
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before Methods");
		System.out.println("Start test "+new Date());}
	@AfterMethod
	private void afterMethod() {
		System.out.println("After Methods");
		System.out.println("End test "+new Date());}	
	@Parameters({"browser"})
	@Test
	private void test1(String browser) throws IOException {{
		if(browser.equalsIgnoreCase("chrome")) {
			browserChromeLaunch();}
		else if(browser.equalsIgnoreCase("firefox")){
			browserFirefoxLaunch();}
		else if(browser.equalsIgnoreCase("edge")) {
			browserManager();
		}
		else {
			System.out.println("invalid browser");}}	
		urlLaunch("http://adactinhotelapp.com/");
			windowMaximize();
			implicitWait(10);
			LoginPage l=new LoginPage();
			filltext(l.getTxtUsername(),"SaravanaPerumal");
			filltext(l.getTxtpassword(),"Saravana@31");
			buttonClick(l.getBtnLogin());
			SearchHotelPage s=new SearchHotelPage();
			selectByVisibleText(s.getDrpLoc(),"London");
			selectByVisibleText(s.getDrphotel(),"Hotel Hervey");
			selectByVisibleText(s.getDrproomType(), "Deluxe");
			selectByVisibleText(s.getDrproomNo(),"2 - Two");
			selectByVisibleText(s.getDrpadtRoom(),"2 - Two");
			selectByVisibleText(s.getDrpChlRoom(),"0 - None");
			buttonClick(s.getBtnSearch());
			SelectHotelPage sh=new SelectHotelPage();
			buttonClick(sh.getBtnradio());
			buttonClick(sh.getBtnConti());
			BookHotelPage b= new BookHotelPage();
			filltext(b.getTxtFirstName(),"ram");
			filltext(b.getTxtLastName(),"sai");
			filltext(b.getTxtAddress(),"cherry street");
			filltext(b.getTxtCcNum(),"1236457849098370");
			selectByVisibleText(b.getDrpCctype(),"VISA");
			selectByVisibleText(b.getDrpExpMnth(),"February");
			selectByVisibleText(b.getDrpExpYr(), "2022");
			filltext(b.getTxtCvv(),"234");
			buttonClick(b.getBtnBook());
			BookingConfirmPage bc=new BookingConfirmPage();
			String value = getAttribute(bc.getTxtvalue());
			System.out.println("Order number is..."+value);}}
			

			
	
	
