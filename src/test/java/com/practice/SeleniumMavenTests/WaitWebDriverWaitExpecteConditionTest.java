package com.practice.SeleniumMavenTests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.practice.Interview.helper.TestBase;

public class WaitWebDriverWaitExpecteConditionTest extends TestBase {

	@Test
	public void testRightClick() throws InterruptedException {
		startBrowser();
		driver.get("https://www.linkedin.com/login");
		WebDriverWait webDriverWait = new WebDriverWait(driver, 20);
		webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));
		webDriverWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("join_now"))));
		driver.quit();
	}
}
