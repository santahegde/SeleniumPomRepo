package com.practice.SeleniumMavenTests.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public void mouseOver(WebDriver driver, WebElement webElelement)	{
		Actions action = new Actions(driver);
		action.moveToElement(webElelement);
	
	
	}
	
	public void dragAndDrop(WebDriver driver, String source, String target)	{
		WebElement webElem1 = driver.findElement(By.id("element1"));
		WebElement webElem2 = driver.findElement(By.id("element2"));

		
		Actions actions = new Actions(driver);
		actions.moveToElement(webElem1).contextClick().build().perform();
		actions.keyUp(Keys.ESCAPE).build().perform();
		actions.moveToElement(webElem1).click().moveToElement(webElem2).release().build().perform();
		actions.click(webElem1).moveToElement(webElem2).release().build().perform();
		actions.dragAndDrop(webElem1, webElem2).perform();
		actions.clickAndHold(webElem1).moveToElement(webElem2).release().build().perform();	
	}
}
