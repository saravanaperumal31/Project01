package org.parallel;

import org.testng.annotations.DataProvider;

public class A {
	@DataProvider(name="bookingDetail")
	public  Object[][] bookingData() {
	return new Object[][] {{"SaravanaPerumal","Saravana@31","Raj","Kumar","Zone Plaza","1236457849098370","123"},
		{"SaravanaPerumal","Saravana@31","Jai","ram","Zone Plaza","1236457849098370","123"}};
	}
}