package com.testing.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTestTwo extends BaseTest {

	@BeforeClass
	public static void setUpForClass(){
		
		System.out.println(" inside TestNGTestTwo BeforeClass");
	}
	
	@AfterClass
	public static void tearDownClass(){
		
		System.out.println(" inside TestNGTestTwo AfterClass");
	}
	
	@BeforeMethod
	    public static void setUpForMethod() {
		
		System.out.println(" inside TestNGTestTwo BeforeMethod");
	}
	
	 @AfterMethod
    public static void tearDownMethod() {
	
	System.out.println(" inside TestNGTestTwo AfterMethod");
 }
	


	@Test(priority = 3)
	public static void testMethod1() {
		
		System.out.println(" inside TestNGTestTwo method1");
	}
	
	@Test(priority = 2)
    public static void testMethod2() {
		
		System.out.println(" inside TestNGTestTwo method2");
	}
	
	
	@Test(priority = 1)
    public static void testMethod3() {
		
		System.out.println(" inside TestNGTestTwo method3");
	}
	
	
	
}
