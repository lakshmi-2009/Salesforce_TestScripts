package com.firebase.Automation;

import java.security.KeyStore.Entry.Attribute;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasefirebaseClass {
	
public static WebDriver driver=null;
	
	
	 public static void launchFirebase() {
		 
		    WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://qa-tekarch.firebaseapp.com/");
 
	}
	//title comparision
	 
	 public static void titleComparision () {
	     String actualTitle = driver.getTitle();
	     String expectedTitle = "firebase";
	    if(expectedTitle.equals(actualTitle)) 
			System.out.println("title matched");
		else 
			System.out.println("title matched");
	 }
	  
	 
	 
	 public static void LoginFirebase() {
		 
	  
     WebElement firebaseElement = driver.findElement(By.id("email_field"));
     firebaseElement.clear();
     firebaseElement.sendKeys("admin123@gmail.com"); 
     
     WebElement firebasePasswordElement = driver.findElement(By.id("password_field"));
     firebaseElement.clear();
     firebaseElement.sendKeys("admin123"); 
     
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     
     WebElement LoginElement = driver.findElement(By.xpath("//*[@id=\"login_div\"]/button"));
     
     LoginElement.click();
	 
	 } 
	 
	 
	 
	 
} 
	 
	 
	 
	 

