package com.automationpractice.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.pageobjects.HeaderPage;
import com.automationpractice.pageobjects.HomePage;
import com.automationpractice.pageobjects.LoginRegisterPage;
import com.automationpractice.pageobjects.Utils;

public class LoginTest extends BaseTest {

	@Test(groups = {"Sanity", "Regression"})
	public void validCredentialsTest() {
		HomePage home = new HomePage(driver);
		HeaderPage header = new HeaderPage(driver);
		LoginRegisterPage loginRegister = new LoginRegisterPage(driver);
		Utils util = new Utils(driver);

		//Goto url
		home.gotoURL("http://automationpractice.com/index.php");

		//Click on signin link
		header.clickonSigninLink();

		//Enter username
		//Enter password
		//click on sign in button
		loginRegister.login("testuser54354@test.com", "Test@123");

		//Verify that title is equals to My account - My Store
		Assert.assertEquals(util.getTitle(), "My account - My Store");
	}

	@Test(groups = "Regression")
	public void invalidCredentialsTest() {
		HomePage home = new HomePage(driver);
		HeaderPage header = new HeaderPage(driver);
		LoginRegisterPage loginRegister = new LoginRegisterPage(driver);

		//Goto url
		home.gotoURL("http://automationpractice.com/index.php");

		//Click on signin link
		header.clickonSigninLink();

		//Enter username
		//Enter password
		//click on sign in button
		loginRegister.login("testuser51231231@test.com", "Test@123123");

		//Verify error message "Authentication failed."
		Assert.assertEquals(loginRegister.authenticationErrorMessage(), "Authentication failed.");
	}	
}
