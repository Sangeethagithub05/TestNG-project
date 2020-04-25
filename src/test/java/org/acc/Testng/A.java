package org.acc.Testng;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class A {
	@Test
	private void test1() {
	Assert.assertTrue(true);
	}
	@Test(retryAnalyzer=B.class)
	private void test2() {
	Assert.assertTrue(false);

	}
	@Test
	private void test3() {
		Assert.assertTrue(true);

	}

}
