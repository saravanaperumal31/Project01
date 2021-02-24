package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C {
	@Test
	public void testC1() {
		Assert.assertTrue(true,"verify login");
		System.out.println("testC1");
	}
	
	@Test
	public void testC2() {
		Assert.assertTrue(false,"verify cart");
		System.out.println("testC2");
	}
	
	@Test
	public void testC3() {
		Assert.assertTrue(true);
		System.out.println("testC3");
}
}
