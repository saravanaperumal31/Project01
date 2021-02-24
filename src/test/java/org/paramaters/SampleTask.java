package org.paramaters;
import java.io.IOException;
import java.util.Date;
import org.base.BaseClass;
import org.pages.BookHotelPage;
import org.pages.BookingConfirmPage;
import org.pages.LoginPage;
import org.pages.SearchHotelPage;
import org.pages.SelectHotelPage;
import org.testng.annotations.*;

public class SampleTask extends BaseClass {
	@BeforeClass
	private void beforeClass() {
		browserLaunch();}
	@AfterClass
	private void afterClass(){
		quitwindow();
		}
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Start test "+new Date());}
	@AfterMethod
	private void afterMethod() {
		System.out.println("After Methods");
		System.out.println("End test "+new Date());}
	@Parameters({"UserName","PassWord"})
	@Test
	private void test1(String user,String pass) throws IOException {
			System.out.println("test1");
			urlLaunch("http://adactinhotelapp.com/");
			windowMaximize();
			implicitWait(20);
			LoginPage l=new LoginPage();
			filltext(l.getTxtUsername(),user);
			filltext(l.getTxtpassword(),pass);
			buttonClick(l.getBtnLogin());}
	@Test
	private void test3() {
			SelectHotelPage sh=new SelectHotelPage();
			buttonClick(sh.getBtnradio());
			buttonClick(sh.getBtnConti());}
	@Test
	private void test2() {
			SearchHotelPage s=new SearchHotelPage();
			selectByVisibleText(s.getDrpLoc(),"London");
			selectByVisibleText(s.getDrphotel(),"Hotel Hervey");
			selectByVisibleText(s.getDrproomType(), "Deluxe");
			selectByVisibleText(s.getDrproomNo(),"2 - Two");
			selectByVisibleText(s.getDrpadtRoom(),"2 - Two");
			selectByVisibleText(s.getDrpChlRoom(),"0 - None");
			buttonClick(s.getBtnSearch());}
	@Parameters({"Firstname","Lastname","Address","Ccnum","Cvv"})
	@Test
	private void test4(String fname,String lname,String addr,String ccnum,String cvv) throws IOException {
			BookHotelPage b= new BookHotelPage();
			filltext(b.getTxtFirstName(),fname);
			filltext(b.getTxtLastName(),lname);
			filltext(b.getTxtAddress(),addr);
			filltext(b.getTxtCcNum(),ccnum);
			selectByVisibleText(b.getDrpCctype(),"VISA");
			selectByVisibleText(b.getDrpExpMnth(),"February");
			selectByVisibleText(b.getDrpExpYr(), "2022");
			filltext(b.getTxtCvv(),cvv);
			buttonClick(b.getBtnBook());
			BookingConfirmPage bc=new BookingConfirmPage();
			String value = getAttribute(bc.getTxtvalue());
			System.out.println("Order number is..."+value);
	}
	

		}
