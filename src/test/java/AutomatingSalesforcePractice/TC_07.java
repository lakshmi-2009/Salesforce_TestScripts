package AutomatingSalesforcePractice;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.SalesforceReusable.tests.BaseTestSalesforce;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.ElementClickInterceptedException;
public class TC_07 extends BaseTestSalesforce {

	public static void main(String[] args) throws InterruptedException {
		
        launchBrowser("salesforce");
		
		titleComparision("Salesforce", "actualTitle");
		Thread.sleep(3000);
		
		enteringText(usernameElement, "lmdevalla@curious-unicorn-5zv0y8.com", "usename");
		
		
		enteringPasswordText(passwordElement, "Lakshmi@2009", "password");
		
		Thread.sleep(4000);
		clickButton(LoginButton);  
		
		Thread.sleep(4000);
		clickUsermenuDropdown();
		
		Thread.sleep(3000);
		By clickMySettings = By.xpath("//*[@id=\"userNav-menuItems\"]/a[2]");
		clickOnButton(button, clickMySettings);
		
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		By clickPersonal = By.id("PersonalInfo_font");
		clickOnButton(button,clickPersonal);
		
		
		By loginHistory = By.xpath("//*[@id=\"PersonalInfo_child\"]/div[8]");
		clickOnButton(button,loginHistory);
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		By downloadLoginHistory = By.xpath("//*[@id=\"RelatedUserLoginHistoryList_body\"]/div/a");
		clickOnButton(button,downloadLoginHistory);
		
		
		By displayAndLayout = By.id("DisplayAndLayout_font");
		clickOnButton(button,displayAndLayout);
		
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		By customizeMyTabs = By.xpath("//*[@id=\"DisplayAndLayout_child\"]/div[1]");
		clickOnButton(button,customizeMyTabs);
		
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		By customApp = By.id("p4");
		clickOnButton(button,customApp);
		
		
		Thread.sleep(3000);
		By salesforceChatter = By.xpath("//*[@id=\"p4\"]/option[9]");
		clickOnButton(button,salesforceChatter);
		
		By reports = By.xpath("//*[@id=\"duel_select_0\"]/option[102]");
		clickOnButton(button,reports);
		
		
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		By addArrow = By.xpath("//*[@id=\"duel_select_0_right\"]/img");
		clickOnButton(button,addArrow);
		
		By saveButton = By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]");
		clickOnButton(button,saveButton);
		
		By emailLink = By.id("EmailSetup_font");
		clickOnButton(button,emailLink);
		
		By emailSettings = By.id("EmailSettings_font");
		clickOnButton(button,emailSettings);
		
		WebElement emailName = driver.findElement(By.id("sender_name"));
		emailName.clear();
		emailName.sendKeys("LK");
		
		WebElement emailAddress = driver.findElement(By.xpath("//*[@id=\"sender_email\"]"));
		emailAddress.clear();
		emailAddress.sendKeys("LMDEVALLA@GMAIL.COM");
		//*[@id="sender_email"]
		
		By bccRadioButton = By.id("auto_bcc1");
		clickOnButton(button,bccRadioButton);
		
		By saveEmailInfo = By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]");
		clickOnButton(button,saveEmailInfo);
		
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		By calenderAndReminders = By.id("CalendarAndReminders_font");
		clickOnButton(button,calenderAndReminders);
		
		By ActivityReminders = By.xpath("//*[@id=\"Reminders_font\"]");
		clickOnButton(button,ActivityReminders);
		
		By testRemainderButton = By.id("testbtn");
		clickOnButton(button,testRemainderButton);
	
	}

}
