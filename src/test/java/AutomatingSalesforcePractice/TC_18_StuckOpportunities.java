package AutomatingSalesforcePractice;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.SalesforceReusable.tests.BaseTestSalesforce;

public class TC_18_StuckOpportunities extends BaseTestSalesforce {

	public static void main(String[] args) throws InterruptedException  {
		
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
		
		Thread.sleep(3000);
		By StuckOpp = By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[2]/a");
		WebElement StuckOpportunities = driver.findElement(StuckOpp);
		clickOnButton(StuckOpportunities, StuckOpp);
		
		Thread.sleep(3000);
		driver.close();

	}

}
