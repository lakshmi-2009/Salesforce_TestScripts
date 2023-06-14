package AutomatingSalesforcePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.SalesforceReusable.tests.BaseTestSalesforce;

public class TC_4AForgotPassword extends BaseTestSalesforce  {

	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser("salesforce");
		titleComparision("Salesforce", "actualTitle");
		
		enteringText(usernameElement, "lmdevalla@curious-unicorn-5zv0y8.com", "usename");
		Thread.sleep(3000);
		
		//checking forgotPassword link is displayed or not
		WebElement forgotPassword = driver.findElement(By.id("forgot_password_link"));
		if(forgotPassword.isDisplayed()) 
			
			System.out.println("forgotPassword link is displayed");
		else
			System.out.println("forgotPassword link is not displayed");
		
		Thread.sleep(4000);
		
		
		By clickPaswordLink = By.id("forgot_password_link");
		clickOnButton(forgotPassword, clickPaswordLink);
		
		Thread.sleep(2000);
		WebElement userNameForForgotPassword = driver.findElement(By.xpath("//*[@id=\"un\"]"));
		userNameForForgotPassword.sendKeys("lmdevalla@curious-unicorn-5zv0y8.com");
		
		Thread.sleep(4000);
		By continueButton = By.id("continue");
		clickOnButton(userNameForForgotPassword, continueButton);
		
		
		
	}

}
