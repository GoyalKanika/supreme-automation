package com.uiAutomation.Flipkart.homepage;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.uiAutomation.Flipkart.ExcelReader.Excel_reader;
import com.uiAutomation.Flipkart.TestBase.HelperUtility;
import com.uiAutomation.Flipkart.uiAction.TestPage_uiPage;

public class TestCase_Login extends HelperUtility{
	
	TestPage_uiPage loginfunctionality;
	//String emailaddress="kanika_goyal490@yahoo.com";
	//String password = "Kanika@123";
	String Screenshot_path = "E://Screenshot.png";
	Excel_reader excel;
	
	@DataProvider(name="reading from Excel.")
		public String[][] getTestData() throws IOException{
		String[][] testdata = loadTestData("TestData.xlsx","flipkartdata");
		return testdata;
	}
	@BeforeTest
	public void setUp() throws InterruptedException{
		launchBrowser();
	}
	
	@Test(dataProvider ="reading from Excel.")
	public void login(String emailaddress, String password) throws IOException{
		loginfunctionality = new TestPage_uiPage(driver);
		//loginfunctionality.loginToFlipkart(emailaddress, password);
		loginfunctionality.hoverfunctionality();
		loginfunctionality.captureScrenshot(Screenshot_path);
	}
	
	@AfterTest
	public void endTest(){
		//driver.quit();
	}

}
