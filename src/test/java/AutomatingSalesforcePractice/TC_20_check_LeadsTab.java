package AutomatingSalesforcePractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.SalesforceReusable.tests.BaseTestSalesforce;

public class TC_20_check_LeadsTab extends BaseTestSalesforce {

	public static void main(String[] args) throws InterruptedException {
		
        launchBrowser("salesforce");
		
		titleComparision("Salesforce", "actualTitle");
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		
		enteringText(usernameElement, "lmdevalla@curious-unicorn-5zv0y8.com", "usename");
		implicitWait();
		
		enteringPasswordText(passwordElement, "Lakshmi@2009", "password");
		
		implicitWait();
		clickButton(LoginButton);
		
		By LeaTab = By.xpath("//*[@id=\"Lead_Tab\"]");
		WebElement LeadTab = driver.findElement(LeaTab);
		if(LeadTab.isDisplayed()) {
			System.out.println("Lead Tab is displayed");
		
		clickUsermenuDropdown();
			
		By logout = By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]");
		WebElement logoutButton = driver.findElement(logout);
		clickOnButton(logoutButton, logout);
		
		Thread.sleep(3000);
		driver.close();
			
			
		}
		
	}

}
