package com.practice.SeleniumMavenTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ToDoCheckBoxOptionTest extends BaseTest	{
	WebDriver driver;
	

	@Test
	private void testCheckBoxSelection()	{
		WebDriver driver = getWebDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement radio1, radio2, radio3, checkbox1, checkbox2, checkbox3;
		radio1 = driver.findElement(By.id("vfb-7-1"));
		radio2 = driver.findElement(By.id("vfb-7-2"));
		radio3 = driver.findElement(By.id("vfb-7-3"));
		checkbox1 = driver.findElement(By.id("vfb-6-0"));
		checkbox1 = driver.findElement(By.id("vfb-6-1"));
		checkbox1 = driver.findElement(By.id("vfb-6-2"));
		driver.quit();
	}
	
}
