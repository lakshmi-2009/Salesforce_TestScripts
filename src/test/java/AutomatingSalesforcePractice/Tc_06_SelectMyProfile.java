package AutomatingSalesforcePractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.SalesforceReusable.tests.BaseTestSalesforce;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tc_06_SelectMyProfile extends BaseTestSalesforce {

	public static void main(String[] args) throws InterruptedException {
		
        launchBrowser("salesforce");
		
		titleComparision("Salesforce", "actualTitle");
		Thread.sleep(3000);
		
		enteringText(usernameElement, "lmdevalla@curious-unicorn-5zv0y8.com", "usename");
		
		
		enteringPasswordText(passwordElement, "Lakshmi@2009", "password");
		
		Thread.sleep(3000);
		clickButton(LoginButton);  
		
		Thread.sleep(3000);
		clickUsermenuDropdown();
		
		Thread.sleep(3000);
		By clickMyProfile = By.xpath("//*[@id=\"userNav-menuItems\"]/a[1]");
		clickOnButton(button, clickMyProfile);
		
		WebElement addPhoto = null;
		By path = By.xpath("//*[@id=\"uploadLink\"]");
		isElementDisplayed(addPhoto,path);
		
		 By clickEditButton = By.xpath("//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img");
		   WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.elementToBeClickable(clickEditButton));
		 clickOnButton(button, clickEditButton);
		
		 driver.switchTo().frame("contactInfoContentId");
		 /*driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		 By path1 = By.xpath("//*[@id=\"contactInfoTitle\"]");
		   WebDriverWait waitPath1 = new WebDriverWait(driver,30);
		   waitPath1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"contactInfoTitle\"]")));
		 isElementDisplayed(editProfilePopUp,path1);*/
		
		 implicitWait();
		 WebElement aboutElement = driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a"));
		 aboutElement.click();
		 
		 WebElement lastName = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		 lastName.clear();
		 lastName.click();
		 lastName.sendKeys("Paricherla");
		
		 
		 
	}

}
