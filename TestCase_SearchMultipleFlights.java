package com.test.automation.TestProject.homepage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.automation.TestProject.helperUtility.TestBase;
import com.test.automation.TestProject.uiActions.TestPage_uiPage;

public class TestCase_SearchMultipleFlights extends TestBase{
	
	TestPage_uiPage booking;
	//String sourceplace ="Bangalore";
	//String destination ="New delhi";
	
	@DataProvider(name="reading from Excel.")
	public String[][] getTestData(){
		String[][] testdata = getdata("TestData.xlsx","MakeMyTripdata");
		return testdata;
	}
	
	@BeforeTest
	public void setUp() throws InterruptedException{
	launchbrowser();
	}
	
	@Test(dataProvider ="reading from Excel.")
	public void searchMultipleFlight(String sourceplace, String destination){
	booking = new TestPage_uiPage(driver);
	booking.multipleFlights(sourceplace, destination);
	}
	
	@AfterTest
	public void endTest(){
		driver.quit();
	}

}
