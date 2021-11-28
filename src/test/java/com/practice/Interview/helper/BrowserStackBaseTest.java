package com.practice.Interview.helper;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserStackBaseTest {
	/*
	 * TO_DO : ******* DONT COMMIT ANY OF THIS CODE BELOW THREE VARIABLES ARE NOT
	 * YET CREATED IN BROWSER STACK DATABASE, ONCE YOU CREATE ANY ACCOUNT YOU CAN
	 * REDEFINE THESE VARIABLES AND VERIFY SAMPLE TEST ****
	 */

	public static RemoteWebDriver driver;
	public static final String USER_NAME = "testname";
	public static final String AUTOMATION_KEY = "testkey";
	public static final String URL = "https://" + USER_NAME + ":" + AUTOMATION_KEY
			+ "@hub-cloud.browserstack.com/wd/hub";

	@Parameters({ "browser", "browser_version", "os", "os_version" })
	@BeforeMethod
	private void beforeMethod(String browserName, String browserVersion, String os, String osVersion, Method name) {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("os", os);
		cap.setCapability("os_version", osVersion);
		cap.setCapability("browser_version", browserVersion);
		cap.setCapability("name", name.getName());
		
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			cap.setCapability("browser", "Chrome");
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			cap.setCapability("browser", "Firefox");
		}

		try {
			driver = new RemoteWebDriver(new URL(URL), cap);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
