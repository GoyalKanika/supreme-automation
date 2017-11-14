package com.uiAutomation.Flipkart.Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot {
	String path;
	WebDriver driver;
	
	public screenshot(WebDriver driver){
		this.driver=driver;
	}
	
	public void takescreenshot(String path) throws IOException{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(path));
	}

}
