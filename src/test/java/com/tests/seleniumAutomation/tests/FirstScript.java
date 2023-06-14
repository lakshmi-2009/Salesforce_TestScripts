package com.tests.seleniumAutomation.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.internal.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String expectedTitle = "Google";

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			
			System.out.println("title matched");
		}
		
		else {
			
			System.out.println("title matched");
		}
		
		By searchBox=By.name("q");
		driver.findElement(searchBox);
		WebElement searchBoxElement = driver.findElement(searchBox);
		searchBoxElement.clear();
		searchBoxElement.sendKeys("Basis Scottsdale");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		By searchButton = By.name("btnK");
		
		WebElement button = driver.findElement(searchButton);
		button.click();
		
		 By Imgbutton = By.className("O3S9Rb");
		 WebElement imageButton = driver.findElement(Imgbutton);
		 imageButton.click();
		
		 try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.close();
	}
	

}
