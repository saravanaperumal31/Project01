package org.test;

import static org.testng.Assert.assertEquals;

import java.util.Date;

import org.base.BaseClass;
import org.pages.FbpageLogin;
import org.testng.annotations.*;

public class Fblogin extends BaseClass{
@BeforeClass
private void beforeClass() {
	browserLaunch();
}
@AfterClass
private void afterclass() {
	quitwindow();
}
@BeforeMethod
private void beforeMethod() {
	System.out.println("Start test"+new Date());

}
@AfterMethod
private void afterMethod() {
	System.out.println("End test"+new Date());
}
@Test
private void test01() {
	urlLaunch("https://www.facebook.com/");
	windowMaximize();
	FbpageLogin l= new FbpageLogin();
	filltext(l.getTxtuserName(),"SaravanaPerumal");
	filltext(l.getTxtpassWord(),"Saravana@123");
	assertEquals("SaravanaPerumal",l.getTxtuserName().getAttribute("value"),"verify  username");
	assertEquals("Saravana@123",l.getTxtpassWord().getAttribute("value"),"verify password");
	

}
}
