package com.test.automation.TestProject.uiActions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.TestProject.helperUtility.TestBase;


public class TestPage_uiPage extends TestBase{
	public static final Logger log	=Logger.getLogger(TestPage_uiPage.class.getName());
	WebDriver driver;

	public TestPage_uiPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(how=How.CSS, using= "input[id$='from']")
	WebElement startfrom;
	
	@FindBy(how=How.CSS, using= "input[id$='To']")
	WebElement Dest;
	@FindBy(how=How.CSS, using= "input[id$='depart']")
	WebElement onCalender;
	@FindBy(how=How.XPATH,using ="//a[@title='Next']")
	WebElement nextButton;
	
	@FindBy(how=How.CSS, using= "input[id$='return']")
	WebElement returnCalender;
	@FindAll(value={@FindBy(how=How.XPATH, using ="//span[contains(@class,'ui-datepicker-month')]")})
	List<WebElement> monthPicker;
	
	@FindAll(value={@FindBy(how=How.XPATH, using ="//span[contains(@class,'ui-datepicker-year')]")})
	List<WebElement> yearPicker;
			
	
	@FindAll(value = {@FindBy(how=How.XPATH, using =".//*[@class='dateFilter hasDatepicker']/div/div[1]/table/tbody/tr/td[*]/a")})
	public List<WebElement> departdates;
	
	//dateFilterReturn hasDatepicker
	
	@FindAll(value = {@FindBy(how=How.XPATH, using =".//*[@class='dateFilterReturn hasDatepicker']/div/div[1]/table/tbody/tr/td[*]/a")})
	public List<WebElement> returndates;
	
	@FindBy(how = How.ID, using = "searchBtn")
    WebElement searcFlight;
	
	@FindBy(how=How.CSS, using =".pull-right.modify_search_toggle.ng-scope")
	WebElement modifySearch;
	
	@FindBy(how=How.XPATH, using ="//div[@class='modify_widget']/div[4]/div[1]")
	WebElement modifySearch1way;
	@FindBy(how=How.XPATH, using ="//div[@class='modify_widget']/div[4]/div[2]")
	WebElement modifySearch2Way;
	
	@FindBy(how=How.XPATH, using ="//div[@class='modify_widget']/div[5]/div/div[1]")
	WebElement modifySearchSourceCity;
	
	@FindBy(how=How.XPATH, using ="//div[@class='modify_widget']/div[5]/div/div[3]")
	WebElement modifySearchReturnCity;
	
	@FindBy(how=How.XPATH,using= "//a[starts-with(@ng-click,'showCalendar')]")
	WebElement modifySearchDepCalenderIcon;
	
	@FindBy(how=How.XPATH,using= "//div[@class='modify_widget']/div[9]/div/a[2]")
	WebElement modifySearchRetCalenderIcon;
	
	@FindAll(value = {@FindBy(how=How.XPATH, using ="//div[@id='ui-datepicker-div']/table/tbody/tr/td[*]/a[contains(@href,'#')]")})
	List <WebElement> modifySearchDate;
	
	@FindAll(value = {@FindBy(how=How.XPATH, using ="//span[@class='ui-datepicker-month']")})
	List <WebElement> modifySearchMonth;
	
	@FindAll(value = {@FindBy(how=How.XPATH, using ="//span[@class='ui-datepicker-year']")})
	List <WebElement> modifySearchYear;

	@FindBy(how=How.XPATH,using= "//a[contains(text(),'Search')]")
	WebElement modifySearchButton;
	
//multipleFlights method is to test multiple flight testcase. Test Data Reader from Excel sheet
	public void multipleFlights(String sourceplace, String destination){
		startfrom.clear();
		startfrom.sendKeys(sourceplace);
		log.info("SourcePlace is: "+sourceplace.toString());
		Dest.clear();
		Dest.sendKeys(destination);
		log.info("Destination is: "+destination.toString());
		//driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		//waitForElement(300,Dest);// we should write a webelement. Something like --> Until Logout is present or say in this case, until calendar icon opens.
	}

	//Below is for mmt calendar
	
