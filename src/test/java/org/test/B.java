package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class B {

	@Test
	public void testB1() {
		Assert.assertTrue(true,"verify register");
		System.out.println("TestB1");
	}
	
	@Test
	public void testB2() {
		Assert.assertTrue(false);
		System.out.println("B2");
}
	@Test
	public void testB3() {
		Assert.assertTrue(false,"verify payment");
		System.out.println("B3");
}
}
