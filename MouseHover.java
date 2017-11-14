package javaConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helperUtility.Browser;

public class MouseHover {
	
	public static void main(String args[]){
	WebDriver driver = Browser.startbrowser("chrome", "https://www.flipkart.com/");
	
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	WebElement elex=driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/span"));
	WebElement selx = driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[2]/a"));
	
	Actions act=new Actions(driver);
	act.moveToElement(elex).perform();
	WebDriverWait wait = new WebDriverWait(driver,5);
	wait.until(ExpectedConditions.visibilityOf(selx));
	selx.click();
	
	}
	
}
