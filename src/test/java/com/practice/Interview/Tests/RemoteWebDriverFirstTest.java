package com.practice.Interview.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.practice.Interview.pages.FacebookLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;




public class RemoteWebDriverFirstTest {
	RemoteWebDriver driver;
//	@BeforeMethod
//	private void beforeMethod()	{
//		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability("os", "Windows");
//		cap.setCapability("os_version", "10");
//		cap.setCapability("browser", "Chrome");
//		cap.setCapability("browser_version", "95");
//		cap.setCapability("name", "My First Test");
//		try {
//			driver = new RemoteWebDriver(new URL("https://santappa:x53sddsse@hub-cloud.browserstack.com/wd/hub"), cap);
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//
//	}
	
	@Test
	public void startRemoteWebDriver() {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pallavi\\Desktop\\Java\\Selenium\\Drivers\\chromedriver.exe");
//		RemoteWebDriver driver = new ChromeDriver();
//		driver.
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		FacebookLoginPage fb = new FacebookLoginPage(driver);
		driver.get("https://www.facebook.com/");
		fb.username.sendKeys("Test");
		fb.passwrod.sendKeys("password");
		driver.quit();
//		driver.findElement(By.id("email")).sendKeys("Test");
//		driver.findElement(By.id("pass")).sendKeys("pass");
		
	}
}
