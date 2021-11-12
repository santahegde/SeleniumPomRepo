package com.practice.Interview.helper;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.practice.Interview.util.ConfigUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static String browser = "Firefox";
	public static WebDriver driver;
	public static String baseUrl;
	
	@Parameters({"browser", "env"})
	@BeforeMethod(groups= {"Login"})
	public void beforeTest(@Optional("Chrome")String browser, @Optional("Production")String env)	{
		System.out.println("********Browser " + browser + "********** Enviornment" + env);
		System.out.println("Setup : BrowserName : " + browser + "Environment : " + env);
		ConfigUtil configUtil = new ConfigUtil();
		
		Properties properties = configUtil.setProperties(env);
		TestBase.browser =  browser.equals("unknown") ? properties.getProperty("browser") : browser;
		
		System.out.println("Browser name = " + browser);
		baseUrl = properties.getProperty("baseUrl");
	}

	public WebDriver startBrowser()	{
		switch(browser.toLowerCase()) {
		case "chrome" : 
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Pallavi\\Desktop\\Java\\Selenium\\Drivers\\chromedriver.exe");
//			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox" :
//			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Pallavi\\Desktop\\Java\\Selenium\\Drivers\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "ie":
//			System.setProperty("webdriver.ie.driver", "C:\\Users\\Pallavi\\Desktop\\Java\\Selenium\\Drivers\\IEDriverServer.exe");
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		default :
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pallavi\\Desktop\\Java\\Selenium\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}	
	
	@AfterMethod(groups= {"Login"})
	public void afterMethod() {
		driver.quit();
	}
}
