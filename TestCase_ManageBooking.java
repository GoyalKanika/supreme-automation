package com.test.automation.TestProject.homepage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.TestProject.helperUtility.TestBase;
import com.test.automation.TestProject.uiActions.TestPage_uiPage;

public class TestCase_ManageBooking extends TestBase{
	
	public static final Logger log	=Logger.getLogger(TestCase_ManageBooking.class.getName());
	//WebDriver driver; This is no longer needed as we are inheriting the properties of TestBase class where drier is defined PUBLIC
	TestPage_uiPage booking;
	@BeforeTest
	public void setUp() throws InterruptedException{
	launchbrowser(); //method in TestBase class. TestBase is my most important class.It again contains - 3 methods as of now - LaunchBrowser, selectBrowser, GetURL.
	}
	
	@Test
	public void searchFlight(){
		/* 
		//Since PageFactory is defined in the page class constructor --TestPage_ManageBooking , we are not calling it here.If it was not defined in the page class, then do the below -->
		TestPage_ManageBooking booking = PageFactory.initElements(driver, TestPage_ManageBooking.class);
		booking.searchFlight("Bangalore", "Mangalore");*/ 
		//log.info("==========Starting Test searchFlight=======");
		booking = new TestPage_uiPage(driver);
		//booking.searchFlight("Bangalore", "Mangalore","2017","December","7","2018","January","12");
		booking.multipleFlights("Bangalore", "Chennai");
		booking.mmtCalendar("January", 12);
		/*TestPage_uiPage modify= new TestPage_uiPage(driver);
		modify.modifyFlight("2018", "January", "01", "2018", "Feburary", "10");*/
		//log.info("==========Finishing Test searchFlight=======");
	}
	@AfterTest
	public void endTest(){
		driver.quit();
	}
	
}
