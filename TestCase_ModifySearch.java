package com.test.automation.TestProject.homepage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.TestProject.helperUtility.TestBase;
import com.test.automation.TestProject.uiActions.TestPage_uiPage;

public class TestCase_ModifySearch extends TestBase {

	@BeforeTest
	public void setUp(){
		launchbrowser();
	}
	
	@Test()
	public void modifySearch(){
		TestPage_uiPage modify= new TestPage_uiPage(driver);
		//modify.modifyFlight("2018", "January", "01", "2018", "Feburary", "10");
	}//"Goa", "Chennai", 
	
	@AfterTest
	public void endTest(){
	
	driver.close();

	}
}