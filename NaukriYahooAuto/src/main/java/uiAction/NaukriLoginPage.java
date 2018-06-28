package uiAction;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import testBase.SetUp;

public class NaukriLoginPage extends SetUp{

	public NaukriLoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(how=How.XPATH, using = "//div[contains(text(),'Login')]")
	WebElement loginButton;
	
	@FindBy(how=How.XPATH , using = ".//*[@name='email']")
	WebElement emailIdWindow;
	
	@FindBy(how=How.XPATH , using = ".//*[@name='PASSWORD']")
	WebElement passwordWindow;



	public void loginToNaukri(String emailId, String password) throws AWTException{
		loginButton.click();
		emailIdWindow.sendKeys(emailId);
		passwordWindow.sendKeys(password);
		roboEnter();
		webWait(5);
	}


}