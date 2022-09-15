package com.automationpractice.tests;

import org.testng.annotations.Test;

import com.automationpractice.pageobjects.HeaderPage;
import com.automationpractice.pageobjects.HomePage;

public class SearchTest extends BaseTest {

	@Test(groups = {"Sanity", "Regression"})
	public void withSearchTerm() {
		HomePage home = new HomePage(driver);
		HeaderPage header = new HeaderPage(driver);
		
		//Goto url
		home.gotoURL("http://automationpractice.com/index.php");
		header.search("test");
	}

	@Test(groups = "Regression")
	public void withoutSearchTerm() {
		HomePage home = new HomePage(driver);
		HeaderPage header = new HeaderPage(driver);
		
		//Goto url
		home.gotoURL("http://automationpractice.com/index.php");
		header.search("");
	}
}
