package com.Cucumber.StepDefinition;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Cucumber.TestUtility.SetUp;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_stepDefinition extends SetUp {

	@Given("^User launches ClientSite in browser$")
	public void user_launches_ClientSite_in_browser() {
		launchbrowser();
	    System.out.println("User launches ClientSite in browser");
	}

	@When("^User enters valid username and password$")
	public void user_enters_valid_username_and_password() {
		driver.findElement(By.id("UserName")).sendKeys("6777");
		driver.findElement(By.id("Password")).sendKeys("gedi back door");
		System.out.println("User enters valid username and password");
	}

	@When("^hits enter$")
	public void hits_enter() throws Throwable {
		driver.findElement(By.id("login-button")).click();
		System.out.println("hits enter");
	}

	@Then("^user is navigated to clientsite home page\\.$")
	public void user_is_navigated_to_clientsited_home_page() {
		WebElement TxtBoxContent = driver.findElement(By.id("NavCtrl_navHome"));
		if(TxtBoxContent.isDisplayed()){
		System.out.println("User is on homepage");
		}
	}
	@When("^User enters invalid username and password$")
	public void user_enters_invalid_username_and_password(){
		driver.findElement(By.id("UserName")).sendKeys("6777");
		driver.findElement(By.id("Password")).sendKeys("gedibackdoor");
	}

	@Then("^user recieved an error\\.$")
	public void user_recieved_an_error(){
		String verifyError = driver.findElement(By.xpath("//li[contains(text(),'Incorrect Username or Password')]")).getText();
		Assert.assertEquals(verifyError, "Incorrect Username or Password");
		System.out.println("User gets an error");
	}
	@When("^User enters username (.*)$")
	public void User_enters_username(String username){
		driver.findElement(By.id("UserName")).sendKeys(username);
	}
	@When("^User enters password (.*)$")
	public void User_enters_password(String password){
		driver.findElement(By.id("Password")).sendKeys(password);
	}

	@After
	public void endTest(){
		driver.quit();
	}
}