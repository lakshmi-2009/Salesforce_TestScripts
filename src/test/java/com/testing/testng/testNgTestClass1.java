package com.testing.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNgTestClass1 extends BaseTest {
	
	@BeforeClass
	public static void setUpForClass(){
		
		System.out.println(" inside TestNGTestOne BeforeClass");
	}
	
	@AfterClass
	public static void tearDownClass(){
		
		System.out.println(" inside TestNGTestOne AfterClass");
	}
	
	@BeforeMethod
	    public static void setUpForMethod() {
		
		System.out.println(" inside TestNGTestOne BeforeMethod");
	}
	
	 @AfterMethod
    public static void tearDownMethod() {
	
	System.out.println(" inside TestNGTestOne AfterMethod");
 }
	


	@Test(priority = 1)
	public static void testMethod1() {
		
		System.out.println(" inside TestNGTestOne method1");
	}
	
	@Test(priority = 2)
    public static void testMethod2() {
		
		System.out.println(" inside TestNGTestOne method2");
	}
	
	
	@Test(priority = 3)
    public static void testMethod3() {
		
		System.out.println(" inside TestNGTestOne method3");
	}
	
}
