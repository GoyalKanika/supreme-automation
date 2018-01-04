package com.Cucumber.TestRunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "Login.feature",
				glue = "com.Cucumber.StepDefinition"
		)
public class Login_testRunner {

}
