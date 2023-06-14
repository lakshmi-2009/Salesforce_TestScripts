package AutomatingSalesforcePractice;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.SalesforceReusable.tests.BaseTestSalesforce;
import org.openqa.selenium.support.ui.WebDriverWait;

@Test
public class TC_13 extends BaseTestSalesforce {
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
		
		explicitWaitVisibilityOfElementLocated("//*[@id=\"toolsContent\"]/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a");
		By mergeAccount = By.partialLinkText("Merge Accounts");
		clickOnButton(button, mergeAccount);
		
		explicitWaitVisibilityOfElementLocated("//*[@id=\"stageForm\"]/div/div[2]/div[4]/input[1]");
		WebElement findAccountTextBox = driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[4]/input[1]"));
		//findAccountTextBox.clear();
		findAccountTextBox.sendKeys("Get");
		
		explicitWaitVisibilityOfElementLocated("//*[@id=\"stageForm\"]/div/div[2]/div[4]/input[2]");
		By findAccount = By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[4]/input[2]");
		clickOnButton(button, findAccount);
		
		explicitWaitVisibilityOfElementLocated("//*[@id=\"cid0\"]");
		By clickAccount1 = By.id("cid0");
		checkBox(checkBoxElement, clickAccount1);
		
		explicitWaitVisibilityOfElementLocated("//*[@id=\"cid1\"]");
		By clickAccount2 = By.id("cid1");
		checkBox(checkBoxElement, clickAccount2);
		
		explicitWaitVisibilityOfElementLocated("//*[@id=\"stageForm\"]/div/div[2]/div[5]/div/input[1]");
		By nextButton = By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[5]/div/input[1]");
		clickOnButton(button,nextButton);
		
		explicitWaitVisibilityOfElementLocated("//*[@id=\"stageForm\"]/div/div[2]/div[1]/div/input[2]");
		By mergeButton = By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[1]/div/input[2]");
		clickOnButton(button,mergeButton);
		
		//clicking ok button on popup window
		driver.switchTo().alert().accept();
		
		implicitWait();
		driver.close();
		
		
	}
}
