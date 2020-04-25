package org.acc.Testng;

import org.testng.annotations.Test;

public class parallel {
@Test
private void test1() {
	System.out.println("test1");
	System.out.println("Thread id is:"+Thread.currentThread().getId());
}
@Test
private void test2() {
	System.out.println("test2");
	System.out.println("Thread id is"+Thread.currentThread().getId());

}
}
