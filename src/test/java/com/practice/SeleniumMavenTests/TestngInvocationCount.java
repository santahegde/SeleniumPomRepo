package com.practice.SeleniumMavenTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngInvocationCount {

	@Test(invocationCount = 2)
	private void testRadioButton() throws InterruptedException {
		System.out.println("Testng-InvocationCount : Radio button test is getting executed");
	}

}
