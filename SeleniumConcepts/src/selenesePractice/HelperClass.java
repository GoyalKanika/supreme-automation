package selenesePractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class HelperClass {
	/*public static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException{

	 
	 		String URL = "http://www.DemoQA.com";
	 		String Node = "http://192.168.1.164:4444/wd/hub";
	 		DesiredCapabilities cap = DesiredCapabilities.firefox();
	 
	 		driver = new RemoteWebDriver(new URL(Node), cap);
	 
	 		driver.navigate().to(URL);
	 		Thread.sleep(5000);
	 		driver.quit();*/
	 		public static WebDriver driver;
	 		
	 		static String browser="chrome";
	 		static String URL="https://www.naukri.com/";
	
	public static void launchBrowser() throws InterruptedException{
		getBrowser(browser);
		getURL(URL);
		Thread.sleep(1000);
		
	}
	
	public static void getBrowser(String browser){
		
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
	
	public static void getURL(String URL){
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);		
	}
}