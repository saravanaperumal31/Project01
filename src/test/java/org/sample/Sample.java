package org.sample;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pages.BookHotelPage;
import org.pages.BookingConfirmPage;
import org.pages.LoginPage;
import org.pages.SearchHotelPage;
import org.pages.SelectHotelPage;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample extends BaseClass{
	static WebDriver driver;
@Test
private void test01() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
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
	System.out.println("Order number is..."+value);

}
@Test
private void test02() {
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
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
	System.out.println("Order number is..."+value);

}

//@Test
}