package javaConcept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import helperUtility.Browser;

public class Screenshot {
	public static void main(String[] args){
			WebDriver input = Browser.startbrowser("chrome", "http://www.google.com");
			File src= ((TakesScreenshot)input).getScreenshotAs(OutputType.FILE);
			try {
				 // now copy the  screenshot to desired location using copyFile //method
				FileUtils.copyFile(src, new File("E:\\Selenium\\Screenshot.png"));
				}
			catch (IOException e)
			 {
			  System.out.println(e.getMessage());
			 
			 }
			
					
	}

}
