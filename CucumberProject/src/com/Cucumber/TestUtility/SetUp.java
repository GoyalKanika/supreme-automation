package com.Cucumber.TestUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SetUp {
	
	public WebDriver driver;
	String URL = "http://tsweb-node03:8084/LogOn";
	String browser="chrome";
	
	public void launchbrowser(){
		selectBrowser(browser);
		getURL(URL);
	}

	public void selectBrowser(String browser){
		
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//eclipse//chromedriver.exe");
			driver = new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}
		if(browser.equalsIgnoreCase("IE")){
		System.setProperty("webdriver.ie.driver","E://Selenium//Drivers//IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		}
	}
	
	public void getURL(String URL){
		
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
}
