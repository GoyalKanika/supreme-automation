package com.uiAutomation.Flipkart.TestBase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.uiAutomation.Flipkart.ExcelReader.Excel_reader;
import com.uiAutomation.Flipkart.Screenshot.screenshot;
import com.uiAutomation.Flipkart.homepage.TestCase_Login;

public class HelperUtility {

	public static final Logger log	=Logger.getLogger(HelperUtility.class.getName());
	public WebDriver driver;
	
	String browser="chrome";
	String URL="https://www.flipkart.com/";
	Excel_reader loadexcel;
	screenshot Screen;
	
	public void launchBrowser() throws InterruptedException{
		getBrowser(browser);
		getURL(URL);
		Thread.sleep(1000);
		String log4jConfPath = "log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
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
	
	public String[][] loadTestData(String ExcelName,String Sheetname) throws IOException{
		
		String path = "E:/supreme-automation/Flipkart/src/main/java/com/uiAutomation/Flipkart/data/"+ ExcelName;
		loadexcel = new Excel_reader(path);
		String data[][]= loadexcel.getExceldata(Sheetname, ExcelName);
		return data;
		
	}
	
	public void captureScrenshot(String path) throws IOException{
		Screen = new screenshot(driver);		
		Screen.takescreenshot(path);
	}
	
}
