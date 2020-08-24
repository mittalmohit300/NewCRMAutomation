package com.freecrm.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.freecrm.utility.BaseTest;
import com.freecrm.utility.Frame;

public class ContactPage extends BaseTest {

	@FindBy(xpath ="//a[text()='Contacts']")
	WebElement contacts;

	@FindBy(xpath = "//a[text()='New Contact']")
	WebElement newcontact;

	@FindBy(id = "first_name")
	WebElement first_name;

	@FindBy(id = "surname")
	WebElement surname;

	@FindBy(id = "company_position")
	WebElement company_position;

	@FindBy(xpath = "//input[@type='submit' and @value='Save']")
	WebElement save;

	public ContactPage() {
		PageFactory.initElements(driver, this);
	}

	public String user_on_home_page() {

		String title = driver.getTitle();
		return title;

	}

	public void clickon_contacts_button() {
		Frame.frame();
		Actions action = new Actions(driver);
		action.moveToElement(contacts).build().perform();
	}

	public void clickon_contact_button() {
		newcontact.click();
	}

	public void contacts_details(String firstname, String lastname, String position) {
		first_name.sendKeys(firstname);
		surname.sendKeys(lastname);
		company_position.sendKeys(position);
		save.click();
	}

	public void close_browser() {
		driver.quit();
	}

}
