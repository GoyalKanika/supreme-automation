package homePage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testBase.SetUp;

public class LaunchNaukri extends SetUp{
	
	@BeforeTest
	public void init(){
		getBrowser("chrome");
	}
	
	@Test	
	public void launchNaukri(){
		getApplication("https://www.naukri.com");
		webWait(5);
		windowHandle();
	}
	
	@AfterTest
	public void tearDown(){
		quitDriver();
	}

}
