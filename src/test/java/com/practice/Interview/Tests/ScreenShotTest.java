package com.practice.Interview.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.practice.Interview.helper.TestBase;
import com.practice.Interview.util.ScreenShotUtil;

public class ScreenShotTest extends TestBase{

	@Test
	public void testTakeScreenShot() throws IOException	{
		WebDriver driver = startBrowser();
		driver.get("https://www.facebook.com/");
		new ScreenShotUtil(driver).takeScreenShot("facebookScreenshot");
	}
}
