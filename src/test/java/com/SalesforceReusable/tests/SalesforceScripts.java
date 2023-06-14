package com.SalesforceReusable.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceScripts {

	public static void main(String[] args) throws InterruptedException {
		String expectedTitle = "Salesforce";

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			
			System.out.println("title matched");
		}
		
		else {
			
			System.out.println("title matched");
		}
		
           Thread.sleep(4000);
		
	       By username = By.name("username");
	       WebElement usernameElement = driver.findElement(username);
	       usernameElement.clear();
	       usernameElement.sendKeys("lmdevalla@curious-unicorn-5zv0y8.com");
	      
	       
	       By password = By.name("pw");
	       WebElement passwordElement = driver.findElement(password);
	       passwordElement.clear();
	       passwordElement.sendKeys("Lakshmi@2009");

	}

}
