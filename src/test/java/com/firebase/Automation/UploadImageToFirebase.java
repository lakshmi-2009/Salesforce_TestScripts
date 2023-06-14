package com.firebase.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.SalesforceReusable.tests.BaseTestSalesforce;

public class UploadImageToFirebase extends BaseTestSalesforce{

	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser("firebase");
		titleComparision("firebase", "firebase" );
		
		Thread.sleep(4000);
		
		By username = By.id("email_field");
		WebElement usernameElement = driver.findElement(username);
		enteringText(usernameElement, "admin123@gmail.com", "username");
		
		By password = By.id("password_field");
		WebElement passwordElement = driver.findElement(password);
		enteringText(passwordElement, "admin123", "password");
		
		Thread.sleep(4000);
		
		clickButton(LoginButton);
		
		Thread.sleep(4000);
		
		
		

	}

}
