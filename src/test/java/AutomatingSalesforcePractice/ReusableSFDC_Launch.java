package AutomatingSalesforcePractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReusableSFDC_Launch {
	
  public static void SFDCLaunch() throws InterruptedException {
	  String expectedTitle = "Salesforce";
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://login.salesforce.com/");
	  String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			
			System.out.println("title matched");
		}
		
		else {
			
			System.out.println("title matched");
		}
		 Thread.sleep(4000);
	  
  }
}
