package AutomatingSalesforcePractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
public class TC05_TC_2_CheckUserMenuDropDown {

	
		public static void main(String[] args) throws InterruptedException {
			
			String expectedTitle = "Salesforce";

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://curious-unicorn-5zv0y8-dev-ed.my.salesforce.com/setup/forcecomHomepage.apexp?setupid=ForceCom");
			
			String actualTitle = driver.getTitle();
			
			if(expectedTitle.equals(actualTitle)) {
				
				System.out.println("title matched");
			}
			
			else {
				
				System.out.println("title matched");
			}
			
			   Thread.sleep(4000);
			
		      /* By username = By.name("username");
		       WebElement usernameElement = driver.findElement(username);
		       usernameElement.clear();
		       usernameElement.sendKeys("lmdevalla@curious-unicorn-5zv0y8.com");*/
		      
			   WebElement usernameElement = driver.findElement(By.name("username"));
			   usernameElement.clear();
		       usernameElement.sendKeys("lmdevalla@curious-unicorn-5zv0y8.com");
		       
		       //write a method for username.
		       
		       
		       
		       
		       By password = By.name("pw");
		       WebElement passwordElement = driver.findElement(password);
		       passwordElement.clear();
		       passwordElement.sendKeys("Lakshmi@2009");
			
		      // Thread.sleep(4000);
		      /* By button = By.id("Login");
	           WebElement loginButton = driver.findElement(button);
	           loginButton.click();
 
	           Thread.sleep(4000);
	           
	           By userMenu = By.xpath("//*[@id=\"userNavLabel\"]");
	           WebElement userMenuDropdown = driver.findElement(userMenu);
	           userMenuDropdown.click();
	           Actions action = new Actions(driver);
	          
	           //driver.close();*/
	           
	           WebElement rememberMe = driver.findElement(By.xpath("//input[@class=\"r4 fl mr8\"]"));
	 		  if(rememberMe.isSelected()) {
	 			  System.out.println("Rememberme Check box is selected");
	 		  }
	 		  else {
	 			  rememberMe.click();
	 			  System.out.println("Rememberme Check box is clicked");
	 		  }
	 		  
	           
	           
	}

}
