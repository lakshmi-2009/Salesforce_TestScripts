package com.testing.testNGGrouping;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTest22 {

	@Test(groups = {"regression","functional"})
	public static void testMethod1() {
		System.out.println("inside TestNgTest12 class and testMethod1");
		//throw new ArithmeticException();
	}
	
	@Test
	public static void testMethod2() {
		System.out.println("inside TestNgTest12 class and testMethod2");
	}
	
	@Test(groups = {"smoke","functional"})
	public static void testMethod3() {
		System.out.println("inside TestNgTest12 class and testMethod3");
	}
}
