package AutomatingSalesforcePractice;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.SalesforceReusable.tests.BaseTestSalesforce;
import org.openqa.selenium.support.ui.WebDriverWait;

@Test
public class TC_14 extends BaseTestSalesforce  {
	
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
		waitforNew.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div/div[1]/ul/li[2]")));
		By activity30Days = By.partialLinkText("Accounts with last activity > 30 days");
		clickOnButton(button,activity30Days);
		
		explicitWaitVisibilityOfElementLocated("//*[@id=\"ext-gen149\"]");
		//implicitWait();//*[@id="ext-gen146"]
		By dateFieldDropdown = By.xpath("//*[@id=\"ext-gen149\"]");
		clickOnButton(button, dateFieldDropdown);
		
		
	//	WebDriverWait waitforDateField = new WebDriverWait(driver,30);
		//waitforDateField.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ext-gen311\"]/div[3]"))).click();
		explicitWaitVisibilityOfElementLocated("//*[@id=\"ext-gen306\"]/div[3]");
		By createdDateField = By.xpath("//*[@id=\"ext-gen306\"]/div[3]");
		clickOnButton(button,createdDateField);
		  
		By calendarFrom = By.id("ext-gen153");
		clickOnButton(button,calendarFrom);
		
		explicitWaitVisibilityOfElementLocated("//*[@id=\"ext-gen322\"]");
		By todayButtonFrom = By.id("ext-gen322");
		clickOnButton(button,todayButtonFrom);
		
		explicitWaitVisibilityOfElementLocated("//*[@id=\"ext-gen155\"]");
		By calendarTo = By.id("ext-gen155");
		clickOnButton(button,calendarTo);
		
		explicitWaitVisibilityOfElementLocated("//*[@id=\"ext-gen337\"]");
		By todayButtonTo = By.id("ext-gen337");
		clickOnButton(button,todayButtonTo);
		
		By saveReportButton = By.id("saveReportBtn");
		clickOnButton(button,saveReportButton);
		
		explicitWaitVisibilityOfElementLocated("//*[@id=\"saveReportDlg_reportNameField\"]");
		WebElement viewName = driver.findElement(By.xpath("//*[@id=\"saveReportDlg_reportNameField\"]"));
		viewName.clear();
		viewName.sendKeys("My Report");
		
		explicitWaitVisibilityOfElementLocated("//*[@id=\"saveReportDlg_DeveloperName\"]");
		By reportUniqueName = By.xpath("//*[@id=\"saveReportDlg_DeveloperName\"]");
		clickOnButton(button,reportUniqueName);
		
		implicitWait();
		explicitWaitVisibilityOfElementLocated("//*[@id=\"dlgSaveAndRun\"]");
		clickOnSave("//*[@id=\"dlgSaveAndRun\"]");
	}
	
 }
  