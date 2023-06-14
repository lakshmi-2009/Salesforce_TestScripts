package AutomatingSalesforcePractice;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.SalesforceReusable.tests.BaseTestSalesforce;

public class TC_19_Quarterly_Summary extends BaseTestSalesforce {

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
		
		Thread.sleep(3000);
		By QuartSumm = By.xpath("//*[@id=\"quarter_q\"]");
		WebElement QuarterlySummary = driver.findElement(QuartSumm);
		clickOnButton(QuarterlySummary,QuartSumm);
		
		Thread.sleep(2000);
		By QuartSummNextFQ = By.xpath("//*[@id=\"quarter_q\"]/option[3]");
		WebElement QuarterlySummaryOption3 = driver.findElement(QuartSummNextFQ);
		clickOnButton(QuarterlySummaryOption3,QuartSummNextFQ);
		
		Thread.sleep(3000);
		By QuartSummInclude = By.xpath("//*[@id=\"open\"]");
		WebElement QuarterlySummaryInc = driver.findElement(QuartSummInclude);
		clickOnButton(QuarterlySummaryInc,QuartSumm);
		
		Thread.sleep(2000);
		By QuartSummOpenOpp = By.xpath("//*[@id=\"open\"]/option[2]");
		WebElement QuarterlySummaryOption2 = driver.findElement(QuartSummOpenOpp);
		clickOnButton(QuarterlySummaryOption2,QuartSummNextFQ);
		
	}

}
