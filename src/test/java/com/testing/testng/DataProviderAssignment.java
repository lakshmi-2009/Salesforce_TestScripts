package com.testing.testng;


import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.SalesforceReusable.tests.BaseTestSalesforce;
import com.tests.seleniumAutomation.utilities.Constants;


public class DataProviderAssignment extends BaseTestSalesforce {
	
	
	
	@DataProvider(name="Authentication")
	public static Object[][] credentials(){
		return new Object[][] {
			{"username1","password1"},
			{"username2","password2"},
			{"username3","password3"}
			};	
	      }
	
	//call dataProvider with its name
	
	@Test(dataProvider = "Authentication")
	
	// function to enter login 
	
	public static void login(String userName, String passWord) {
		
		launchBrowser("salesforce");
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys(passWord);
		driver.findElement(By.id("Login")).click();
		
	}
	
	
	File file = new File(Constants.XL_SELENIUM_DATA_PATH);
    public static  void readAllCellDataFromXLfile(File path,String sheetName) {
	   
   }
	
}
 

