package com.home.bdd;

import static org.junit.Assert.assertTrue;

import com.home.common.webDriver;

import io.cucumber.java.en.Given;

public class LoginStepDefinition {

	webDriver driver;
	
	public LoginStepDefinition(webDriver driver) {
		this.driver = driver;
		
	}

@Given("User opens the Application URL")
public void user_opens_the_Application_URL() {
    
   String title= driver.launchApplication();
   assertTrue("Application title incorrect", !title.equals(""));
}

}
