package com.practice.Interview.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.practice.Interview.helper.TestBase;

public class LinkedInLoginPage extends TestBase {
	// Adde 3 set of element declaration with and without How using @FindBy
	@FindBy(id = "username")
	public WebElement username;

	@FindBy(how = How.ID, using = "username")
	public WebElement usernameWithHow;

	@FindBy(id = "password")
	public WebElement passwrod;

	@FindBy(how = How.ID, using = "password")
	public WebElement passwrodWithHow;

	@FindBy(xpath = "//*[@type='submit']")
	public WebElement loginButton;

	@FindBy(how = How.XPATH, using = "//*[@type='submit']")
	public WebElement loginButtonWithHow;

	@FindBy(id = "join_now")
	public WebElement joinNowLink;

	@FindBy(xpath = "//*[contains(@class,'forgot-password')]")
	public WebElement forgotPasswordLink;

	@FindBy(id = "error-for-password")
	public WebElement passwordErrorMessage;

	@FindBy(id = "error-for-username")
	public WebElement userNameErrorMessage;

	public LinkedInLoginPage() {
		PageFactory.initElements(driver, this);
	}

}
