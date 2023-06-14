package AutomatingSalesforcePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.SalesforceReusable.tests.BaseTestSalesforce;

    public class SalesforceCompleteAutomation extends BaseTestSalesforce{
	public static void main(String[] args) throws InterruptedException {
		
		
		launchBrowser("salesforce"); //method called from BaseTestSalesforce
		titleComparision("Salesforce", "actualTitle");//method called from BaseTestSalesforce
		
		//Thread.sleep(4000);		
		
		
		//enteringText in username Textbox
		   By username = By.name("username");
		   WebElement usernameElement = driver.findElement(username);
		   
	       enteringText(usernameElement, "lmdevalla@curious-unicorn-5zv0y8.com", "username");
	      
		//enteringText in password Textbox
		  By password = By.xpath("//input[@name='pw']");
		  WebElement passwordElement = driver.findElement(password);
		  
		  enteringText(passwordElement, "Lakshmi@2009", "password");
			
			
		  //click login button
		  
		  
		  
		  clickButton(LoginButton);
		
		  
		  
	}

}
