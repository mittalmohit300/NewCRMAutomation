package com.freecrm.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.freecrm.utility.BaseTest;
import com.freecrm.utility.Frame;

public class KnowledgeBasePage extends BaseTest{
	
	@FindBy(xpath = "//a[text()='Knowledge Base']")

	WebElement click_knowledge;

	@FindBy(xpath = "//a[@id='itemTextLink1']")

	WebElement click_sdafe;

	@FindBy(xpath = "//select[@name='node_id']")

	WebElement parent_node;
	
	@FindBy(xpath="//select[@name='node_type']")
	WebElement node_type;
	
	@FindBy(xpath="//input[@id='title']")
	WebElement node_title;
	
	@FindBy(xpath="//input[@value='Save' and @type='submit']")
	WebElement save;
	
	public KnowledgeBasePage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
public void click_on_knowledge_option() {
	
	Frame.frame();
	click_knowledge.click();
	click_sdafe.click();
	
}
	
public void click_on_parent_node() {
	Select select= new Select(parent_node);
	select.selectByVisibleText("sdafe");
	
	Select select1= new Select(node_type);
	select1.selectByVisibleText("Folder");
}

public void enter_text_node_title(String Node_Title) {
	node_title.sendKeys(Node_Title);
	save.click();
}

public void teardown() {
	driver.close();
}

}
