package com.uiAutomation.Flipkart.customListener;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.uiAutomation.Flipkart.TestBase.HelperUtility;

public class Listener extends HelperUtility implements ITestListener {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		
		String methodName = result.getName();
		
		if(!result.isSuccess()){
			File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
			String reportDirectory = new File(System.getProperty("E:/supreme-automation/Flipkart/src/main/java/com/uiAutomation/Flipkart/Screenshot")).getAbsolutePath();
			File destFile = new File((String) reportDirectory + "/failure_screenshots/" +methodName + "_" + formater.format(calendar.getTime()) + ".png");
			
			
				FileUtils.copyFile(srcFile, destFile);
				Reporter.log("<a href='" +destFile.getAbsolutePath()+ "'> <img src ='" +destFile.getAbsolutePath() +"' height ='100' width ='100'/> </a>");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
