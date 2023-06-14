package AutomatingSalesforcePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.safari.SafariDriver.WindowType;

import com.SalesforceReusable.tests.BaseTestSalesforce;

public class TC_08  extends BaseTestSalesforce {

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
		
		String originalWindow = driver.getWindowHandle(); // window handle of salesforce
		
		//clicking on developer console
		driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[3]")).click(); 
		
		for (String windowHandle : driver.getWindowHandles()) {
		    if(!originalWindow.contentEquals(windowHandle)) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}
		Thread.sleep(4000);
		driver.close();
		driver.switchTo().window(originalWindow);
	}


}