package com.practice.Interview.Tests.actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.practice.Interview.constants.PageText;
import com.practice.Interview.helper.TestBase;
import com.practice.Interview.pages.DemoGuruPage;

public class QaActionVariousClickTest extends TestBase {

	@Test
	private void rightClick() {
		startBrowser();
		DemoGuruPage demoGuruPage = new DemoGuruPage();
		Actions actions = new Actions(driver);
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		actions.contextClick(demoGuruPage.rightClickMeButton).perform();
		Assert.assertTrue(demoGuruPage.rightClickMenu.isDisplayed());
		Assert.assertEquals(demoGuruPage.editItemInList.getText(), "Edit");
		actions.moveToElement(demoGuruPage.editItemInList).click().perform();
		verifyAlertAndCheckText(PageText.PAGE_GURU99_RIGHT_CLICK_EDIT);
	}

	@Test
	private void doubleClickAndCheckAlert() {
		startBrowser();
		DemoGuruPage demoGuruPage = new DemoGuruPage();
		Actions actions = new Actions(driver);
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		actions.doubleClick(demoGuruPage.doubleClickMeButton).perform();
		verifyAlertAndCheckText(PageText.PAGE_GURU99_ALERT_TEXT_DOUBLE_CLICK);
	}

	private void verifyAlertAndCheckText(String alertText) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals(alert.getText(), alertText);
		alert.accept();
	}

}
