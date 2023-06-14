package com.SalesforceReusable.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.Locator;

import io.github.bonigarcia.wdm.WebDriverManager;

 public class BaseTestSalesforce {
 public static WebDriver driver=null;
 public static WebElement usernameElement,rememberMe,passwordElement,button,usermenuButton,elementDisplayed;
 public static WebElement editProfilePopUp,aboutWebElement,contactWebElement,checkBoxElement;
 //public static WebElement passwordElement;
 public static WebElement LoginButton;
 public static WebDriverWait wait;
 //public static String actualTitle = null;
 
 // ====== method for launching Browser=========//
 
  public static void launchBrowser(String browserName)	{
	   
	 switch(browserName) {
	
	   case "firefox":  
		   browserName.equalsIgnoreCase("firefox");
		   WebDriverManager.firefoxdriver().setup();
    	   driver = new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.firefox.com/");
	   break;
		
	    case "chrome":  
	    	browserName.equalsIgnoreCase("chrome");
	    	WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
		   
	    break;
	    case "salesforce":  
	    	browserName.equalsIgnoreCase("salesforce");
	    	WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://login.salesforce.com/");
		   
	    break;
	    case "firebase":  
	    	browserName.equalsIgnoreCase("firebase");
	    	WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://qa-tekarch.firebaseapp.com/");
		   
	    break;
	    }    //end of switch(browserName)
	      System.out.println("Browser successfully launched");
        }    
  // =============================================================================== //
  
              //============	titleComparision method  ==========  //
  public static void titleComparision(String expectedTitle, String actualTitle ) {
	     actualTitle = driver.getTitle();
	    if(expectedTitle.equals(actualTitle)) {
			
			System.out.println("title matched");
		}
		
		else {
			
			System.out.println("title matched");
		     }
	    
        } // end of titleComparision
  
  
  
  
  
  // ====================entering text to text box===========================//
  public static void enteringText(WebElement element, String data, String objectName) {
	   element = driver.findElement(By.name("username"));
	  if(element.isDisplayed()) {
   	     element.clear();
   	     element.sendKeys(data);
   	   System.out.println(objectName + " is entered to the text filed"); 
        } else {
   	   
 		 System.out.println(objectName+" element is not displayed");
 		 }
  }
  
	// ===================entering password================================ // 
	  
  public static void enteringPasswordText(WebElement element, String data, String objectName) {
	   element = driver.findElement(By.xpath("//input[@name='pw']"));
	  if(element.isDisplayed()) {
  	     element.clear();
  	     element.sendKeys(data);
  	   System.out.println(objectName + " is entered to the text filed"); 
       } else {
  	   
		 System.out.println(objectName+" element is not displayed");
		 }
 }
  
  
  
  
	   //====================click login method ===========================// 
	  
  public static void clickButton(WebElement LoginButton) {
	  LoginButton= driver.findElement(By.id("Login"));
	  LoginButton.click();
      
      System.out.println("login button is clicked");
       }
  
  //======clickAnyButton=====
  public static void clickOnButton(WebElement button, By objectName ) {
	  button= driver.findElement(objectName);
	  button.click();
      
      System.out.println(objectName +" button is clicked");
       }
  
  
  
//==============clear password field========================
  
  public static void clearPassword(WebElement passwordElement) {
  passwordElement = driver.findElement(By.name("pw"));
  if(passwordElement.isDisplayed()) {
	  passwordElement.clear();
	  //passwordElement.sendKeys(data);
	   System.out.println(" password field  is cleared"); 
     } else 
		 System.out.println("password field  is not cleared");	 
  }
  
  //==========rememberMeButton===========
  
  public static void rememberMeButton(WebElement rememberMe){
  rememberMe = driver.findElement(By.xpath("//input[@class=\"r4 fl mr8\"]"));
	  if(rememberMe.isSelected()) {
		  System.out.println("Rememberme Check box is selected");
	  }
	  else {
		  rememberMe.click();
		  System.out.println("Rememberme Check box is clicked");
	  }
  
  }
  
   
  //==========usermenuDropdown==========
  
  public static void clickUsermenuDropdown() {
  
  usermenuButton= driver.findElement(By.id("userNavLabel"));
  usermenuButton.click();
  System.out.println("usermenuButton is clicked");
  }
  
  //=============is Element Displayed========
  
  public static void isElementDisplayed(WebElement elementDisplayed,By object) {
	   elementDisplayed = driver.findElement(object);
		if(elementDisplayed.isDisplayed()) {
			System.out.println(object +" is displayed");
		}
		else {
			System.out.println(elementDisplayed+" is not displayed");
		}  
  }
	//====================click on save=================//
		
		public static void clickOnSave(String xpath) {  
			  usermenuButton= driver.findElement(By.xpath(xpath));
			  usermenuButton.click();
			  System.out.println("save button is clicked");
                 }
  
  //=====================explicit wait====================//
		public static void  explicitWaitVisibilityOfElementLocated(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		}
  
  //==================implicit wait=======================//
		public static void  implicitWait() {
			
			driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		}
		
	//=================check box click=============//
		
		public static void  checkBox(WebElement checkBoxElement, By checkBoxobject) {
			
			checkBoxElement = driver.findElement(checkBoxobject);
			if(checkBoxElement.isSelected()) {
				System.out.println(checkBoxobject+" is checked");
			}
			else {
				checkBoxElement.click();
			      }
		   }
		
		//==================is alert present===========//
		
		
		
  
}






















  
  

	
