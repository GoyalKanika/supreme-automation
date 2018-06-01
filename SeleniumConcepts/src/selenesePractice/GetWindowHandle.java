package selenesePractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetWindowHandle {
	static WebDriver driver;
	static String URL;
	static Robot robo;
	public static void main(String[] args) throws InterruptedException, AWTException {
		robo = new Robot();
		initBrowser();
		windowHandle();
		parentWindow();
		//robotClass();
	//	tearDown();
}
	public static void initBrowser(){
		URL = "https://www.naukri.com/";
		System.setProperty("webdriver.chrome.driver","E:\\eclipse\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}
	
	public static void windowHandle(){
		String parentWindow = driver.getWindowHandle();
		 Set<String> allWindows = driver.getWindowHandles();
		 String subWindow = null;
		 
		 Iterator<String> windowIterator = allWindows.iterator();
		 while(windowIterator.hasNext()){
			 subWindow = windowIterator.next();
			 if(!subWindow.equalsIgnoreCase(parentWindow)){
				 driver.switchTo().window(subWindow);
				 driver.close();
			 }			 
		 }
		 driver.switchTo().window(parentWindow);
		 //driver.findElement(By.id("Block")).click();
	}	
	public static void parentWindow(){
		driver.findElement(By.id("geoLocPopUp")).click();
	}
	
	public static void robotClass(){
		robo.keyPress(KeyEvent.VK_CAPS_LOCK); 
		driver.findElement(By.xpath("//*[@id='qsbClick']/span[1]")).sendKeys("qa");
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_CAPS_LOCK);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
	}
	
	
	
	public static void tearDown(){
		driver.close();
	}
	
}
