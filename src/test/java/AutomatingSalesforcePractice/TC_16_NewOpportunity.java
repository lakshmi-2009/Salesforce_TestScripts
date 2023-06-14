package AutomatingSalesforcePractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.SalesforceReusable.tests.BaseTestSalesforce;

public class TC_16_NewOpportunity extends BaseTestSalesforce {

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
		By newButton = By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input");
		WebElement newOppButton = driver.findElement(newButton);
		clickOnButton(newOppButton, newButton);
		
		implicitWait();
		By OppName = By.xpath("//*[@id=\"opp3\"]");
		WebElement OpportunityName = driver.findElement(OppName);
		OpportunityName.sendKeys("My_New_Opp");
		
		implicitWait();
		By AccName = By.xpath("//*[@id=\"opp4\"]");
		WebElement AccountName = driver.findElement(AccName);
		AccountName.sendKeys("My_New_Acc");
		
		implicitWait();
		By Prob = By.xpath("//*[@id=\"opp12\"]");
		WebElement Probability = driver.findElement(Prob);
		Probability.sendKeys("50");
		
		By OppCloseDate = By.xpath("//*[@id=\"ep\"]/div[2]/div[3]/table/tbody/tr[2]/td[4]/div/span/span");
		WebElement OpportunityCloseDate = driver.findElement(OppCloseDate);
		clickOnButton(OpportunityCloseDate, OppCloseDate);
		
		implicitWait();
		By Stage = By.xpath("//*[@id=\"opp11\"]");
		WebElement StageField = driver.findElement(Stage);
		clickOnButton(StageField, Stage);
		
		implicitWait();
		By StagePros = By.xpath("//*[@id=\"opp11\"]/option[2]");
		WebElement StageProspect = driver.findElement(StagePros);
		clickOnButton(StageProspect, StagePros);
		
		implicitWait();
		clickOnSave("//*[@id=\"opp11\"]/option[2]");
		
		Thread.sleep(3000);
		driver.close();
	}

}
