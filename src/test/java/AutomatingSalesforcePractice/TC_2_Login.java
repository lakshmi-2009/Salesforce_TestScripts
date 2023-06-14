package AutomatingSalesforcePractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.SalesforceReusable.tests.BaseTestSalesforce;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_2_Login extends BaseTestSalesforce {

	public static void main(String[] args) throws InterruptedException {
	
		launchBrowser("salesforce");
		
		titleComparision("Salesforce", "actualTitle");
		Thread.sleep(3000);
		
		enteringText(usernameElement, "lmdevalla@curious-unicorn-5zv0y8.com", "usename");
		Thread.sleep(3000);
		
		enteringPasswordText(passwordElement, "Lakshmi@2009", "password");
		
		Thread.sleep(3000);
		clickButton(LoginButton);  
		
		Thread.sleep(2000);
		driver.close();
}
}