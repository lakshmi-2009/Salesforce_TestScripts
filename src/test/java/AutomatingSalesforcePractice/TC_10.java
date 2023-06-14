package AutomatingSalesforcePractice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.SalesforceReusable.tests.BaseTestSalesforce;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_10 extends BaseTestSalesforce  {

	public static void main(String[] args) throws InterruptedException {
        launchBrowser("salesforce");
		
		titleComparision("Salesforce", "actualTitle");
		Thread.sleep(3000);
		
		enteringText(usernameElement, "lmdevalla@curious-unicorn-5zv0y8.com", "usename");
		Thread.sleep(3000);
		
		enteringPasswordText(passwordElement, "Lakshmi@2009", "password");
		
		Thread.sleep(3000);
		clickButton(LoginButton);  
		
		By clickOnAccount = By.xpath("//*[@id=\"Account_Tab\"]/a");
		clickOnButton(button, clickOnAccount);
		
		WebDriverWait waitforNew = new WebDriverWait(driver,30);
		waitforNew.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input")));
		By clickOnNew = By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input");
		clickOnButton(button, clickOnNew);
		
		
		Thread.sleep(3000);
		WebElement accountName = driver.findElement(By.xpath("//*[@id=\"acc2\"]"));
		accountName.clear();
		accountName.sendKeys("AMC Corp");
		
		By Type = By.xpath("//*[@id=\"acc6\"]");
		clickOnButton(button, Type);
		
		By customer = By.xpath("//*[@id=\"acc6\"]/option[3]");
		clickOnButton(button, customer);
		
		By customerPriority = By.xpath("//*[@id=\"00NJb000000Q071\"]");
		clickOnButton(button, customerPriority);
		
		
		By customerPriorityHigh = By.xpath("//*[@id=\"00NJb000000Q071\"]/option[2]");
		clickOnButton(button, customerPriorityHigh);
		
		
		
	}

}
