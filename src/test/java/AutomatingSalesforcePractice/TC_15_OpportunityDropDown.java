package AutomatingSalesforcePractice;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.SalesforceReusable.tests.BaseTestSalesforce;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_15_OpportunityDropDown extends BaseTestSalesforce {

	public static void main(String[] args) throws InterruptedException {
        launchBrowser("salesforce");
		
		titleComparision("Salesforce", "actualTitle");
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		
		enteringText(usernameElement, "lmdevalla@curious-unicorn-5zv0y8.com", "usename");
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		
		enteringPasswordText(passwordElement, "Lakshmi@2009", "password");
		
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		clickButton(LoginButton);  
		
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		By OppTab = By.xpath("//*[@id=\"Opportunity_Tab\"]/a");
		WebElement OpportunityTab = driver.findElement(OppTab);
		clickOnButton(OpportunityTab,OppTab);
		
		String expectedTitle = "Opportunities";
		String OppTitle=null;
		titleComparision(expectedTitle ,OppTitle);
		
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		Thread.sleep(3000);
		By OppDropDown = By.xpath("//*[@id=\"fcf\"]");
		WebElement OppMenu = driver.findElement(OppDropDown);
		clickOnButton(OppMenu, OppDropDown);
		
		
		
		
		String expOppValues[] = { "All Oppotunities", "Closing Next Month", "Closing This Month", "My Opportunities", "New This Week", "Recently Viewed Opportunities","Won"  };
	
	    List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"fcf\"]"));
           
            for(int i=0;i<list.size();i++) {
			
			if(list.get(i).getText().equals(expOppValues[i])) {
			System.out.println(list.get(i).getText()+" is present");
			}
			else {
			System.out.println(list.get(i).getText()+" is not present");	
		     }
            }
		      Thread.sleep(3000);
		      driver.close();
		
		
			
}
}