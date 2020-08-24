package com.freecrm.stepDefinitions;

import org.junit.Assert;

import com.freecrm.pages.CRMLogin;
import com.freecrm.pages.ContactPage;
import com.freecrm.pages.LoginPage;
import com.freecrm.utility.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactStepDefinitions extends BaseTest {

	LoginPage login;
	ContactPage contact_obj;
    CRMLogin login_obj;
	
	public ContactStepDefinitions() {
		super();

	}

	/*
	 * @Given("^user already on Login Page$") public void
	 * user_already_on_Login_Page() {
	 * 
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\mohit.mittal.cog\\Desktop\\Work\\chromedriver.exe"); driver = new
	 * ChromeDriver();
	 * 
	 * driver.manage().window().maximize();
	 * driver.get("http://classic.freecrm.com/");
	 * driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 * 
	 * }
	 * 
	 * @When("^title login page is Free CRM$") public void
	 * title_login_page_is_Free_CRM() {
	 * 
	 * String title = driver.getTitle(); System.out.println(title); Assert.
	 * assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support."
	 * , title);
	 * 
	 * }
	 * 
	 * @Then("^user should enter \"([^\"]*)\" and \"([^\"]*)\"$") public void
	 * user_should_enter_and(String username, String password) {
	 * 
	 * driver.findElement(By.name("username")).sendKeys(username);
	 * driver.findElement(By.name("password")).sendKeys(password);
	 * 
	 * }
	 * 
	 * @Then("^user should clicks on login button$") public void
	 * user_should_clicks_on_login_button() {
	 * 
	 * WebElement loginBtn =
	 * driver.findElement(By.xpath("//input[@type='submit']")); JavascriptExecutor
	 * js = (JavascriptExecutor) driver; js.executeScript("arguments[0].click();",
	 * loginBtn);
	 * 
	 * }
	 */

	@Given("^user on home page$")
	public void user_on_home_page() {

		initialization();
		login = new LoginPage();
		contact_obj = new ContactPage();
		login_obj=new CRMLogin();
		
		login_obj.user_credentials(prop.getProperty("username"), prop.getProperty("password"));
		login_obj.login_button();
		
		String actualtitle = contact_obj.user_on_home_page();
		System.out.println("Home Page title ::" + actualtitle);
		Assert.assertEquals("CRMPRO", actualtitle);
	}

	@When("^user mouseover on contacts button$")
	public void user_mouseover_on_contacts_button() {
		contact_obj.clickon_contacts_button();
	}

	@Then("^user click on new contact button$")
	public void user_click_on_new_contact_button() {

		contact_obj.clickon_contact_button();
	}

	@Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_contacts_details(String firstname, String lastname, String position) {
		contact_obj.contacts_details(firstname, lastname, position);
	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		contact_obj.close_browser();
	}
}
