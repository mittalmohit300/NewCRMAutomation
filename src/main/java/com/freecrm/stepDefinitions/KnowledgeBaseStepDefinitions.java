package com.freecrm.stepDefinitions;

import com.freecrm.pages.KnowledgeBasePage;
import com.freecrm.pages.LoginPage;
import com.freecrm.utility.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class KnowledgeBaseStepDefinitions extends BaseTest {
	LoginPage loginPage;
	KnowledgeBasePage know_obj;
	
	public KnowledgeBaseStepDefinitions() {
		super();
		
		}
	
	@Given("^Verify customer loggedin$")
	public void verify_customer_loggedin() {
		initialization();
		 loginPage=new LoginPage();		
		know_obj= new KnowledgeBasePage();
		loginPage.user_login(prop.getProperty("username"), prop.getProperty("password"));
		loginPage.clicks_on_login_button();
	}
	
	@When("^user clicks on knowledge base and sdafe option$")
	public void user_clicks_on_knowledge_base_and_sdafe_option() {
		know_obj.click_on_knowledge_option();
		
			}

	@Then("^user selects Parent node and node type from tree node$")
	public void user_selects_Parent_node_and_node_type_from_tree_node() { 
		know_obj.click_on_parent_node();
		
	}

	@Then("^user enters \"([^\"]*)\" and clicks on save button$")
	public void user_enters_and_clicks_on_save_button(String Node_Title) {
		know_obj.enter_text_node_title(Node_Title);
		know_obj.teardown();
		
	}


}
