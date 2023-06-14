package com.tests.seleniumAutomation.tests;

public class PageTest {

	public static void main(String[] args) {
		
		com.SalesforceReusable.tests.BaseTestSalesforce.launchBrowser("chrome");
		com.SalesforceReusable.tests.BaseTestSalesforce.titleComparision("Google", "driver.getTitle()");

	}

}
