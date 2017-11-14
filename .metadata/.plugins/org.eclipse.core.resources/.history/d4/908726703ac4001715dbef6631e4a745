package com.uiAutomation.Flipkart.TestBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HelperUtility {

	public WebDriver driver;
	
	String browser="chrome";
	String URL="https://www.flipkart.com/";
	
	public void launchBrowser(){
		getBrowser(browser);
		getURL(URL);
	}
	
	public void getBrowser(String browser){
		
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","C://Program Files (x86)//eclipse/Webdriver//chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("internet explorer")){
			System.setProperty("webdriver.ie.driver","C://Program Files (x86)//eclipse/Webdriver//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
	}
	
	public void getURL(String URL){
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);		
	}
	
}
