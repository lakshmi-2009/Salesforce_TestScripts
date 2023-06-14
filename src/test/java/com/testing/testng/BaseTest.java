package com.testing.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	@BeforeSuite
	public static void setUpSuit() {
		System.out.println("inside BaseTest inside BeforeSuit");
		
	}
	
	
	@AfterSuite
	public static void tearDownSuit() {
		System.out.println("inside BaseTest inside AfterSuite");
		
	}
	
	@BeforeTest
	public static void setUpTest() {
		System.out.println("inside BaseTest inside BeforeTest");
	}
	
	@AfterTest
	public static void tearDownTest() {
		System.out.println("inside BaseTest inside AfterTest");
	}
	
	
	@BeforeClass
	public static void setUpClass() {
		System.out.println("inside BaseTest inside BeforeClass");
	}
	
	@AfterClass
	public static void tearDownClass() {
		System.out.println("inside BaseTest inside AfterClass");
	}
	
	
	
}
