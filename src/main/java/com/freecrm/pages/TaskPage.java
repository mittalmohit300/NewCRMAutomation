package com.freecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.freecrm.utility.BaseTest;
import com.freecrm.utility.Frame;

public class TaskPage extends BaseTest {

	@FindBy(xpath = "//a[text()='Tasks']")
	WebElement tasks;

	@FindBy(xpath = "//a[text()='New Task']")
	WebElement newcontact;

	@FindBy(id = "title")
	WebElement txt_title;

	@FindBy(id = "completion")
	WebElement txt_completion;

	@FindBy(xpath = "//select[@name='priority']")
	WebElement list_priority;

	@FindBy(id = "description")
	WebElement txt_description;

	@FindBy(xpath = "(//input[@value='Save'])[2]")
	WebElement save_btn;

	public TaskPage() {
		PageFactory.initElements(driver, this);

	}

	public String Verify_home_page_title() {
		return driver.getTitle();
	}

	public void verfiy_task_button() {

		Frame.frame();
		Actions action = new Actions(driver);
		action.moveToElement(tasks).build().perform();

	}

	public void verify_new_task_button() {

		newcontact.click();

	}

	public void capture_task_details_and_and(String title, String completion, String description) {

		txt_title.sendKeys(title);
		txt_completion.sendKeys(completion);
		Select select = new Select(list_priority);
		select.selectByVisibleText("High");
		txt_description.sendKeys(description);
		save_btn.click();

	}

	public void close_browser() {
		driver.quit();
	}

}