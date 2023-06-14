package AutomatingSalesforcePractice;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.SalesforceReusable.tests.BaseTestSalesforce;
import org.openqa.selenium.support.ui.WebDriverWait;

@Test
public class TC_11 extends BaseTestSalesforce { 

	{
	launchBrowser("salesforce");
	
	titleComparision("Salesforce", "actualTitle");
	driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	
	enteringText(usernameElement, "lmdevalla@curious-unicorn-5zv0y8.com", "usename");
	driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	
	enteringPasswordText(passwordElement, "Lakshmi@2009", "password");
	
	driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	clickButton(LoginButton);  
	
	By clickOnAccount = By.xpath("//*[@id=\"Account_Tab\"]/a");
	clickOnButton(button, clickOnAccount);
	
	
	WebDriverWait waitforNew = new WebDriverWait(driver,30);
	waitforNew.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Create New")));
	By newView = By.partialLinkText("Create New");
	clickOnButton(button, newView);
	
	
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"fname\"]")));
	WebElement viewName = driver.findElement(By.xpath("//*[@id=\"fname\"]"));
	viewName.clear();
	viewName.sendKeys("My View2");
	
	
	explicitWaitVisibilityOfElementLocated("//*[@id=\"devname\"]");
	By viewUniqueName = By.xpath("//*[@id=\"devname\"]");
	clickOnButton(button, viewUniqueName);
	
	clickOnSave("//*[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1]");
	
	driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	
	//=============TC_12=============//
	
	//explicitWaitVisibilityOfElementLocated("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[2]/a[1]");
	By editViewButton =By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[2]/a[1]");
	clickOnButton(button, editViewButton ); 
	//By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]").partialLinkText("Edit");
	
	/*explicitWaitVisibilityOfElementLocated("//*[@id=\"fname\"]");
	WebElement newViewName = driver.findElement(By.xpath("//*[@id=\"fname\"]"));
	newViewName.clear();
	newViewName.sendKeys("My New View");
	*/
	
	
	
	
}	
	
}
