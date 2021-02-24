package org.dataprovider;
import java.io.IOException;
import java.util.Date;
import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.pages.BookHotelPage;
import org.pages.BookingConfirmPage;
import org.pages.LoginPage;
import org.pages.SearchHotelPage;
import org.pages.SelectHotelPage;
import org.test.A;
import org.testng.annotations.*;
public class SampleTask extends BaseClass {
	
	@BeforeClass
	private void beforeClass() {
		System.out.println("Beforeclass");
		}
	@AfterClass
	private void afterClass(){
		System.out.println("afterclass");
		}
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before Methods");
		System.out.println("Start test "+new Date());}
	@AfterMethod
	private void afterMethod() {
		System.out.println("After Methods");
		System.out.println("End test "+new Date());
		quitwindow();
	}
	
	@Test(dataProvider="bookingDetail")
	public void test1(String user,String pass,String fname,String lname,String add,
			String ccno,String cvv) throws IOException {
			browserLaunch();
			urlLaunch("http://adactinhotelapp.com/");
			windowMaximize();
			implicitWait(10);
			LoginPage l=new LoginPage();
			filltext(l.getTxtUsername(),user);
			filltext(l.getTxtpassword(),pass);
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
			System.out.println("Order number is..."+value);
			}
	@DataProvider(name="bookingDetail")
	public  Object[][] bookingData() {
	return new Object[][] {{"SaravanaPerumal","Saravana@31","Raj","Kumar","Zone Plaza","1236457849098370","123"},
		{"SaravanaPerumal","Saravana@31","Jai","ram","Zone Plaza","1236457849098370","123"}};
	}
	
		}



			
	
	
