package com.practice.Interview.tests.actions;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.practice.Interview.constants.Urls;
import com.practice.Interview.helper.TestBase;
import com.practice.Interview.pages.DemoQaPage;

public class QaDemoDragAndDrop extends TestBase	{
	
	@Test
	private void dragAndDropOnElement()	{
		startBrowser();
		DemoQaPage qaDemoQaPage = new DemoQaPage();
		driver.get(Urls.QA_DRAG_AND_DROP_URL);
		Actions actions = new Actions(driver);
		actions.dragAndDrop(qaDemoQaPage.draggable, qaDemoQaPage.droppable).perform();
		Assert.assertTrue(qaDemoQaPage.droppedXpath.isDisplayed());
	}
	
	
	@Test
	private void dragAndDropOnElemenUsingMoveToElementt()	{
		startBrowser();
		DemoQaPage qaDemoQaPage = new DemoQaPage();
		driver.get(Urls.QA_DRAG_AND_DROP_URL);
		Actions actions = new Actions(driver);
		actions.dragAndDrop(qaDemoQaPage.draggable, qaDemoQaPage.droppable).perform();
		actions.clickAndHold(qaDemoQaPage.draggable).moveToElement(qaDemoQaPage.droppable).release().perform();
		Assert.assertTrue(qaDemoQaPage.droppedXpath.isDisplayed());
	}

}
