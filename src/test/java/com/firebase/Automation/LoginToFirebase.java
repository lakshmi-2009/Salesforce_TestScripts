package com.firebase.Automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver.WindowType;

import com.SalesforceReusable.tests.BaseTestSalesforce;

public class LoginToFirebase extends BaseTestSalesforce {

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
		
		WebElement switchElement = driver.findElement(By.xpath("//div[@class=\"navbar\"]/div"));
		Actions action = new Actions(driver);
		action.moveToElement(switchElement).perform();
		
		Thread.sleep(4000);
		
		WebElement clickWindow = driver.findElement(By.xpath("//div[@class=\"dropdown-content\"]//following::a[@href=\"./window.html\"]"));
		clickWindow.click();
		
		Thread.sleep(4000);
		
		String baseWindowHandle = driver.getWindowHandle();
		//System.out.println(baseWindowHandle);
		
		WebElement clickNewWindow = driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[2]/a[2]/button"));
		clickNewWindow.click();
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		for(String handle : allWindowHandles) {
			
			if(!baseWindowHandle.equals(handle)) {
				driver.switchTo().window(handle);
				break;
			}
		}
		

		Thread.sleep(6000);
		
		 driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("selenium");
		 Thread.sleep(4000);
		 
		 //driver.switchTo().window(baseWindowHandle);
		 
		 //driver.switchTo().window("https://demoqa.com");
		 driver.navigate().to("https://demoqa.com");
		 
		 
		 Thread.sleep(4000);
		// driver.close();
		
	}

}
