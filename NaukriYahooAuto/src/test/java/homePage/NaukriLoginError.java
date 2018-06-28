package homePage;

import java.awt.AWTException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testBase.SetUp;
import uiAction.NaukriLoginPage;

public class NaukriLoginError extends SetUp{
	@BeforeTest
	public void setUp(){
		getBrowser("chrome");
		getApplication("https://www.naukri.com");
		windowHandle();
		webWait(5);
	}
	@Test()
	public void validNaukriLogin() throws AWTException{
		NaukriLoginPage Nauklogin = new NaukriLoginPage(driver);
		Nauklogin.loginToNaukri("kanika_goyal490@yahoo.com", "Kanika@123");
		webWait(10);
	}
	@AfterTest
	public void teatDown(){
		driver.quit();
	}
}
