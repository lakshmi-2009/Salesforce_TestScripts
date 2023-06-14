package AutomatingSalesforcePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.SalesforceReusable.tests.BaseTestSalesforce;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
public class TC_05_UsermenuDropdown extends BaseTestSalesforce {

	public static void main(String[] args) throws InterruptedException {
		
        launchBrowser("salesforce");
		
		titleComparision("Salesforce", "actualTitle");
		Thread.sleep(3000);
		
		enteringText(usernameElement, "lmdevalla@curious-unicorn-5zv0y8.com", "usename");
		
		
		enteringPasswordText(passwordElement, "Lakshmi@2009", "password");
		
		Thread.sleep(3000);
		clickButton(LoginButton);  
		
		Thread.sleep(3000);
		clickUsermenuDropdown();
		
		String expValues[] = { "My Profile", "My Settings", "Developer Console", "Switch to Lightning Experience",  
		"Logout" };
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"userNavMenu\"]"));
		
		
		
		for(int i=0;i<list.size();i++) {
			
			if(list.get(i).getText().equals(expValues[i])) 
			System.out.println(list.get(i).getText()+" is present");
			else
			System.out.println(list.get(i).getText()+" is not present");	
		     }
		
		      Thread.sleep(3000);
		      driver.close();
		
		
 		  
	}

}
