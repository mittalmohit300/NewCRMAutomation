package com.freecrm.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.utility.BaseTest;

public class CRMLogin extends BaseTest {
	
	@FindBy(name = "username")
	WebElement txt_username;

	@FindBy(name = "password")
	WebElement txt_password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBtn;
	
	public CRMLogin() {
		PageFactory.initElements(driver, this);
	}
	
	public void user_credentials(String username, String password) {

		txt_username.sendKeys(username);
		txt_password.sendKeys(password);

	}

	public void login_button() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);

	}

	

}
