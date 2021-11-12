package com.practice.Interview.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.practice.Interview.helper.TestBase;

public class DemoQaPage extends TestBase {

	@FindBy(id = "draggable")
	public WebElement draggable;

	@FindBy(id = "droppable")
	public WebElement droppable;

	@FindBy(xpath = "//p[contains(text(),\"Dropped!\")]")
	public WebElement droppedXpath;

	public DemoQaPage() {
		PageFactory.initElements(driver, this);
	}

}
