package AutomatingSalesforcePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.SalesforceReusable.tests.BaseTestSalesforce;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_1_LoginError extends BaseTestSalesforce {

	public static void main(String[] args) throws InterruptedException {
		launchBrowser("salesforce");
		titleComparision("Salesforce", "actualTitle");
		
		   
		  
		enteringText(usernameElement, "lmdevalla@curious-unicorn-5zv0y8.com", "usename");
	        Thread.sleep(3000);
	       
	       clearPassword(passwordElement); 
	        Thread.sleep(3000);
	       
	      
		   clickButton(LoginButton);  
		   Thread.sleep(3000);
	      
			  driver.close();
	}

}
