package com.freecrm.stepDefinitions;

import org.junit.Assert;
import com.freecrm.pages.CRMLogin;
import com.freecrm.pages.LoginPage;
import com.freecrm.pages.TaskPage;
import com.freecrm.utility.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaskStepDefinitions extends BaseTest {

	LoginPage login;
	CRMLogin login_obj;
	TaskPage task_obj;
	
	public TaskStepDefinitions() {
		super();
	}

	@Given("^Verify login functionlity$")
	public void Verify_login_functionlity() {
		initialization();
		login = new LoginPage();
		login_obj = new CRMLogin();
		task_obj = new TaskPage();

		login_obj.user_credentials(prop.getProperty("username"), prop.getProperty("password"));
		login_obj.login_button();

	}

	@When("^verify home page$")
	public void verify_home_page() {
		String title = task_obj.Verify_home_page_title();
		System.out.println("Home Page title ::" + title);
		Assert.assertEquals("CRMPRO", title);
	}

	@Then("^verfiy task button$")
	public void verfiy_task_button() {

		task_obj.verfiy_task_button();
	}

	@Then("^verify new task button$")
	public void verify_new_task_button() {

		task_obj.verify_new_task_button();
	}

	@Then("^capture task details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void capture_task_details_and_and(String title, String completion, String description) {
		task_obj.capture_task_details_and_and(title, completion, description);
	}

	@Then("^Close browser$")
	public void close_browser() {
		task_obj.close_browser();
	}

}
