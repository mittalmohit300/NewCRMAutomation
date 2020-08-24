package com.freecrm.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.freecrm.utility.BaseTest;

public class LoginPage extends BaseTest {

	@FindBy(name = "username")
	WebElement txt_username;

	@FindBy(name = "password")
	WebElement txt_password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBtn;

	public LoginPage() {
		PageFactory.initElements(driver, this);
			}

	
	public String title() {
		
		String title = driver.getTitle();
		System.out.println(title);
		// Assert.assertEquals("CRMPRO - CRM software for customer relationship
		// management, sales, and support.", title);
		return title;
	}

	public void user_login(String username, String password) {

		txt_username.sendKeys(username);
		txt_password.sendKeys(password);

	}

	public void clicks_on_login_button() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);

	}

	public String click_on_home_page() {

		String title = driver.getTitle();
		System.out.println("Home Page title ::" + title);
		// Assert.assertEquals("CRMPRO", title);
		return title;

	}

	public void close_browser() {

		driver.close();

	}

	

}
