package com.practice.Interview.util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotUtil {
	WebDriver driver;

	public ScreenShotUtil(WebDriver driver) {
		this.driver = driver;
	}

	public void takeScreenShot(String fileName) throws IOException {
		// 1. Take a screenshot and store it as file format
		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// 2. Copy the screenshot to the desired location using copy file method.
		File destFile = new File(
				System.getProperty("user.dir") + "\\src\\test\\java\\com\\practice\\Interview\\" + fileName + ".png");
		FileHandler.copy(srcfile, destFile);
	}
}
