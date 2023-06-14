package AutomatingSalesforcePractice;

import org.openqa.selenium.By;

import com.SalesforceReusable.tests.BaseTestSalesforce;

public class TC_09 extends BaseTestSalesforce{

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
		
		By logoutButton = By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]");
		clickOnButton(button, logoutButton);
		
		//Thread.sleep(2000);
		//driver.close();
		
	}

}
