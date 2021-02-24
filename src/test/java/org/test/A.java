package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A {

	@Test
	public void testA1() {
		Assert.assertTrue(true,"verify register");
		System.out.println("TestA1");
	}
	
	@Test
	public void testA2() {
		Assert.assertTrue(true);
	}
	@Test
	public void testA3() {
		Assert.assertTrue(false,"verify payment");
		System.out.println("testA3");
	}
}
