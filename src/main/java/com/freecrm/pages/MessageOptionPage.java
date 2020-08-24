package com.freecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.utility.BaseTest;
import com.freecrm.utility.Frame;

public class MessageOptionPage extends BaseTest{
	
	
	@FindBy(xpath="//div[@id='navMenu'] //a[@title='Messages']")
	WebElement message_btn;
	
	@FindBy(xpath="//table[@class='datacard'] //td[@class='datalistrow'][4]/a[1]")
	WebElement edit_btn;
	
	@FindBy(xpath="//textarea[@id='msg']")
	WebElement txt_message;
	
	@FindBy(xpath="//input[@value='Post']")
	WebElement post_btn;
	
	
	
	public MessageOptionPage() {
		
		PageFactory.initElements(driver, this);
	}

	
	public void user_clicks_on_message_option()  {
		Frame.frame();
	    message_btn.clear();
	    message_btn.click();
	    edit_btn.click();
	}

	public void user_enters_message_in(String messagebox)  {
		txt_message.sendKeys(messagebox);
	   
	}

	
	public void user_clicks_on_post_button()  {
		post_btn.click();	   
	}

	
	public void close_browser()  {
		driver.close();
	    
	}
	
}
