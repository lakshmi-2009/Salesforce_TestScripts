package com.tests.seleniumAutomation.tests;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

import com.tests.seleniumAutomation.utilities.Constants;
public class AddingCromeExtensionsCRX  {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
    	//options.addExtensions(new File("/Users/lakshmidevalla/Downloads/Grammarly-Grammar-Checker-and-Writing-App.crx"));
    	options.addExtensions(new File ("/Users/lakshmidevalla/Downloads/Selenium-IDE.crx"));
    	
    	
    	System.out.println("extension added");
    	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		Thread.sleep(4000);
		
        driver.close();
	}

}
