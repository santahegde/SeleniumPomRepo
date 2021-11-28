package com.practice.Interview.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.practice.Interview.helper.LoginHelper;
import com.practice.Interview.helper.TestBase;

public class LinkedLoginTest extends TestBase {
	@Test(groups= {"Login", "Sessions", "AssociatedIdentity", "Challenge"})
	private void testLinkedInWithWrongPassword()  {
		System.out.println("********Starting Test**************");
		driver = startBrowser();
		LoginHelper loginHelper = new LoginHelper();
		loginHelper.loginWithUserNameAndPassword();
		driver.navigate ().refresh ();
		Assert.assertEquals(driver.getTitle(), "LinkedIn Login, Sign in | LinkedIn");
	}
	
	@Test(groups= {"Login", "Sessions", "AssociatedIdentity", "Challenge"})
	private void testLogin()	{
		driver= startBrowser();
		Assert.assertEquals(1, 1);
	}
}
