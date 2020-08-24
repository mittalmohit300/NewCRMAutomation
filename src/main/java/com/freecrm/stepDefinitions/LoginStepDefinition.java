package com.freecrm.stepDefinitions;


import org.junit.Assert;


import com.freecrm.pages.LoginPage;
import com.freecrm.utility.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends BaseTest {

	LoginPage login;

	 public LoginStepDefinition() {
		super();
	}

	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {
			
		initialization();
		 login= new LoginPage();
	
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {

		String actualtitle=login.title();
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", actualtitle);

	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) {

		login.user_login(username, password);

	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {

		login.clicks_on_login_button();

	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
    String homepagetitle=login.click_on_home_page();
		Assert.assertEquals("CRMPRO", homepagetitle);

	}
	
	@Then("^close the browser$")
	public void close_the_browser()  {
		login.close_browser();
	  
	}

}
