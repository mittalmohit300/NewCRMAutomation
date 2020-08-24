package com.freecrm.stepDefinitions;

import com.freecrm.pages.CRMLogin;
import com.freecrm.pages.MessageOptionPage;
import com.freecrm.utility.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MessageOptionStepDefinitions extends BaseTest {

	CRMLogin login_obj;
	MessageOptionPage message_obj;

	public MessageOptionStepDefinitions() {
		super();
	}

	@Given("^Verify user loggedin$")
	public void verify_user_loggedin() {
		initialization();

		login_obj = new CRMLogin();
		message_obj = new MessageOptionPage();

		login_obj.user_credentials(prop.getProperty("username"), prop.getProperty("password"));
		login_obj.login_button();
	}

	@When("^user clicks on message option$")
	public void user_clicks_on_message_option() {
		message_obj.user_clicks_on_message_option();

	}

	@Then("^user enters message in \"([^\"]*)\"$")
	public void user_enters_message_in(String messagebox) {
		message_obj.user_enters_message_in(messagebox);
	}

	@Then("^user clicks on post button$")
	public void user_clicks_on_post_button() {
		message_obj.user_clicks_on_post_button();
	}

	@Then("^close browser$")
	public void close_browser() {
		message_obj.close_browser();
	}

}
