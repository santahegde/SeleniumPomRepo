package com.practice.Interview.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage	{
	// Adde 3 set of element declaration with and without How using @FindBy
	@FindBy(id = "email")
	public WebElement username;

	@FindBy(id = "pass")
	public WebElement passwrod;

	public FacebookLoginPage(RemoteWebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
