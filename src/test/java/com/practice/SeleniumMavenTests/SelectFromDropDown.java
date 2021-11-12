package com.practice.SeleniumMavenTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.practice.Interview.helper.TestBase;

public class SelectFromDropDown extends TestBase {

	@Test
	private void selectFromDropDown() throws InterruptedException {
		startBrowser();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement skillsDropDown = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select sel = new Select(skillsDropDown);
		sel.selectByIndex(5);
		Thread.sleep(500);
		Assert.assertEquals(sel.getAllSelectedOptions().get(0).getText(), "APIs");
		sel.selectByValue("Analytics");
		Thread.sleep(500);
		Assert.assertEquals(sel.getAllSelectedOptions().get(0).getText(), "Analytics");
		sel.selectByVisibleText("Content Managment");
		Thread.sleep(500);
		Assert.assertEquals(sel.getAllSelectedOptions().get(0).getText(), "Content Managment");
	}

}
