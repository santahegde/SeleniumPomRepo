package com.practice.Interview.tests;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.practice.Interview.helper.TestBase;

public class WebTableTest extends TestBase {

	@Test
	private void testLinkedInWithWrongPassword() {
		driver = startBrowser();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		List<WebElement> tableRows = driver.findElements((By.xpath("//table[@class='dataTable']//tr")));
		System.out.println("No of table rows " + tableRows.size());
		List<WebElement> tableColumns = driver.findElements((By.xpath("//table[@class='dataTable']//tbody/tr[1]//td")));
		System.out.println("No of table column " + tableColumns.size());

	}
}
