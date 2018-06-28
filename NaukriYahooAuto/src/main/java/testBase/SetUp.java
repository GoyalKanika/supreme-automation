package testBase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetUp {
	
	public WebDriver driver;
	public String url;
	public Robot robo;

	public void launchApplication(){
		getBrowser("Chrome");
		getApplication("https://www.naukri.com");
		windowHandle();
		webWait(10);
	}	
	// Launching Browser
	public void getBrowser(String browserName){
		
		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","E:\\eclipse\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}		
	}
	// Navigating to application URL
	public void getApplication(String url){
		driver.get(url);
		driver.manage().window().maximize();
	}
	// Implicitly Waiting for some seconds before performing any actions 
	public void webWait(int time){
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	//Manage window handles
	public void windowHandle(){
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		String subWindow = null;
		Iterator<String> iterator = allWindows.iterator();
		while(iterator.hasNext()){
			subWindow = iterator.next();
			if(!subWindow.equalsIgnoreCase(parentWindow)){
				driver.switchTo().window(subWindow);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
	}
	public void quitDriver(){
		driver.quit();
	}
	
	public void roboEnter() throws AWTException{
		robo = new Robot();
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
	}
	
}
