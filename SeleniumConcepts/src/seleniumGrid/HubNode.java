package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class HubNode {
	
	WebDriver driver;
	String nodeURL;
	String baseURL;
	
	@BeforeTest
	public void setUp() throws MalformedURLException{
		baseURL = "https://gsweb-perfmon.gatewayedi.com";
		nodeURL = "http://10.110.57.119:5566/wd/hub";
		new DesiredCapabilities();
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.VISTA);
		System.setProperty("webdriver.gecko.driver","E:\\SeleniumGrid\\SeleniumServer\\geckodriver.exe");
		driver = new RemoteWebDriver(new URL(nodeURL), cap);
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void test1(){
		driver.get(baseURL);
		String title = driver.getTitle();
		System.out.println(title);
	}

}
