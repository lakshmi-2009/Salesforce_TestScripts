package AutomatingSalesforcePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.SalesforceReusable.tests.BaseTestSalesforce;

public class TC_3RememberMe extends BaseTestSalesforce {

	public static void main(String[] args) throws InterruptedException {
		
       launchBrowser("salesforce");
		
		titleComparision("Salesforce", "actualTitle");
		Thread.sleep(3000);
		
		 
	}

}
