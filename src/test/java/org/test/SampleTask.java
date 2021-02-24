package org.test;
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
		quitwindow();}
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Start test "+new Date());}
	@AfterMethod
	private void afterMethod() {
		System.out.println("After Methods");
		System.out.println("End test "+new Date());}
	
	@Test(dataProvider="loginDetail")
	private void test1(String user, String pass) throws IOException {
			urlLaunch("http://adactinhotelapp.com/");
			windowMaximize();
			implicitWait(20);
			LoginPage l=new LoginPage();
			filltext(l.getTxtUsername(),user);
			filltext(l.getTxtpassword(),pass);
			buttonClick(l.getBtnLogin());}
	
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
	@Test
	private void test3() {
			SelectHotelPage sh=new SelectHotelPage();
			buttonClick(sh.getBtnradio());
			buttonClick(sh.getBtnConti());}

	@Test(dataProvider="bookingDetail")
	private void test4(String fname,String lname,String add,
			String ccno,String cvv) throws IOException {
			BookHotelPage b= new BookHotelPage();
			filltext(b.getTxtFirstName(),fname);
			filltext(b.getTxtLastName(),lname);
			filltext(b.getTxtAddress(),add);
			filltext(b.getTxtCcNum(),ccno);
			selectByVisibleText(b.getDrpCctype(),"VISA");
			selectByVisibleText(b.getDrpExpMnth(),"February");
			selectByVisibleText(b.getDrpExpYr(), "2022");
			filltext(b.getTxtCvv(),cvv);
			buttonClick(b.getBtnBook());
			BookingConfirmPage bc=new BookingConfirmPage();
			String value = getAttribute(bc.getTxtvalue());
			System.out.println("Order number is..."+value);}
	
		@DataProvider(name="loginDetail")
		private Object[][] loginData() {
			return new Object[][] {{"SaravanaPerumal","Saravana@31"}};
			}
		
		@DataProvider(name="bookingDetail")
		private Object[][] bookingData() {
			return new Object[][] {{"Raj","Kumar","Zone Plaza","1236457849098370","123"},
			};
		}
		



}
