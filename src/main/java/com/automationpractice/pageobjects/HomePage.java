package com.automationpractice.pageobjects;

import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void gotoURL(String url) {
		driver.get(url);
	}
}
