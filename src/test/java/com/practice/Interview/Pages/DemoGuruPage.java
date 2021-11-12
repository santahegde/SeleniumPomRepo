package com.practice.Interview.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.practice.Interview.helper.TestBase;

public class DemoGuruPage extends TestBase {

	@FindBy(xpath = "//button[contains(text(),'Double-Click Me')]")
	public WebElement doubleClickMeButton;

	@FindBy(xpath = "//span[text()='right click me']")
	public WebElement rightClickMeButton;

	@FindBy(xpath = "//ul[contains(@class,'context-menu-list')]")
	public WebElement rightClickMenu;
	
	@FindBy(xpath = "//ul[contains(@class,'context-menu-list')]//li[1]")
	public WebElement editItemInList;
	

	public DemoGuruPage() {
		PageFactory.initElements(driver, this);
	}

}