	public void mmtCalendar(String bookingMonth, int bookingDate){
		onCalender.click();
		boolean flag = true;
		while(flag){
			try{
		WebElement ondate = driver.findElement(By.xpath("//div[contains(@class,'ui-datepicker-group') and descendant::span[contains(text(),'" +bookingMonth+"')]]/descendant::a[text()='"+bookingDate+"']"));
		if(ondate!=null){
			ondate.click();
			flag=false;
		}
		    } 
		catch (Exception e) { //Catches exception if no element found
		try {
		Thread.sleep(500);
		nextButton.click();
		}
		catch (InterruptedException e1) 
		      {
		 e1.printStackTrace();
		      }
		  }	
		}
			
	}
	////div[contains(@class,'ui-datepicker-group')]
	
	/*
	public void searchFlight(String sourceplace, String destination,String onyear,String onmonth,String onwdate, String returnyear,String returnmonth,String returnDate){
		
		startfrom.clear();
		startfrom.sendKeys(sourceplace);
		log.info("SourcePlace is: "+sourceplace.toString());
		Dest.clear();
		Dest.sendKeys(destination);
		log.info("Destination is: "+destination.toString());
		onCalender.click();
		for(WebElement year:yearPicker){
			String yr=year.getText();
			
			if(yr.equalsIgnoreCase(onyear))
			{
				year.click();
			
				break;
		}
		}
		
		for(WebElement mon:monthPicker){
			String month=mon.getText();
			
			if(month.equalsIgnoreCase(onmonth))
			{
				mon.click();
				break;
		}
		}
		for(WebElement ddat:departdates)
		{
			
			String date=ddat.getText();
			
			if(date.equalsIgnoreCase(onwdate))
			{
				ddat.click();
				break;
			}
			
		}
		returnCalender.click();
		for(WebElement year:yearPicker){
			String yr=year.getText();
			
			if(yr.equalsIgnoreCase(returnyear))
			{
				year.click();
				break;
		}
		}
		
		for(WebElement mon:monthPicker){
			String month=mon.getText();
			
			if(month.equalsIgnoreCase(returnmonth))
			{
				mon.click();
				break;
		}
		}
		for(WebElement ele:returndates){
			String date=ele.getText();
			
			if(date.equalsIgnoreCase(returnDate))
			{
				ele.click();
				break;
			}
		}
		searcFlight.click();
	}
	
	public void modifyFlight(String onyearms,String onmonthms,String onwdatems, String returnyearms,String returnmonthms,String returnDatems){
		//String sourcecity,String returnCity,
		modifySearch.click();
		//modifySearch2Way.click();
		//modifySearchSourceCity.clear();
		//modifySearchSourceCity.sendKeys(sourcecity);
		//modifySearchReturnCity.clear();
		//modifySearchReturnCity.sendKeys(returnCity);
		modifySearchDepCalenderIcon.click();
		for(WebElement year: modifySearchYear){
				String yr=year.getText();
				
				if(yr.equalsIgnoreCase(onyearms))
				{
					year.click();
					System.out.println("Source year is:"+yr);
					break;
				}
		}
		for(WebElement month: modifySearchMonth){
			String mon=month.getText();
			
			if(mon.equalsIgnoreCase(onmonthms))
			{
				month.click();
				System.out.println("Source mon is:"+mon);
				break;
			}
		}
		for(WebElement date: modifySearchDate){
			String dt=date.getText();
			
			if(dt.equalsIgnoreCase(onwdatems))
			{
				date.click();
				System.out.println("Source date is:"+dt);
				break;
			}
		}			
		modifySearchRetCalenderIcon.click();
		for(WebElement year: modifySearchYear){
			String yr=year.getText();
			
			if(yr.equalsIgnoreCase(returnyearms))
			{
				year.click();
				System.out.println("Ret year is:"+yr);
				break;
			}
		}
		for(WebElement month: modifySearchMonth){
			String mon=month.getText();
			
			if(mon.equalsIgnoreCase(returnmonthms))
			{
				month.click();
				System.out.println("Ret month is:"+mon);
				break;
			}
		}
		for(WebElement date: modifySearchDate){
			String dt=date.getText();
			
			if(dt.equalsIgnoreCase(returnDatems))
			{
				date.click();
				System.out.println("Ret date is:"+dt);
				break;
			}
		}
		modifySearchButton.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
*/

}
