package AutomatingSalesforcePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.SalesforceReusable.tests.BaseTestSalesforce;

public class TC_5_4B extends BaseTestSalesforce {

	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser("salesforce");
		titleComparision("Salesforce", "actualTitle");
		
		enteringText(usernameElement, "123", "usename");
		Thread.sleep(3000);
 		  
		enteringPasswordText(passwordElement, "22131", "password");
		
		Thread.sleep(3000);
		clickButton(LoginButton);
		
		String actualText = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"error\"]"));
		String errorText = errorMessage.getText();
		
		if(actualText.equals(errorText)) {
			System.out.println("correct error message is displayed");
			System.out.println("test script pass");
		}
		else {
			System.out.println("correct error message is NOT displayed");
			System.out.println("test script fail");
		}
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
