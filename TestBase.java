package com.test.automation.TestProject.helperUtility;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.automation.TestProject.ExcelReader.Excel_Reader;



public class TestBase {
	public static final Logger log	=Logger.getLogger(TestBase.class.getName());	
		public WebDriver driver;
		String URL = "https://www.makemytrip.com";
		String browser="chrome";
		Excel_Reader excel;
		
	
	public void launchbrowser(){
		selectBrowser(browser);
		getURL(URL);
		String log4jConfPath = "log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
	}
	
	public void selectBrowser(String browser){
		log.info("Browser is :"+browser);
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "E://Selenium//Drivers//chromedriver.exe");
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
		log.info("Naigating to :"+URL);
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}

	public String[][] getdata(String ExcelName,String sheetName){
		String path = "E:/SeleniumTutorial/TestProject/src/main/java/com/test/automation/TestProject/data/"+ExcelName;
		excel=new Excel_Reader(path);
		String [][] data = excel.getDataFromSheet(sheetName,ExcelName);
		return data;
	}
	
	public void waitForElement(int timeOutInSeconds, WebElement element){
		WebDriverWait wait =new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	
	
	
	
	
	
	
	
	
}
