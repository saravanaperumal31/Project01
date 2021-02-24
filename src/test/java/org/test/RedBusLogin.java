package org.test;

import java.util.Date;

import org.base.BaseClass;
import org.pages.RedBussLogin;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RedBusLogin extends BaseClass {
	@BeforeClass
	private void beforeClass() {
		browserLaunch();
	}
	@AfterClass
	private void afterclass() {
//		quitwindow();
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
		urlLaunch("https://www.redbus.in/");
		windowMaximize();
		implicitWait(10);
		RedBussLogin r= new RedBussLogin();
		buttonClick(r.getBtnsignin());
		buttonClick(r.getClkSignup());
//		framesCount("iframe");
//		switchToFrames("//iframe[@id='gsi_203197_226232']");
//		buttonClick(r.getClkGoogle());
}
	}
