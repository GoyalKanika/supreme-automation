package selenesePractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass1 {

	static WebDriver driver;
	static Robot robo ;
	public static void main(String[] args) throws AWTException {
		robo = new Robot();
		initClass();
		hitEnter();
		tearDown();
	}
	
		public static void initClass(){
			String baseURL = "http://tsweb-node03:8117/LogOn?ReturnUrl=%2f";
			//String baseURL = "https://www.google.com/";
			System.setProperty("webdriver.chrome.driver","E:\\eclipse\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(baseURL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			
			driver.findElement(By.id("UserName")).sendKeys("6777");
			driver.findElement(By.id("Password")).sendKeys("gedi back door");
		}
		public static void hitEnter() throws AWTException{
		// Robot Class to hit Enter and release Enter 
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		}
		
		/*public static void capPress(){
			String title =driver.getTitle();
			System.out.println(title);
			driver.findElement(By.name("q")).sendKeys("selenium");
			
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_A);
			
			
			
			robo.keyRelease(KeyEvent.VK_A);
			robo.keyRelease(KeyEvent.VK_CONTROL);
		}*/
	
		public static void tearDown(){
			driver.close();
		}

}
